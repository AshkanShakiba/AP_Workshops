import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(4321);
            while(true){
                Socket clientSocket=serverSocket.accept();
                System.out.println("Client accepted from "+clientSocket);
                Thread thread = new Thread(new Handler(clientSocket), "Handler thread");
                thread.start();
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}