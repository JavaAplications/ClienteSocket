package hiloConectar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Conexion extends Thread{

	Socket socketclient ;
	BufferedReader entrada;
	BufferedWriter salida;
	
	
	public Conexion(){
		
		
		
		
	}
	
	
	public void run() {
		
				 
	        try {
	        	       	
	        	
	        	 entrada = new BufferedReader(new InputStreamReader(socketclient.getInputStream()));
	        	String	datos = entrada.readLine();
	        	     
	        	
	        
	          } catch (IOException ex) {
	            
	        }
	       
		}
		
		public void desconnectar() {
	        try {
	        	socketclient.close();
	        } catch (IOException ex) {
	           
	        }
	    }
		
	}




