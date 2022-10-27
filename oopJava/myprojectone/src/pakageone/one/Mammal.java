package pakageone.one;

public class Mammal {
	
	private int energyLevel;
	
public int getEnergyLevel() {
		return energyLevel;
	}

	public Mammal() {
	this.energyLevel = 100;
}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

public int displayEnergy() {
	System.out.println("the energy is:"+this.getEnergyLevel());
	return this.getEnergyLevel();
}


public static void main(String[] args) {
Gorilla AboSmaeel=new Gorilla();
System.out.println("Energe:"+AboSmaeel.displayEnergy());
AboSmaeel.throwSomething();
System.out.println("Energe:"+AboSmaeel.displayEnergy());


}
}
