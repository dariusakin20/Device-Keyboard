import java.util.Scanner;

public class Typing {

	
	//Attributes
	
	private String halfComplete;
	
	private String halfComplete2;
	
	private String halfComplete3;
	
	private Scanner reader = new Scanner(System.in);
	
	private String uses;
	
	private String uses2;
	
	private String uses3;
	
	private int confidenceForthing = 0;
	private int confidenceForthink = 0;
	private int confidenceForthird = 0;
	private int confidenceForthis = 0;
	private int confidenceForthroughly = 0;
	private int confidenceForthe = 0;
	
	
	
	private int confidenceForneed = 0;
	private int confidenceFornew = 0;
	
	private String correction;
	private String correction2;
	private String correction3;
	
	private boolean running;
	
	
	
	
	//Constructor
	
	public Typing(){
		
		System.out.println("Please complete the following sentence, using the auto complete keyboard. Type 'th'");
		
		System.out.println("The third ____ that I ____ to tell you is that this ____ does not ____ thoroughly. ");
		
	}//End of constructor
	
	
	//Methods
	public void getWord() {
		
		//To ensure if user input isn't correct, restarts it.
		while(running = true) {
			
		halfComplete = reader.nextLine();
		
		if(halfComplete.contains("th")) {
			
			System.out.println("Did you mean? 1. thing 2. think 3. third 4. this. Input accoridingly to the number");
			
			uses = reader.nextLine();
			
			if(uses.equals("1")) {
			
				System.out.println("thing");
				
				correction = "thing";
			
				confidenceForthing++;
				
				System.out.println("The third "+ correction + " that I ____ to tell you is that this ____ does not ____ thoroughly. ");
				
				break;
				
		} else if(uses.equals("2")) {
			
			System.out.println("think");
			
			correction = "think";
			
			confidenceForthink++;
			
			System.out.println("The third "+ correction + " that I ____ to tell you is that this ____ does not ____ thoroughly. ");
			
			break;
			
		} else if(uses.equals("3")) {
			
			System.out.println("third");
			
			correction = "third";
			
			confidenceForthird++;
			
			System.out.println("The third "+ correction + " that I ____ to tell you is that this ____ does not ____ thoroughly. ");
			
			break;
			
		} else if(uses.equals("4")) {
			
			System.out.println("this");
			
			correction = "this";
			
			confidenceForthis++;
			
			System.out.println("The third "+ correction + " that I ____ to tell you is that this ____ does not ____ thoroughly. ");
			break;
			
		} else {
			
			System.out.println("Please input accurately to instructions. Input 'th'");
			
		}	
		}
			
		}
		
		while(running = true) {
			System.out.println("Please type ne");
			
			halfComplete2 = reader.nextLine();
			
			System.out.println("Did you mean 1. need, 2. new. Input accordingly to the number.");
			
			uses2 = reader.nextLine();
					
			
			if(uses2.equals("1")) {
				
				System.out.println("need");
				
				correction2 = "need";
				
				confidenceForneed++;
				
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not ____ thoroughly. ");
				
				break;
				
	
			} else if(uses2.equals("2")) {
				
				System.out.println("new");
				
				correction2 = "new";
				
				confidenceFornew++;
				
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not ____ thoroughly. ");
				
				break;
				
			}else {
				
				System.out.println("Please input accurately to instructions. Type 'ne'");
			}
			
			}
		
		} //End of this method.
			
	
	//The most used word appears first as it saves that.
			
