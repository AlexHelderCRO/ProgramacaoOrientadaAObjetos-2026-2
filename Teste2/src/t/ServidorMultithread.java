package t;
import java.io.*;
import java.net.*;


public class ServidorMultithread {
    
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            int i = 0;
            while (true) {
                Socket connectToClient = serverSocket.accept();
                System.out.println("Iniciando a thread "+ ++i);
                ServidorIndividual si = new ServidorIndividual(connectToClient, i);
                si.start();
            }
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
    
}

class ServidorIndividual extends Thread {
    Socket connectToClient;
    int count;
    
    public ServidorIndividual(Socket socket, int i) {
        connectToClient = socket;
        count = i;
    }
    
    public void run() {
        try {
            BufferedReader isFromCliente = new BufferedReader(new InputStreamReader(connectToClient.getInputStream()));
            PrintWriter osToClient = new PrintWriter(connectToClient.getOutputStream(), true);
            int i = 0;
            while(true) {
                System.out.println(isFromCliente.readLine());
                osToClient.println("Servidor recebeu a mensagem "+ ++i +" do cliente "+ count);
            }
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}