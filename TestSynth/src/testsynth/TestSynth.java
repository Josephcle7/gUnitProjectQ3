/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsynth;
import testsynth.MySynth ;
import org.jibble.pircbot.* ;
/**
 *
 * @author Josh
 */
public class TestSynth extends PircBot {

    StringReader send = new StringReader() ;
    
    public TestSynth() {
        this.setName("BoxBox2") ;
        // TODO code application logic here
    }
    
    @Override
    public void onMessage (String channel, String sender, String login, String
            hostname, String message) {
        

        String input = message ;
        String[] splitString = input.split(":|\\(|\\)") ;
        send.readString(splitString) ;
        
        
        
        
        
        
        
        /*
        if(message.equalsIgnoreCase(":start")) {
            String time = new java.util.Date().toString() ;
            sendMessage(channel, sender + ": The time is now " + time) ;
            
            MySynth.start() ;
            
            System.out.println("Starting...") ;
            
        }
        
        
        else if(message.equalsIgnoreCase(":stop")) {
            System.out.println("stopping...") ;
            
            MySynth.stop() ;
           
        }
        
        else if(message.equalsIgnoreCase(":cutoffIncrease") ) {
            MySynth.inFilterCut() ;
        }
        else if(message.equalsIgnoreCase(":cutoffDecrease")) {
            MySynth.deFilterCut() ;
        }
        
        else if(message.equalsIgnoreCase(":filterOn")) {
            MySynth.startFilter() ;
        }
        
        else if(message.equalsIgnoreCase(":filterOff")) {
            MySynth.stopFilter() ;
        }
        else if(message.equalsIgnoreCase(":Fincrease")) {
            MySynth.increase() ;
        }
        else if(message.equalsIgnoreCase(":Fdecrease")) {
            MySynth.decrease() ;
        }
        else if(message.equalsIgnoreCase(":run")) {
            //musicBot.run() ;
            System.out.println("running...") ;
        }
        
        else if(message.equalsIgnoreCase(":time")) {
            sendMessage(channel, "hahahaha I won't tell you...") ;
        }
        
        else {
            sendMessage(channel, "THIS IS NOT THE TIME TO USE THAT YET") ;
        }*/
    }
}
