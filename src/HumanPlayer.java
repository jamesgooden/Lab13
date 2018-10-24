import java.util.Scanner;

public class HumanPlayer  extends Player {

	private Scanner scan;
	@Override
	public  Roshamb generateRoshamb() {
		scan = new Scanner(System.in);
	String  userInput =	ValidationMethods.getString(scan, "Rock , Paper , or Scissors? R/P/S");
	
	if (userInput.equalsIgnoreCase("R"))  {
	return 	Roshamb.ROCK;
	}
	else if (userInput.equalsIgnoreCase("P"))  {
		
		return Roshamb.PAPER;
		
	}
	else if (userInput.equalsIgnoreCase("S"))  {
		return Roshamb.SCISSORS;
	}
	
	
	return Roshamb.SCISSORS;
	
	
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public Roshamb getValue() {
		// TODO Auto-generated method stub
		return super.getValue();
	}
	@Override
	public void setValue(Roshamb value) {
		// TODO Auto-generated method stub
		super.setValue(value);
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
