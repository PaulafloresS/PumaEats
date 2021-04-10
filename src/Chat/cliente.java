/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author estre
 */
public class cliente implements Runnable {
    private final int puerto;
    private final String mensaje;
    
    public cliente(int puerto, String mensaje){
        this.puerto=puerto;
        this.mensaje=mensaje;
    }

    @Override
    public void run() {
        final String HOST="127.0.0.1";
        DataOutputStream out;
    
        try{
            Socket sc=new Socket(HOST,puerto);
            out=new DataOutputStream(sc.getOutputStream());
            out.writeUTF(mensaje);
            sc.close();
        
        } catch (IOException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
