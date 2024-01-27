import java.util.Scanner;

public class Pseudocode {

	public static void main(String[] args) {
		
		//create a scanner to scan for the first and second numbers
		Scanner numberScanner = new Scanner(System.in);
		
		//Print statement asking user for an input 
		System.out.println("Please enter two numbers seperated by 'd'.");
		
		//Instantiate the user's input as a string
		String userInput = new String(numberScanner.nextLine());
		
		splitString(userInput);
		
		
		
		//Close scanner
		numberScanner.close();
		
		
		//create a method that takes a phrase and combines it without a space
		String phrase = "my test is hard";
		char space = (' ');
		
		
	
		int numberOfSpaces = countChars(phrase, space);
		System.out.println("There are " +  numberOfSpaces + " spaces in this phrase.");
		
		System.out.println(removeSpace(phrase) );
		

	}
	/*
	 * create method to seperate everything from the main method 
	 * Set d as a border
	 * print out what the first and second nums are
	 */
	
	private static void splitString(String userInput) {
		//create 'd' as a border between the first and second number
				int border = userInput.indexOf('d');
				
				//Utilize a substring method to determine the first number
				//by starting at 0, we set a inclusive parameter starting at the first character
				//by setting our border as our second parameter, we include everything
				//before the d as our "firstNum"
				String firstNum = userInput.substring(0, border);
				
				//Utilize a substring method to determine the first number
				//by setting the parameter as the border+1, we include everything
				//after the border as the second number
				//there is no need for a second parameter because there is no limit to the 
				//"secondNum"
				String secondNum = userInput.substring(border+1);
				
				//Print out the first and second number
				System.out.println("The first number is " + firstNum + 
						" and the second number is " + secondNum + ".");
				
				//Transform string of the firstNum into an int so that we are 
				//able to add them
				int a = Integer.valueOf(firstNum);
				
				//Transform string of the secondNum into an int so that we are 
				//able to add them
				int b = Integer.valueOf(secondNum);
				
				//Create an int that is the sum of both the first and second nums
				//int sum = a + b;
				
				//Print the sum of both nums
				//System.out.println("The sum of the first and second"
						//+ " number is " + sum + ".");
				rollDice(a,b); 
		
	}
	/*
	 * create a for loop
	 * set an int equal to 0
	 * add countChars to loop
	 * return x
	 */
	private static int countChars(String phrase, char space) {
		// set an int equal to 0
				int x = 0;
				
				//create a for loop 
				//add countChars to loop
				for (int i= 0; i< phrase.length();i++)
				{
					if(phrase.charAt(i) == space)
					{
						x++;
					}
					
				}
				return x;
				
			
		
	}
	/*
	 * Ask user to input a phrase with a space
	 *System.out.println("Please enter a phrase with a space.");
	 *Instantiate a border that is set to the ' ' 
	 */
	private static String removeSpace(String phrase) {
		
		int space = phrase.indexOf(' ');
		
		String firstHalf = phrase.substring(0, space);
		
		String secondHalf = phrase.substring(space+1);
		
		return firstHalf+secondHalf;
				
		
		
	}
	/**
	 *set firstNum = to the amount of dice
	*set secondNum = the amount of sides on the dice
	*create a RNG to roll the __ sided dice, __ times
	*print out "and rolling the 'firstNum' 'secondNum'-sided dice
	*gives you *random number generated*
	 * @param a
	 * @param b
	 * @return
	 */
	public static int rollDice (int a, int b)
	{
		
		int i = 1;
		
		int sum = 0;
		
		while (i<= a)
		{

			int roll = (int)(Math.random()*b+1);
			i++;
			sum+= roll;
			
		}
		System.out.println("Rolling " + a + " " +  b + "-sided dice gives " + sum);
		return sum;
	}
		
	
	
}
