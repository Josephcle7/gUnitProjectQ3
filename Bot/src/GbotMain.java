import org.jibble.pircbot.*;

public class GbotMain {

	public static void main(String[] args) throws Exception {

		Gbot bot = new Gbot();
		bot.setVerbose(true);
		bot.connect("irc.freenode.net");
		bot.joinChannel("#csf");
	}
}
