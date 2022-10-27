package abstractart.one;

public abstract class Art {
	protected String title;
	protected String author;
	protected String description;
	abstract void viewArt();
	public Art() {
		
	}
	public Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}


}
