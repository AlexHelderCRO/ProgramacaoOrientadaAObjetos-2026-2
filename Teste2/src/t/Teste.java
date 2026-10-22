package t;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
        try {
            Socket connectToServer = new Socket("www.ifb.edu.br", 80);
            BufferedReader isFromServer = new BufferedReader(new InputStreamReader(connectToServer.getInputStream()));
            PrintWriter osToServer = new PrintWriter(connectToServer.getOutputStream(), true);
            MinhaThread t = new MinhaThread(isFromServer);
            t.start();
            while (true) {
                String texto = "GET /api/v1/usuarios?status=ativo HTTP/1.1 Host: www.google.com User-Agent: Mozilla/5.0 Accept: application/json";
                osToServer.println(texto);
//                JOptionPane.showMessageDialog(null, isFromServer.readLine());
                Thread.sleep(1000);
            }
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch(InterruptedException e) {
        }
	}
}
class MinhaThread extends Thread {
	BufferedReader isFromServer;
	public MinhaThread(BufferedReader isFromServer) {
		this.isFromServer = isFromServer;
	}
	public void run() {
		int i = 0;
		while(100 > i++) {
			try {
				System.out.println(isFromServer.readLine());
	        } catch(IOException ioe) {
	            System.out.println(ioe.getMessage());
	        }
		}
	}
}
