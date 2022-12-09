package week5CodingAssignment;

public class App {

	public static void main(String[] args) { //#9
		String word = "Bye";
		
		Logger astLog = new AsteriskLogger();
		System.out.println("Asterisk Logger:");
		astLog.Log(word);
		astLog.Error(word); //#10
		
		Logger spcdLog = new SpacedLogger();
		System.out.println("\nSpaced Logger: ");
		spcdLog.Log(word);
		spcdLog.Error(word); //#10
		
	}
	}
