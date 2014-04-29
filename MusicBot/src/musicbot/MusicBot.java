package musicbot;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.jibble.pircbot.PircBot;
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
        Synth synth1 = new Synth() ;
        if(message.equalsIgnoreCase(":start")) {
            String time = new java.util.Date().toString() ;
            sendMessage(channel, sender + ": The time is now " + time) ;
            
            synth1.openSynth() ;
            
        }
        else if(message.equalsIgnoreCase(":stop")) {
        	sendMessage(channel, "Attempting to stop");
            synth1.stop();
            

        }
        else if(message.equalsIgnoreCase(":time")) {
            sendMessage(channel, "hahahaha I won't tell you...") ;
        }
        
        else {
            sendMessage(channel, "THIS IS NOT THE TIME TO USE THAT YET") ;
        }
    }
}
