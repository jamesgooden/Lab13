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
		String userContinue;

		System.out.println("Welcome To The Rock Paper Scissors App");

		userName = ValidationMethods.getStringMatchingRegex(scan, "Hello ,what's your name? ", "^[A-z]+${30}");
		user.setName(userName);
		System.out.println("Nice to meet you " + userName + " goodluck! ");

		do {
			String userChoice = ValidationMethods.getStringMatchingRegex(scan,
					"Would you like to play against Jets or the Sharks? ", "^[A-z]+${30}");
			if (userChoice.equalsIgnoreCase("JETS")) {
				opponent = new RockHead();
			} else if (userChoice.equalsIgnoreCase("SHARKS")) {

				opponent = new Brainy();
			} else {
				opponent = new RockHead();
			}
			userValue = user.generateRoshamb();

			System.out.println("You Entered: " + userValue);
			// prompt user to select rock paper or scissors validate input
			opponentValue = opponent.generateRoshamb();
			// opponent.setValue(opponentValue);
			System.out.println("Your Opponent: " + opponentValue);

			winOrLose(userValue, opponentValue);
			System.out.println("Would you like to play again?");
			userContinue = scan.next();
		} while (userContinue.equalsIgnoreCase("Y"));

		System.out.println("Thanks for playing " + userName + ". goodbye!");
	}

	public static void winOrLose(Roshamb userValue, Roshamb opponentValue) {
		int gamesWonForUser = 0;
		int gamesWonByOpponent = 0;
		int Stalemates = 0;

		if (userValue == Roshamb.ROCK && opponentValue == Roshamb.ROCK) {
			System.out.println("ITS A DRAW");
			Stalemates = Stalemates + 1;
			// System.out.println(" Your Score : " + Stalemates);
		} else if (userValue == Roshamb.ROCK && opponentValue == Roshamb.PAPER) {
			System.out.println("YOUR OPPONENT WINS");
			gamesWonByOpponent = gamesWonByOpponent + 1;
			// System.out.println("Your score " + games);
		} else if (userValue == Roshamb.ROCK && opponentValue == Roshamb.SCISSORS) {
			System.out.println("YOU WIN");
			gamesWonForUser = gamesWonForUser + 1;
		} else if (userValue == Roshamb.PAPER && opponentValue == Roshamb.PAPER) {
			System.out.println("ITS A DRAW");
			Stalemates = Stalemates + 1;
		} else if (userValue == Roshamb.PAPER && opponentValue == Roshamb.SCISSORS) {
			System.out.println("YOUR OPPONENT WINS");
			gamesWonByOpponent = gamesWonByOpponent + 1;
		} else if (userValue == Roshamb.PAPER && opponentValue == Roshamb.ROCK) {
			System.out.println("YOU WIN");
			gamesWonForUser = gamesWonForUser + 1;
		} else if (userValue == Roshamb.SCISSORS && opponentValue == Roshamb.SCISSORS) {
			System.out.println("ITS A DRAW");
			Stalemates = Stalemates + 1;
		} else if (userValue == Roshamb.SCISSORS && opponentValue == Roshamb.ROCK) {
			System.out.println("YOUR OPPONENT WINS");
			gamesWonByOpponent = gamesWonByOpponent + 1;
		} else if (userValue == Roshamb.SCISSORS && opponentValue == Roshamb.PAPER) {
			System.out.println("YOU WIN");
			gamesWonForUser = gamesWonForUser + 1;
		}

		System.out.println("You won " + gamesWonForUser);
		System.out.println("Your opponent won " + gamesWonByOpponent);
		System.out.println("Stalemate " + Stalemates);

	}

}
