package testsynth;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
import java.util.LinkedList;
import java.util.Queue;

public class StringReader {
    
    Queue<String> instructions = new LinkedList<String>() ;


    public void readString(String[] commands) {
        

        
        for(String s: commands) {
            System.out.println(s) ;
            instructions.offer(s) ;
        }
        /*for(Object s: instructions) {
            System.out.println(s) ;
        }*/
        
        while(instructions.element().equals(""))
            instructions.remove() ;
        
        System.out.println(instructions.element());
              
        
        if(instructions.element().equals("on")) {
            instructions.remove() ;
            MySynth.start() ;
               
        }
        
        
        else if(instructions.element().equals("off")) {
            instructions.remove() ;
            MySynth.stop() ;
                
        }
        
        else if(instructions.element().equals("freq")) {
            instructions.remove() ;
            
            if(instructions.element().equals("increase")) {
                instructions.remove() ;
                MySynth.increase() ;
                //instructions.remove() ;
            }
            
            else if(instructions.element().equals("decrease")) {
                instructions.remove() ;
                MySynth.decrease() ;
            }
            
        }
        
        else if(instructions.element().equals("filter")) {
            instructions.remove() ;
            
            if(instructions.element().equals("on")) {
                instructions.remove() ;
                MySynth.startFilter() ;
            }
            
            else if(instructions.element().equals("off")) {
                instructions.remove() ;
                MySynth.stopFilter() ;
            }
            
                
            else if(instructions.element().equals("increase")) {
                instructions.remove() ;
                MySynth.inFilterCut() ;
            }

            else if(instructions.element().equals("decrease")) {
                instructions.remove() ;
                MySynth.deFilterCut() ;
            }
        
            
            else if(instructions.element().equals("resonance")) {
                instructions.remove() ;
                
                if(instructions.element().equals("increase")) {
                    
                }
                else if(instructions.element().equals("decrease")) {
                    
                }
            }
            
            
        }
        else {
            instructions.removeAll(instructions) ;
            System.out.println("hit rock bottom") ;
        }
    }
}
