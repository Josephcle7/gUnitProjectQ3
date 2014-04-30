package testsynth ;

import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JPanel;

import com.jsyn.* ;
import com.jsyn.unitgen.* ;
import com.jsyn.swing.* ;


public class Synth
{
	private static final long serialVersionUID = -2704222221111608377L;
	public Synthesizer synth;
	public LineOut lineOut;
        public SawtoothOscillatorBL osc;
        public FilterStateVariable filter ;

	public void start()
	{
                System.out.println("initializing...") ;
		Synthesizer synth = JSyn.createSynthesizer();
                System.out.println("done initializing") ;
		
		// Add a tone generator.
		synth.add( osc = new SawtoothOscillatorBL() ) ;
                synth.add( filter = new FilterStateVariable() ) ;
                synth.add( lineOut = new LineOut() ) ;
                
                osc.frequency.set(440.0);
                osc.amplitude.set(0.6);
                
                
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

        public void increase() {
            System.out.println("starting...") ;
            osc.frequency.set(880.0) ;
        }
        
        
	public void run()
	{
		// Start synthesizer using default stereo output at 44100 Hz.
		
		// We only need to start the LineOut. It will pull data from the
		// oscillator.
                
		lineOut.start();
                
                System.out.println("run done") ;
	}


	public void quit()
	{
            
            
            synth.stopUnit(osc) ;
            System.out.println("pass") ;
            osc.stop() ;
            lineOut.stop() ;
            synth.stop() ;
                
                
            System.out.println("stop done") ;
	}

	/* Can be run as either an application or as an applet. */
	public static void openSynth() 
	{
		Synth applet = new Synth();

	}

}