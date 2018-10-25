import java.util.Scanner;



public class HumanPlayer  extends Player {

	private Scanner scan;
	@Override
	public  Roshamb generateRoshamb() {
		scan = new Scanner(System.in);
	String  userInput =	ValidationMethods.getStringMatchingRegex(scan, "Please enter rock paper or scissor " ,"^[A-z]+${30}" );
	
	if (userInput.equalsIgnoreCase("ROCK"))  {
	return 	Roshamb.ROCK;
	}
	else if (userInput.equalsIgnoreCase("PAPER"))  {
		
		return Roshamb.PAPER;
	}
	else if (userInput.equalsIgnoreCase("SCISSORS")) {
		
		return Roshamb.SCISSORS;
	}
	else {
		return Roshamb.SCISSORS;
	}
	
	

	
	
	}
	
}
//	@Override
//	public String toString() {
//		return "HumanPlayer"  + scan;
//	}
//
//	
//	
//	
//}
