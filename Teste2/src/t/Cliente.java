package t;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Cliente {
    
    public static void main(String[] args) {
        try {
            Socket connectToServer = new Socket("localhost", 8000);
            BufferedReader isFromServer = new BufferedReader(new InputStreamReader(connectToServer.getInputStream()));
            PrintWriter osToServer = new PrintWriter(connectToServer.getOutputStream(), true);
            while (true) {
                String texto = JOptionPane.showInputDialog("Digite qualquer coisa.");
                osToServer.println(texto);
                JOptionPane.showMessageDialog(null, isFromServer.readLine());
            }
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
