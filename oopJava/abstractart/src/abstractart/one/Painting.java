package abstractart.one;

public class Painting extends Art {
    private String paintType;
	public Painting() {
		// TODO Auto-generated constructor stub
	}
	public Painting(String paintType,String title, String author, String description) {
		super(title,author,description);
		this.paintType = paintType;
	}
	@Override
	void viewArt() {
		System.out.println(" Painting details: *Title:"+this.title+"author is:"+this.author+"description is:"+this.description+"The paint type is :"+this.paintType);
		
	}

}
