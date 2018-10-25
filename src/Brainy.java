
public class Brainy extends Player {

	@Override
	public Roshamb generateRoshamb() {
		int randNum = (int) (Math.random() * 3);
	 
		switch(randNum) {
	     case 0:
	   return Roshamb.ROCK;
	   case 1:
		return Roshamb.PAPER;
	   case 2:
		   return Roshamb.SCISSORS;
	  default:
        return Roshamb.PAPER;
		} 
	

	}

//	@Override
//	public String toString() {
//		return generateRoshamb();
//
//	}
//	
	
}
