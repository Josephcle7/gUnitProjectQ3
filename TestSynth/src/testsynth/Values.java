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
        if(freq < 22000) {
            freq = (freq*3)/2 ;
            return freq ;
        }
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
        if(amp < 10.0) {
            amp = amp + 0.1 ;
            return amp ;
        }
        return amp ;
    }
    
    public double decreaseAmp() {
        if(amp > 0.1) {
            amp = amp - 0.1 ;
            return amp ;
        }
        return amp ;
    }
    
    public int getFreq() {
        return freq ;
    }
    
    
    public double getAmp() {
        return amp ;
    }
    
    public long increaseFilterCutoff() {
        if(cutoffFreq < 10000) {
            cutoffFreq = cutoffFreq + 500 ;
            return cutoffFreq ;
        }
        return cutoffFreq ;
    }
    
    public long decreaseFilterCutoff() {
        if(cutoffFreq > 10) {
            cutoffFreq = cutoffFreq - 500 ;
            return cutoffFreq ;
        }
        return cutoffFreq ;
    }
}
