public class TraversalMethodsHW {
	
	public static void main(String[] args) {
	
		double [] doublearr = { 6.7, 1.5, 1.5, 1.5, 3.8, 7.9};
		
		int [] intarr = { 4, 2, 7, 7, 5 };
		
		//Method for Problem 1
		getHighestNum(intarr);
		
		//Method for Problem 2
		getAverage(doublearr);
		
		//Method for Problem 3
		evenNums(intarr);
		
		//Method for Problem 4
		allEvens(intarr);
		
		//Method for Problem 5
		checkThreeSame(doublearr);
		
	}
	/**
	 * PROBLEM 1: Make a method that is passed an int array
	 * and returns the highest value in that array.
	 * @param intarr
	 * @return
	 */
	private static int getHighestNum (int [] intarr)
	{
		//declare a max that is the first element so that it 
		//can be changed
		int max = intarr[0];
		
		//create a for loop
		for(int i=0;i<=intarr.length-1; i++)
		{
			//checks if int i is greater than the current max
			if(intarr[i]>max) {
			max = intarr[i];
			}
		}
		System.out.println(max);
		return max;
	}
	
	/**
	 * PROBLEM 2: Make a method that is passed an array of doubles 
	 * and returns a double array consisting of their average. 
	 * @param doublearr
	 * @return
	 */
	private static double getAverage ( double [] doublearr) {
		//declare doubles sum and average that can be changed 
		double average = 0;
		double sum =0;
		
		for (int i =0; i<=doublearr.length-1;i++) 
		{
			//find sum of all doubles
			sum = sum+doublearr[i];
			//find average by dividing sum by the number of
			//elements
			average = sum / doublearr.length;
		}
		//check average found
		System.out.println(average);
		return average;
	}
	
	
	/**
	 * PROBLEM 3: Make a method that is passed an int array and returns 
	 * whether or not the array has any even numbers in it.
	 * @param intarr
	 */
	
	private static boolean evenNums(int[] intarr) {
		
		//declare int numChecker as a traverser for this array
		int numChecker1 = 0;
		
		//declare a boolean that checks for even numbers
		boolean hasEvens = false;
		
		//create for loop
		for (; numChecker1<=intarr.length-1;numChecker1++) 
		{
			//checks for a remainder
			//if the num has a remainder after being divided by two it is odd
			int temp = intarr[numChecker1]%2;
			
			//if there is no remainder, the element is even 
			//return true
			if (temp==0)
			{
				hasEvens=true;
			}
			
		}
		//print to check
		System.out.println(hasEvens);
		return hasEvens;
	}

	/**
	 * PROBLEM 4: Make a method that is passed an int array and 
	 * returns whether or not the array has ALL even numbers in it.
	 * @param intarr
	 * @return
	 */
	private static boolean allEvens(int[]intarr)
	{
		//declare boolean 
		boolean checkIfEven = false;
		
		//declare int as the traverser for this method
		int traverser = 0;
		
		for (; traverser<=intarr.length-1; traverser++)
		{
		
		//declare int temp as the remainder
		int temp = intarr[traverser]%2;
		
		//checks for an odd number, because if there is an odd
		//the boolean is AUTOMATICALLY false for the whole array
		if(temp>0) 
		{
			checkIfEven = false;
		}
		}
		//print to check
		System.out.println(checkIfEven);
		return true;
	}

	
	/**
	 * PROBLEM 5: Make a method that is passed a double array and returns whether 
	 * or not three consecutive doubles of the same value appear in the array.
	 * @param arr
	 * @return
	 */
	private static boolean checkThreeSame (double[]arr)
	{
		//declare a traverser and set it equal to zero so that it starts at the beginning
		//of the array
		int traverser = 0;
		//declare a boolean that will print true if the arr contains a double
		//that is displayed three consecutive times
		boolean hasThree = false;
		//create a for loop for the traverser
		for (;traverser<=arr.length-2; traverser++) 
	{
			//if statement that checks the array for three doubles
			if(arr[traverser]==arr[traverser+1] && arr[traverser]==arr[traverser+2])
			{
				//if arr aligns with the if statement, return true
				hasThree = true;
			}
	}
	System.out.println(hasThree);
	return false;
	}
}
