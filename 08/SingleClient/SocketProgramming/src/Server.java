import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(4321);
            Socket clientSocket=serverSocket.accept();
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
            Scanner scanner = new Scanner(inputStream);
            String message, messages = "";
            while (true) {
                message = scanner.nextLine();
                if (message.length() > 2)
                    message = message.substring(2);
                if (message.equalsIgnoreCase("OVER"))
                    break;
                messages += message + "\n";
            }
            outputStream.writeUTF(messages);
            clientSocket.close();
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}