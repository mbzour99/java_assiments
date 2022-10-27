package pakageone.one;

public class Gorilla extends Mammal {
	public Gorilla() {
		super();
	}
	
public void throwSomething() {
	int curr=super.getEnergyLevel();
	curr-=5;
	super.setEnergyLevel(curr);
}
}
