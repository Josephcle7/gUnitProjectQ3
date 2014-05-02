/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsynth;

/**
 *
 * @author Josh
 */
public class Values implements GetValues {
    
    public int freq = 440 ;
    public double amp = 0.5 ;
    
    
    public int increaseFreq() {
        freq = freq + 10 ;
        return freq ;
        
    }
    
    public int decreaseFreq() {
        freq = freq - 10 ;
        return freq ;
    }
    
    public double increaseAmp() {
        amp = amp + 0.1 ;
        return amp ;
    }
    
    public double decreaseAmp() {
        amp = amp - 0.1 ;
        return amp ;
    }
    
    public int getFreq() {
        return freq ;
    }
    
    public double getAmp() {
        return amp ;
    }
}
