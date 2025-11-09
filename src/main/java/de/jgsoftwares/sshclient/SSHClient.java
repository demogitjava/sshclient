package de.jgsoftwares.sshclient;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;



// export as runnable jar from Spring ToolSuite 
/**
 *
 * @author hoscho
 */
public class SSHClient
{

    
    String stuser = null;
    String stconnect = null;
    String stpassword = null;
    
  
    public static void main(String[] args) 
    {
    
        SSHClient sshclient = new SSHClient();          
        
      
        
    }   
    
    
    public SSHClient()
    {
        
        
          JFrame frame = new JFrame("SSH connect");

          de.jgsoftwares.sshclient.NewJPanel jpanel = new de.jgsoftwares.sshclient.NewJPanel();
          frame.add(jpanel);
          
         
          frame.setVisible(true);
          frame.pack();
    }
    
    
    
       
    
    

    
}
