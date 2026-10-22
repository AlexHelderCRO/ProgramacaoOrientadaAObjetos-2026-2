package t;
import java.io.*;
import java.net.*;


public class Servidor {
    
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            Socket connectToClient = serverSocket.accept();
            BufferedReader isFromCliente = new BufferedReader(new InputStreamReader(connectToClient.getInputStream()));
            PrintWriter osToClient = new PrintWriter(connectToClient.getOutputStream(), true);
            int i = 0;
            while (true) {
                System.out.println(isFromCliente.readLine());
                osToClient.println("Servidor recebeu a mensagem "+ ++i);
            }
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
    
}
