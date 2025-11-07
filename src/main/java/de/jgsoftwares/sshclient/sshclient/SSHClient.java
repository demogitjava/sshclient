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

import org.apache.sshd.common.cipher.ChaCha20Cipher;
   
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.concurrent.TimeUnit;


import de.jgsoftwares.sshclient.sshclient.SSHConnect;
import java.util.Arrays;
import java.util.Collection;
import org.apache.sshd.common.cipher.BuiltinCiphers;
/**
 *
 * @author hoscho
 */
public class SSHClient {

    
    String stuser = null;
    String stconnect = null;
    String stpassword = null;
    
    
   
    public static void main(String[] args) 
    {
        //SSHClientminia sshmina = new SSHClientminia();
        org.apache.sshd.client.SshClient sshclient = new org.apache.sshd.client.SshClient();
        // chacha20 - cc20p1305_openssh 
        sshclient.setCipherFactories(Arrays.asList(BuiltinCiphers.cc20p1305_openssh));
      
        de.jgsoftwares.sshclient.sshclient.SSHConnect sshconnect = new de.jgsoftwares.sshclient.sshclient.SSHConnect();
        sshconnect.setVisible(true);
        
        
    }      
       
    
    

    
}
