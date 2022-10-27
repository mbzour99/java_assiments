package abstractart.one;

public class Sculpture extends Art{
   private String material;
	public String getMaterial() {
	return material;
}
public Sculpture() {
		System.out.println("This is the default constrecter for Sculpture Class !");
	}
public Sculpture(String material,String title, String author, String description) {
		super(title,author,description);
		this.material = material;
	}

public void setMaterial(String material) {
	this.material = material;
}

	@Override
	void viewArt() {
		System.out.println(" Sculpture details: *Title:"+this.title+"author is:"+this.author+"description is:"+this.description+"The material is :"+this.material);
		
	}

}
