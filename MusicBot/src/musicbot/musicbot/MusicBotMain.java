/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicbot;

import org.jibble.pircbot.* ;

/**
 *
 * @author Josh
 */
public class MusicBotMain {
    
    public static void main(String[] args) throws Exception {
        
        MusicBot bot = new MusicBot() ;
        
        bot.connect("irc.freenode.net");
        
        bot.joinChannel("#csf") ;
        
        
        
    }
}
