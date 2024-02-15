import java.util.Scanner;

public class Pseudocode {

	public static void main(String[] args) {
		
		//create a scanner to scan for the first and second numbers
		Scanner numberScanner = new Scanner(System.in);
		
		//Print statement asking user for an input 
		System.out.println("Please enter two numbers seperated by 'd'.");
		
		//Instantiate the user's input as a string
		String userInput = new String(numberScanner.nextLine());
		
		//this method takes in a phrase that has two numbers with a char 'd' between the two
		//
		splitString(userInput);
		

		//create a method that takes a phrase and combines it without a space
		char space = (' ');
		
		//print statement that asks user for a phrase with spaces that the code will take in 
		System.out.println("Please enter a phrase with one or more spaces.");
		
		//set the phrase inputted by the user to a string that can be used during methods
		String phrase = new String (numberScanner.nextLine());
	
		//declare an int that is the countChars method
		//when this int is utilized, it will run the codde within the method
		int numberOfSpaces = countChars(phrase, space);
		
		//print statement that tells the user the amount of spaces that are in 
		//the phrase they input
		System.out.println("There are " +  numberOfSpaces + " spaces in this phrase.");
		
		
		//print statement that is the product of the removeSpaces method
		System.out.println(removeSpace(phrase) );
		
		//close scanner
		numberScanner.close();		

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
					
					//if statement that says if the char at int i is space
					//then add
					if(phrase.charAt(i) == space)
					{
						x++;
					}
					
				}
				//return x value produced from this method
				return x;
				
			
		
	}
	/*
	 *Ask user to input a phrase with a space
	 *System.out.println("Please enter a phrase with a space.");
	 *Instantiate a border that is set to the ' ' 
	 */
	private static String removeSpace(String phrase) {
		
		//set a char equal to the ' ' in the phrase
		char space = ' ' ;
		
		
		//create a for loop that runs if there is a space within the phrase
		for(    ; phrase.indexOf(space)> -1;) {
		
			//instantiate a  string object that will be the characters BEFORE
			//the ' ' 
			String firstHalf = phrase.substring(0, phrase.indexOf(space));
			
			//instantiate a  string object that will be the characters AFTER
			//the ' ' 
			String secondHalf = phrase.substring(phrase.indexOf(space)+1);
			
				
			//give 'phrase' a new value after running through the code
				phrase = firstHalf + secondHalf;
				
				
			
		}
		
		//return the new phrase without spaces
		return phrase;
		
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
		
		//declare an int i and pass it the value of 1
		int i = 1;
		
		//declare an int sum and pass it the value of 0
		int sum = 0;
		
		//while loop that works when int i is less than or equal to int a
		while (i<= a)
		{

			//declare the int roll that will roll a random number
			int roll = (int)(Math.random()*b+1);
			i++;
			//add each roll to create a cumulative sum
			sum+= roll;
			
		}
		//print statement that states that rolling 'a amount of dice
		// + 'b' times gives us the random generated number decided by the
		// + rollDice method
		System.out.println("Rolling " + a + " " +  b + "-sided dice gives " + sum);
		
		//return the cumulative sum created by this method
		return sum;
	}
		
	
	
}
