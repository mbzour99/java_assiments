import java.util.ArrayList;
import java.util.Random;
public class PuzzlingTest {
    
	public static void main(String[] args) {
        Puzzling p =new Puzzling();
        // System.out.println(p.getTenRolls());
		// ArrayList<Integer> randomRolls = generator.getTenRolls();
		// System.out.println(randomRolls);
		
    	//..
		// Write your other test cases here.
		//..
        // System.out.println(p.getRandomLetter());
        // System.out.println(p.generatePassword());
        // System.out.println(p.getNewPasswordSet(50));
        int[] inrarr={1,4,5,3,4};
        System.out.println(p.shuffleArray(inrarr));
	}
}
