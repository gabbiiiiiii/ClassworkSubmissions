import java.util.Scanner;

public class Pseudocode {

	public static void main(String[] args) {
		
		//create a scanner to scan for the first and second numbers
		Scanner numberScanner = new Scanner(System.in);
		
		//Print statement asking user for an input 
		System.out.println("Please enter two numbers seperated by 'd'.");
		
		//Instantiate the user's input as a string
		String userInput = new String(numberScanner.nextLine());
		
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
		int sum = a + b;
		
		//Print the sum of both nums
		System.out.println("The sum of the first and second"
				+ " number is " + sum + ".");
		
		//Close scanner
		numberScanner.close();
	}

	
}
