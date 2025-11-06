package de.jgsoftwares.sshclient.sshclient;

import java.io.IOException;
import org.apache.sshd.client.SshClient;
import org.apache.sshd.client.channel.ClientChannel;
import org.apache.sshd.client.channel.ClientChannelEvent;
import org.apache.sshd.client.future.ConnectFuture;
import org.apache.sshd.client.session.ClientSession;
import org.apache.sshd.common.future.CancelOption;
import org.apache.sshd.common.util.io.input.NoCloseInputStream;
import org.apache.sshd.common.util.io.output.NoCloseOutputStream;

   
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author root
 */
public class SSHClient {

    
    String stuser = null;
    String stconnect = null;
    String stpassword = null;
    
   
    public static void main(String[] args) 
    {
        SSHClient sshclient = new SSHClient();
        SSHConnect sshconnect = new SSHConnect();
        sshconnect.setVisible(true);
        
        
    }      
       
    
    
    public void connectto() throws IOException 
    {
    
       
    }
    
}
