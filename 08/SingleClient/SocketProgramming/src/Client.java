import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        try {
            Socket socket=new Socket("127.0.0.1",4321);
            DataInputStream inputStream=new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream=new DataOutputStream(socket.getOutputStream());
            Scanner socketScanner=new Scanner(inputStream);
            Scanner consoleScanner=new Scanner(System.in);
            String message,messages="";
            while (true){
                message=consoleScanner.nextLine();
                outputStream.writeUTF(message+"\n");
                if(message.equalsIgnoreCase("OVER")) break;
            }
            while(socketScanner.hasNext()){
                messages+=socketScanner.next()+"\n";
            }
            if(messages.length()>2)
                messages=messages.substring(2);
            System.out.println(messages);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}