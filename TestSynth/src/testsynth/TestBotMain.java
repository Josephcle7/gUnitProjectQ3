/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsynth;

import org.jibble.pircbot.* ;

/**
 *
 * @author Josh
 */
public class TestBotMain {
    
    public static void main(String[] args) throws Exception {
        
        TestSynth bot = new TestSynth() ;
        
        bot.connect("irc.freenode.net");
        
        bot.joinChannel("#csf") ;
        
        
        
    }
}
