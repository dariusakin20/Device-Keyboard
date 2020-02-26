
public class Keyboard {

	
	public static void main (String[] args) {
		
		Typing autoComplete = new Typing();
		
		autoComplete.getWord();
		
		autoComplete.trainWords();

		autoComplete.getConfidence();
		
		System.out.println("Thank you!");
	}
	
}
