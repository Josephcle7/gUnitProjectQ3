mport org.jibble.pircbot.*;
import java.util.Random;

public class Botchu extends PircBot {
	
	public Botchu() {
		this.setName("Gbot");
	}

	// this is where we put in replies etc...
	public void onMessage(String channel, String sender, String login, String hostname, String message) {

		if (message.equalsIgnoreCase("@time")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, sender + ": The time is now " + time);
			}
		if (message.equalsIgnoreCase("@help")) {
			sendMessage(sender, "I understand you may want help, however that is not going to happen");
			}
		}	
	}
}

