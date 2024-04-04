
public class BubbleSorter {

	public static void main(String[] args) {
		
		int [] randomNumbers = makeRandom();
		
		printArr(randomNumbers);
		
		int [] sortedArr = bubbleSort(randomNumbers);
		
		printArr(sortedArr);
		
	}
		/**
		 * this method uses bubble sort to sort the randomNumbers array into numerical order
		 * @param randomNumbers
		 * @return randomNumbers
		 */
		private static int[] bubbleSort(int[] randomNumbers) 
		{
			//declare a variable that is the length of the arr
			int len = randomNumbers.length;
			//declare a temp int to be a temp placeholder
			int temp = 0; 
			
			//create a for loop that will run if int i is less than the length of the arr
			for (int i = 0; i < len; i++) 
			{
				//create a nested for loop
				for (int j = 1; j< (len-1); j++) 
				{
					//sorts the arr so if the first number is greater than the second then they swap
					if (randomNumbers[j-1]> randomNumbers[j])
					{
						//temp is set to the first number so that the first number can be changed
						temp = randomNumbers[j-1];
						//then the first number is swapped with the second
						randomNumbers[j-1]= randomNumbers[j];
						//second number is swapped with the first
						randomNumbers[j]= temp;
						
					}
				}
			}
			return randomNumbers;
				
			}
		
		/**
		 * this method takes in an array with 2000 elements
		 * then it runs a loop if the element is less than the length
		 * from there, the loop takes the element and traverses it into a random number
		 * then returns the newly traversed array
		 * @return bigNums
		 */
		private static int[] makeRandom() {
			
			//declare an array called bigNums that contains 2000 0s
			int[] bigNums = new int[3x];
			
			//declare an int len that holds the length of the array
			int len = bigNums.length;
			
			//create a for loop that adds one if the i value is less than the len 
			for (int i = 0; i < len; i++)
			{
				//declare an int randomNumber that creates a random int and multiples it by 1000 before adding one
				int randomNumber = (int) ((Math.random() * 1000) + 1);
				
				//this traverses the element in the array to the new random number
				bigNums[i] = randomNumber;
				
				int [] randomNumbers = bigNums;
				
				
			}
			
			//this returns the new array with a series of random ints
						
			return bigNums;
			
	}
		/**
		 * this method prints the arr from my previous 
		 * @param arr
		 */
		private static void printArr(int[] arr) 
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
}
