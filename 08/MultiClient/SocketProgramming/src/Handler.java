import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

class Handler implements Runnable {
    private Socket socket;

    Handler(Socket socket) {
        this.socket=socket;
    }

    public void run() {
        try {
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
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
            socket.close();
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}