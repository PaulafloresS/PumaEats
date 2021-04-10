/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author estre
 */
public class servidor extends Observable implements Runnable {
    
    private final int puerto;
    
    public servidor(int puerto){
        this.puerto=puerto;   
    }
    
    @Override
    public void run() {
        
        ServerSocket servidor = null;
        Socket sc= null;
        DataInputStream in;

        try{
            
            servidor= new ServerSocket(puerto);
            System.out.println("Servidor iniciado");
            
            while(true){
                sc= servidor.accept();
                System.out.println("cliente conectado");
                in= new DataInputStream(sc.getInputStream());
                
                String mensaje=in.readUTF();
                System.out.println(mensaje);
                
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                
                sc.close();
                System.out.println("desconectado");
                
            }
        } catch (IOException ex) {
            Logger.getLogger(servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
}
