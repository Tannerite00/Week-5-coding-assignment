
public class App {

	public static void main(String[] args) {
		Logger astLog = new AsteriskLogger();
		astLog.log("Do you like asterisks?");
		astLog.error("I'm in a box");
		
		Logger spaceLog = new SpacedLogger();
		spaceLog.log("Space Sure Is Cool");
		spaceLog.error("T o o  M u c h  S p a c e  I s  B a d");
	}

}
