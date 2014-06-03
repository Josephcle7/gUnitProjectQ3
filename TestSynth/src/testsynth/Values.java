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
    public long cutoffFreq = 1000 ;
    public double resonance = 1.0 ;

    
    
    public int increaseFreq() {
        if(freq < 22000) {
            freq = (freq*3)/2 ;
            return freq ;
        }
        return freq ;        
    }
    
    public int decreaseFreq() {
        if(freq > 0) {
            freq = (freq*2)/3 ;
            return freq ;
        }
        return freq ;
    }
    
    
    public int getFreq() {
        return freq ;
    }
    
    
    public double getAmp() {
        return amp ;
    }
    
    public double increaseAmplitude() {
        if(amp <= 1.0) {
            amp = amp + 0.1 ;
            return amp ;
        }
        return amp ;
    }
    
    public double decreaseAmplitude() {
        if(amp > 0.0) {
            amp = amp - 0.1 ;
            return amp ;
        }
        return amp ;
    }
    
    public long getCutoffFreq() {
        return cutoffFreq ;
    }
    
    public long increaseFilterCutoff() {
        if(cutoffFreq < 10000) {
            
            cutoffFreq = (cutoffFreq * 3) / 2 ;
            return cutoffFreq ;
        }
        return cutoffFreq ;
    }
    
    public long decreaseFilterCutoff() {
        if(cutoffFreq > 0) {
            
            cutoffFreq = (cutoffFreq * 2) / 3 ;
            return cutoffFreq ;
        }
        return cutoffFreq ;
    }
    
    public double getRes() {
        return resonance ;
    }
    public double increaseRes() {
        resonance = resonance + 0.5 ;
        System.out.println(resonance) ;
        return resonance ;

    }
    
    public double decreaseRes() {
        if(resonance > 0.0) {
            resonance = resonance - 0.5 ;
            System.out.println(resonance) ;
            return resonance ;
        }
        return resonance ;
    }
}
