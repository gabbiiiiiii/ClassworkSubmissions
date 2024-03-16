
public class ArrayTraversalTutorial {

	public static void main(String[] args) {
		
		int [] evens = { 2, 4, 6, 8, 10, 12 };
		double [] arr = { 2.0, 4.0, 6.0, 8.0, 10.0, 12.0 };
		
		System.out.println(evens);
		
		//call printArr method
		printArr( arr );

		//call method that will find sum
		double sum = sumArrElements(arr);

		//To make sure your code works, you should probably make a class with a main method. 
		//In that main method, make an array, pass the method the array, and print out whatever it returns. 
		System.out.println("The sum of all the elements in the array is " + sum);


		//PROBLEM 2: Create a method makeEveryOtherOne that is passed an array of ints and changes that array. 
		//It should make every other element in the array '1' starting with the second element.  
		double [] newArr = makeEveryOtherOne(arr);
		
		int index = 0;

		//For example, when the method is passed { 3, 17, 12, 8, 9, 4, 12 }
		//the method should change it into { 3, 1, 12, 1, 9, 1, 12 }
		//Precondition: the array will always be at least length 2. 
		
		
	}
	/**
	 * this method is passed an array and prints out
	 * each element one by one
	 * @param nums
	 */
	private static void printArr(double[] arr) 
	{
		
		//TASK 1: make a variable to be the traverser
		int traverser;
		
		//TASK 2: make a loop. we want it to traverse every character, so it
		//should go from start to finish of the loop
		for (traverser = 0; traverser <= arr.length-1; traverser++) 
		{
			
			//TASK 3: prove that it can count along
			//with right amount of indeces
			System.out.println(arr[traverser]);
		}
			
			
	}
		
		/**
		 * PROBLEM 1: Create a method sumArrElements that is passed an array 
		 * of doubles and returns the sum of all its elements. 
		 * @param arr
		 * @return 
		 */
	private static double sumArrElements(double[] arr) 
	{
		//create a loop that calculates the sum
		double sum =0;
			
		for (int i =0; i<=arr.length-1;i++) 
		{
			sum = sum+arr[i];
		}
		return sum;
		
	}
	/**
	 * This method is passed an array of ints and changes that array. 
	 * It should make every other element in the array '1' starting 
	 * with the second element.  
	 * @param arr
	 * @return
	 */
	private static double[] makeEveryOtherOne(double[] arr) {
		
		//create a for loop to traverse array
		for (int index=0; index<=arr.length-1; index++) {
			
			//if statement checks if the index of the element is even or odd
			if(index%2 != 0) 
			{
				//if element is odd, set it equal to 1
				arr[index]=1;
			}
			
			else if(index%2 == 0) 
			{
				//if element is even, keep it the same
				arr[index] = arr[index];
			}
			
			double [] newArr = arr;
			//print arr 
			System.out.println("{" + newArr[index] + "}");
		}
	
		return arr;
	}

}
	
