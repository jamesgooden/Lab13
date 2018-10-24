import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// declare/initialize variables
		Player user = new HumanPlayer();
		Player opponent = null;
		Roshamb userValue;
		Roshamb opponentValue;
		String userName;

		// prompt user to enter name. Validate input.

		System.out.println("Welcome to Rock Paper Scissors");

		userName = ValidationMethods.getString(scan, "Please enter your name ");
		user.setName(userName);
		// prompt user to select opponent validate input
		String userChoice = ValidationMethods.getString(scan,
				"Would you like to play against TheJets or the TheSharks?  (j/s?)");
		if (userChoice.equalsIgnoreCase("j")) {
			opponent = new RockHead();
 //   System.out.println(opponent);
		}
		else if(userChoice.equalsIgnoreCase("s")) {
			
			opponent = new Brainy();
		}
		// prompt user to select rock paper or scissors validate input
        
		String rockPaperScissor = ValidationMethods.getString(scan, "Rock , Paper , Or Scissors? R/P/S");
		if (rockPaperScissor.equalsIgnoreCase("R")) {
		
	          System.out.println("rock");
		}
		else if (rockPaperScissor.equalsIgnoreCase("P"))  {
			System.out.println("paper");
		}
      
		else if (rockPaperScissor.equalsIgnoreCase("S")) {
			System.out.println("scissors");
		}
	// display opponents choice
		System.out.println(opponent);
		
		// display users choice
          
		// display results of match write a seperate method.
              
		// prompt user to continue . Validate input

	}

}
