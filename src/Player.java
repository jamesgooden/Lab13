

public abstract class Player {
private String name;
private Roshamb value;

public abstract  Roshamb generateRoshamb();
	
	
	



public Player() {
	
	// TODO Auto-generated constructor stub
}




public Player(String name, Roshamb value) {
	
	this.name = name;
	this.value = value;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public Roshamb getValue() {
	return value;
}




public void setValue(Roshamb value) {
	this.value = value;
}





}
