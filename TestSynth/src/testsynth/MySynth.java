package testsynth ;


import com.jsyn.* ;
import com.jsyn.unitgen.* ;

import java.util.concurrent.TimeUnit;

//import testsynth.Values ;


public class MySynth extends Values
{
	private static final long serialVersionUID = -2704222221111608377L;
	public LineOut lineOut;
        public SawtoothOscillatorBL osc;
        public FilterLowPass lpFilter ;
        
        static MySynth mySynth ;
        
        Synthesizer synth = JSyn.createSynthesizer();

	MySynth()
	{
                System.out.println("initializing...") ;
		
                System.out.println("done initializing") ;
		
		// Add a tone generator.
		synth.add( osc = new SawtoothOscillatorBL() ) ;
                synth.add( lpFilter = new FilterLowPass() ) ;
                synth.add( lineOut = new LineOut() ) ;
                
                osc.output.connect(0, lineOut.input, 0) ;
                osc.output.connect(0, lineOut.input, 1) ;
                
                
                osc.frequency.set(getFreq());
                osc.amplitude.set(getAmp());
                
                
                System.out.println("added") ;
                
                
                
                System.out.println("connected") ;
                

                
                synth.start();
                //osc.start() ;
                synth.startUnit(osc) ;
                synth.startUnit(lineOut) ;
                //lineOut.start();

                
                System.out.println("start done") ;
                

	}
        
        public static void start() {
            mySynth = new MySynth() ;
            
        }
        public static void stop() {
            mySynth.quit() ;
        }
        public static void increase() {
            mySynth.increase1() ;
        }
        
        public static void decrease() {
            mySynth.decrease1() ;
        }
        
        public static void startFilter() {
            mySynth.filterOn() ;
            
        }
        
        public static void stopFilter() {
            mySynth.filterOff() ;
        }
        
        public static void inFilterCut() {
            mySynth.increaseCutoffFreq() ;
        }
        
        public static void deFilterCut() {
            mySynth.decreaseCutoffFreq() ;
        }
        public static void inRes() {
            mySynth.increaseResonance() ;
        }
        public static void deRes() {
            mySynth.decreaseResonance() ;
        }

        public void increase1() {
            osc.frequency.set(increaseFreq()) ;
        }
        
        public void decrease1() {
            osc.frequency.set(decreaseFreq()) ;
        }
        
        public void increaseCutoffFreq() {
            
            lpFilter.frequency.set(increaseFilterCutoff()) ;
        }
        
        public void decreaseCutoffFreq() {
            lpFilter.frequency.set(decreaseFilterCutoff() ) ;
        }
        
        public void increaseResonance() {
            lpFilter.Q.set(increaseRes() ) ;
        }
        public void decreaseResonance() {
            lpFilter.Q.set(decreaseRes() ) ;
        }
        public void filterOn() {
            osc.output.connect( lpFilter.input ) ;
            System.out.println("filter connected") ;
            lpFilter.frequency.set(getCutoffFreq()) ;
            lpFilter.Q.set(getRes() );
            lpFilter.output.connect(0, lineOut.input, 0);
            lpFilter.output.connect(0, lineOut.input, 1);
        
        }
        public void filterOff() {
            osc.output.disconnect( lpFilter.input ) ;
            System.out.println("filter connected") ;
            lpFilter.output.disconnect(0, lineOut.input, 0);
            lpFilter.output.disconnect(0, lineOut.input, 1);
            
            osc.output.connect(0, lineOut.input, 0) ;
            osc.output.connect(0, lineOut.input, 1) ;
        }
        
	public void run()
	{
		// Start synthesizer using default stereo output at 44100 Hz.
		
		// We only need to start the LineOut. It will pull data from the
		// oscillator.
                osc.start() ;
		lineOut.start();
                
                System.out.println("run done") ;
	}


	public void quit()
	{

            System.out.println("pass") ;
            osc.stop() ;
            lineOut.stop() ;
            //synth.stop() ;
                
                
            System.out.println("stop done") ;
	}
        
        public void filtCutoffIncrease() {
            
        }
        
        
	/* Can be run as either an application or as an applet. */
	public static void openSynth() 
	{
		MySynth applet = new MySynth();

	}
        
        /*public static void main(String[] args) {
            
            MySynth test = new MySynth() ;
            try {
                TimeUnit.SECONDS.sleep(5) ;
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            test.increase() ;
            
            try {
                TimeUnit.SECONDS.sleep(5) ;
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            test.quit() ;
            
            try {
                TimeUnit.SECONDS.sleep(5) ;
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            
            test.run() ;
            
            
            
            
            
        }*/

}