	public void trainWords() {
		
		System.out.println("Please type th again!");
		
		while(running = true) {
			
		halfComplete3 = reader.nextLine();
		
		if(halfComplete3.equals("th")) {
		
			//If thing was used once, its confidence grows because it assumes you would use it again.
			
		if(confidenceForthing > confidenceForthink && confidenceForthing > confidenceForthird && confidenceForthing > confidenceForthis) {
			
			
			System.out.println("Did you mean? **thing, 2. think, 3. third, 4. this, 5. the, 6. throughly. Input the '**' if want to use word again, if not according to the numbers.");
			
			uses3 = reader.nextLine();
			
			
			if(uses3.equals("**")) {
				
				System.out.println("thing");
				
				correction3 = "thing";
				
				confidenceForthing++;
				
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
				break;
				
			}else if(uses3.equals("2")) {
				
			System.out.println("think");
			
			correction3 = "think";
			
			confidenceForthink++;
				
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
			break;
				
			}
			
			else if(uses3.equals("3")) {
				
				System.out.println("third");
				
				correction3 = "third";
				
				confidenceForthird++;
					
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
				break;
					
			} else if(uses3.equals("4")) {
				
			System.out.println("this");
			
			correction3 = "this";
			
			confidenceForthis++;
				
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
			break;
				
			} else if(uses3.equals("5")) {
				
			System.out.println("the");
			
			correction3 = "the";
			
			confidenceForthe++;
				
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
			break;
				
			} else if(uses3.equals("6")) {
				
			System.out.println("throughly");
			
			correction3 = "throughly";
			
			confidenceForthroughly++;
			
					
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
			break;
			}
			//If think was used once, its confidence grows because it assumes you would use it again.
			
				
		}else if(confidenceForthink > confidenceForthing && confidenceForthink > confidenceForthird && confidenceForthink > confidenceForthis) {
		
			
			System.out.println("Did you mean? **think, 2. thing, 3. third, 4. this, 5. the, 6. throughly. Input the '**' if want to use word again, if not according to the numbers.");
			
			uses3 = reader.nextLine();
			
			if(uses3.equals("**")) {
				
				System.out.println("think");
				
				correction3 = "think";
				
				confidenceForthink++;
				
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
				break;
				
			}else if(uses3.equals("2")) {
				
			System.out.println("thing");
			
			correction3 = "thing";
			
			confidenceForthing++;
				
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
			break;
			
			}
			
			else if(uses3.equals("3")) {
				
				System.out.println("third");
				
				correction3 = "third";
				
				confidenceForthird++;
					
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
				break;
				
			} else if(uses3.equals("4")) {
				
			System.out.println("this");
			
			correction3 = "this";
			
			confidenceForthis++;
				
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
			break;
			
			} else if(uses3.equals("5")) {
				
			System.out.println("the");
			
			correction3 = "the";
			
			confidenceForthe++;
			
				
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
			break;
			
			} else if(uses3.equals("6")) {
				
			System.out.println("throughly");
			
			correction3 = "throughly";
			
			confidenceForthroughly++;
			
					
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
			break;
			
			}
			//If third was used once, its confidence grows because it assumes it would use it again.
			
		}else if(confidenceForthird > confidenceForthing && confidenceForthird > confidenceForthink && confidenceForthird > confidenceForthis) {
			
				System.out.println("Did you mean? **third, 2. think, 3. thing, 4. this, 5. the, 6. throughly. Input the '**' if want to use word again, if not according to the numbers.");
			
				uses3 = reader.nextLine();
				
				if(uses3.equals("**")) {
					
					System.out.println("third");
					
					correction3 = "third";
					
					confidenceForthird++;
					
					System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
					
					break;
					
				}else if(uses3.equals("2")) {
					
				System.out.println("think");
				
				correction3 = "think";
				
				confidenceForthink++;
					
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
				break;
				}
				
				else if(uses3.equals("3")) {
					
					System.out.println("thing");
					
					correction3 = "thing";
					
					confidenceForthird++;
						
					System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
						
					break;
					
					
				} else if(uses3.equals("4")) {
					
				System.out.println("this");
				
				correction3 = "this";
				
				confidenceForthis++;
					
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
					
				break;
				
				} else if(uses3.equals("5")) {
					
				System.out.println("the");
				
				correction3 = "the";
				
				confidenceForthe++;
				
					
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
				break;
				
				} else if(uses3.equals("6")) {
					
				System.out.println("throughly");
				
				correction3 = "throughly";
				
				confidenceForthroughly++;
						
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
				break;
				
				//If this was used once its confidence grows as it will assume you want to use it again.
				}
				
		}else if(confidenceForthis > confidenceForthing && confidenceForthis > confidenceForthink && confidenceForthis > confidenceForthird) {
			
			System.out.println("Did you mean? **this, 2. think, 3. third, 4. thing, 5. the, 6. throughly. Input the '**' if want to use word again, if not according to the numbers.");
			
			uses3 = reader.nextLine();
			
			if(uses3.equals("**")) {
				
				System.out.println("this");
				
				correction3 = "this";
				
				confidenceForthis++;
				
				System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
					
				break;
				
		}else if(uses3.equals("2")) {
			
		System.out.println("think");
		
		correction3 = "think";
		
		confidenceForthink++;
			
		System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
		break;
		
		}
		
		else if(uses3.equals("3")) {
			
			System.out.println("third");
			
			correction3 = "third";
			
			confidenceForthird++;
				
			System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
				
			break;
			
		} else if(uses3.equals("4")) {
			
		System.out.println("thing");
		
		correction3 = "thing";
		
		confidenceForthing++;
			
		System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
		break;
		
		} else if(uses3.equals("5")) {
			
		System.out.println("the");
		
		correction3 = "the";
		
		confidenceForthe++;
			
		System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
			
		break;
		
		} else if(uses3.equals("6")) {
			
		System.out.println("throughly");
		
		correction3 = "throughly";
		
		confidenceForthroughly++;
		
				
		System.out.println("The third " + correction + " that I "+ correction2 + " to tell you is that this "+ correction + " does not "+ correction3 + " thoroughly. ");
		
		break;
		}
		
		} else  {
			
			System.out.println("Please input accurately accorindgly to insturctions. Input 'th' again!");
		}
	}
	//End of methods.
		
	}
		}
		
		
		
	
	
	public void getConfidence() {
		
		//Tells the user what words they use the most.
		
		System.out.println("\nAmount of times word used:");
		System.out.println("thing: "+ confidenceForthing);
		System.out.println("think: "+ confidenceForthink);
		System.out.println("third: "+ confidenceForthird);
		System.out.println("this: " + confidenceForthis);
		System.out.println("throughly: "+ confidenceForthroughly);
		System.out.println("the: "+ confidenceForthe);
		System.out.println("need: " + confidenceForneed);
		System.out.println("new: "+ confidenceFornew);
		
	}
}
	
	
	

	

			