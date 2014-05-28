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
    
    public int freq = 110 ;
    public double amp = 0.5 ;
    public long cutoffFreq = 10000 ;
    
    
    public int increaseFreq() {
        //if(freq < 22000)
        freq = (freq*3)/2 ;
        return freq ;
        
    }
    
    public int decreaseFreq() {
        if(freq > 110) {
            freq = (freq*2)/3 ;
            return freq ;
        }
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
    
    public long increaseFilterCutoff() {
        cutoffFreq = cutoffFreq + 500 ;
        return cutoffFreq ;
    }
    
    public long decreaseFilterCutoff() {
        cutoffFreq = cutoffFreq - 500 ;
        return cutoffFreq ;
    }
}
