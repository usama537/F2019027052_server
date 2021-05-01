/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Aslam Javed
 */
public class serverside {
    public static void main(String[] args)  {
        try {
            ServerSocket ss = new ServerSocket(786);
            
            System.out.println("Going to Establish connection \n\n\n");
            Socket s = ss.accept();//establishes connection   
            System.out.println(" Connection Established \n\n\n");
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= Hello" + str);
            
            ss.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
    
}
