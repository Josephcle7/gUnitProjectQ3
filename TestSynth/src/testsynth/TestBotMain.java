/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsynth;

import org.jibble.pircbot.* ;
import javax.swing.JApplet;
import javax.swing.JPanel;

/**
 *
 * @author Josh
 */
public class TestBotMain extends JApplet{
    
    public void start() {
        try {
            mainFunction() ;
        } catch (Exception e) {
            
        }
    }
    
    public static void mainFunction() throws Exception {
        
        TestSynth bot = new TestSynth() ;
        
        bot.connect("irc.freenode.net");
        
        bot.joinChannel("#csf") ;
        
        
        
    }
}
