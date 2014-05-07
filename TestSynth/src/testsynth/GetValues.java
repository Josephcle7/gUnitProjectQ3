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
public interface GetValues {
    
    public int increaseFreq() ;
    
    public int decreaseFreq() ;
    
    public double increaseAmp() ;
    
    public double decreaseAmp() ;
    
    public int getFreq() ;
    
    public double getAmp() ;
    
    public long increaseFilterCutoff() ;
    
    public long decreaseFilterCutoff() ;
}
