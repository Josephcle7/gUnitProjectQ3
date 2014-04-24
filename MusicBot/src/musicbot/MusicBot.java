/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicbot;
import musicbot.Synth ;
import org.jibble.pircbot.* ;
/**
 *
 * @author Josh
 */
public class MusicBot extends PircBot {


    public MusicBot() {
        this.setName("MusicBot") ;
        // TODO code application logic here
    }
    
    @Override
    public void onMessage (String channel, String sender, String login, String
            hostname, String message) {


        if(message.equalsIgnoreCase(":start")) {
            String time = new java.util.Date().toString() ;
            sendMessage(channel, sender + ": The time is now " + time) ;
            
            Synth synth = new Synth() ;
            synth.start() ;
            
        }
        else if(message.equalsIgnoreCase(":stop")) {
            synth.stop() ;
            

        }
        else if(message.equalsIgnoreCase(":time")) {
            sendMessage(channel, "hahahaha I won't tell you...") ;
        }
        
        else {
            sendMessage(channel, "THIS IS NOT THE TIME TO USE THAT YET") ;
        }
    }
}
