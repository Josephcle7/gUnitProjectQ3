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
import java.util.NoSuchElementException;
import java.util.Queue;

public class StringReader {
    
    Queue<String> instructions = new LinkedList<String>() ;


    public void readString(String botName, String[] commands) {
        

        
        for(String s: commands) {
            //System.out.println(s) ;
            instructions.offer(s) ;
        }
        /*for(Object s: instructions) {
            System.out.println(s) ;
        }*/
        
        while(instructions.element().equals(""))
            instructions.remove() ;
        
        //System.out.println(instructions.element());
        
        if(botName.equalsIgnoreCase(instructions.element())) {
            instructions.remove() ;
        
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
                    
                    int n ;
                    String iterator ;

                    try {
                        iterator = instructions.remove() ;
                    } catch (NoSuchElementException e) {
                        iterator = "1" ;
                    }
                
                    n = Integer.parseInt(iterator) ;
                    
                    for(int i = 0; i < n; i++) 
                        MySynth.increase() ;
                }

                else if(instructions.element().equals("decrease")) {
                    instructions.remove() ;
                    
                    int n ;
                    String iterator ;

                    try {
                        iterator = instructions.remove() ;
                    } catch (NoSuchElementException e) {
                        iterator = "1" ;
                    }
                
                    n = Integer.parseInt(iterator) ;
                    
                    for(int i = 0; i < n; i++) 
                        MySynth.decrease() ;
                    
                }

            }

            else if(instructions.element().equals("amp")) {
                instructions.remove() ;

                if(instructions.element().equals("increase")) {
                    instructions.remove() ;
                    MySynth.inAmp() ;
                }
                else if(instructions.element().equals("decrease")) {
                    instructions.remove() ;
                    MySynth.deAmp() ;
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

                else if(instructions.element().equals("cutoff")) {   
                    instructions.remove() ;

                    if (instructions.element().equals("increase")) {
                        instructions.remove() ;
                        MySynth.inFilterCut() ;
                    }

                    else if(instructions.element().equals("decrease")) {
                        instructions.remove() ;
                        MySynth.deFilterCut() ;
                    }
                }


                else if(instructions.element().equals("resonance")) {
                    instructions.remove() ;

                    if(instructions.element().equals("increase")) {
                        instructions.remove() ;
                        MySynth.inRes() ;

                    }
                    else if(instructions.element().equals("decrease")) {
                        instructions.remove() ;
                        MySynth.deRes() ;
                    }
                }

            }
            
        }
        else {
            instructions.removeAll(instructions) ;
            System.out.println("hit rock bottom") ;
        }
    }
}
