package testsynth ;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JPanel;

import com.jsyn.* ;
import com.jsyn.unitgen.* ;
import com.jsyn.swing.* ;
import java.util.concurrent.TimeUnit;


public class MySynth
{
	private static final long serialVersionUID = -2704222221111608377L;
	public LineOut lineOut;
        public SawtoothOscillatorBL osc;
        public FilterStateVariable filter ;
        
        static MySynth mySynth ;
        
        Synthesizer synth = JSyn.createSynthesizer();

	MySynth()
	{
                System.out.println("initializing...") ;
		
                System.out.println("done initializing") ;
		
		// Add a tone generator.
		synth.add( osc = new SawtoothOscillatorBL() ) ;
                synth.add( filter = new FilterStateVariable() ) ;
                synth.add( lineOut = new LineOut() ) ;
                
                osc.frequency.set(440.0);
                osc.amplitude.set(0.4);
                
                
                System.out.println("added") ;
                
                osc.output.connect( filter.input ) ;
                System.out.println("filter connected") ;
                filter.output.connect(0, lineOut.input, 0);
                filter.output.connect(0, lineOut.input, 1);
                
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

        public void increase1() {
            System.out.println("starting...") ;
            osc.frequency.set(880.0) ;
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

	/* Can be run as either an application or as an applet. */
	public static void openSynth() 
	{
		MySynth applet = new MySynth();

	}
        
        public static void main(String[] args) {
            
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
            
            
            
            
            
        }

}