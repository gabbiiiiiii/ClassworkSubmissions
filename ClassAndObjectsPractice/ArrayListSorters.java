import java.util.ArrayList;

public class ArrayListSorters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Task 1: In the main method, instantiate two ArrayLists nums and names 
	//of Integers (remember ints wouldn't work for ArrayLists) and Strings 
	//respectively. Fill them with five unsorted values (nums out of numerical
	//order and names out of alphabetical order). 
		
		ArrayList <Integer> nums = new ArrayList <Integer>();
		nums.add(8);
		nums.add(2);
		nums.add(9);
		nums.add(4);
		nums.add(3);
		ArrayList <String> names = new ArrayList <String>();
		names.add("Spencer");
		names.add("Caroline");
		names.add("Eve");
		names.add("James");
		names.add("Bob");
		
		//Task 2: Create a void method bubbleSortNumbers that is passed 
		//an ArrayList and bubble sorts it just like we did for arrays. 
		bubbleSortNumbers(nums);
		System.out.println(nums);
		
		//Task 3: Create a void method bubbleSortStrings that is passed an 
		//ArrayList and bubble sorts it into alphabetical order. 
		bubbleSortStrings(names);
		System.out.println(names);
	}

	private static void bubbleSortStrings(ArrayList<String> names) {
		
			if (names.size()>0)
			{
				for (int j = 0; j<names.size(); j++) {
					
					for (int i = 0; i < names.size()-1; i++) {
						
						if (names.get(i).compareTo(names.get(i+1))>0) {
							
							String temp = names.get(i);
							names.set(i, names.get(i+1));
							names.set(i+1, temp);
						}
					}
			}
		}
			
	}

	private static void bubbleSortNumbers(ArrayList<Integer> nums) 
	{
		
		//declare a temp int to be a temp placeholder
		
		
		for (int i = 0; i < (nums.size()-1); i++) 
			{
				//sorts the array list so if the first number is greater than the second then they swap
				if (nums.get(i) > nums.get(i+1))
				{
					Integer temp = nums.get(i+1);
					nums.set( i+1 , nums.get(i) );
					nums.set( i, temp );																														
				}	
			
			}
	}

}
