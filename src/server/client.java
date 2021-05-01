/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Aslam Javed
 */
public class client {
    public static void main(String[] args) {
        try{
            
            Socket s = new Socket("localhost", 6666);
            
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            dout.writeUTF("Hello Usama");
            
            dout.flush();
            dout.close();
            s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
