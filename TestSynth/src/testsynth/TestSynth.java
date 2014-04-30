/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsynth;
import testsynth.Synth ;
import org.jibble.pircbot.* ;
/**
 *
 * @author Josh
 */
public class TestSynth extends PircBot {


    public TestSynth() {
        this.setName("CaseysMom") ;
        // TODO code application logic here
    }
    
    @Override
    public void onMessage (String channel, String sender, String login, String
            hostname, String message) {
        
        
        Synth musicBot = new Synth() ;
        
        
        if(message.equalsIgnoreCase(":start")) {
            String time = new java.util.Date().toString() ;
            sendMessage(channel, sender + ": The time is now " + time) ;
            
            musicBot.start() ;
            
            System.out.println("Starting...") ;
            
        }
        
        
        else if(message.equalsIgnoreCase(":stop")) {
            System.out.println("stopping...") ;
            
            musicBot.quit() ;
            
        
        }
        else if(message.equalsIgnoreCase(":increase")) {
            musicBot.increase() ;
        }
        else if(message.equalsIgnoreCase(":run")) {
            musicBot.run() ;
            System.out.println("running...") ;
        }
        
        else if(message.equalsIgnoreCase(":time")) {
            sendMessage(channel, "hahahaha I won't tell you...") ;
        }
        
        else {
            sendMessage(channel, "THIS IS NOT THE TIME TO USE THAT YET") ;
        }
    }
}