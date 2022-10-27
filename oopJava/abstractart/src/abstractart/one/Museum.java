package abstractart.one;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {

		Painting paint1=new Painting("Oil","painit1title","paint1author","paint1description");
		Painting paint2=new Painting("Watercolor","painit2title","paint2author","paint2description");
		Painting paint3=new Painting("Acrylic","painit3title","paint3author","paint3description");
		Sculpture sca1=new Sculpture("Marble","sca1title","sca1author","sca1description");
		Sculpture sca2=new Sculpture("Bronze","sca2title","sca2author","sca2description");
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(paint1);
		museum.add(paint2);
		museum.add(paint3);
		museum.add(sca1);
		museum.add(sca2);
		for(Art a:museum) {
			if(a instanceof Painting ) {
			  a.viewArt();	
			}
			if(a instanceof Sculpture) {
				 a.viewArt();	
			}
		}
		
		

	}

}
