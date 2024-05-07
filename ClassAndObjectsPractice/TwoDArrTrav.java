
public class TwoDArrTrav {

	public static void main(String[] args) {
		// declare a 2D array with 3 rows and 2 columns
		String [][] foods =
			{{"apple", "orange", "strawberry", "kiwi", "lemon", "mango"},
		 {"apple", "orange", "strawberry", "kiwi", "lemon", "mango"},
		 {"apple", "orange", "strawberry", "kiwi", "lemon", "mango"},
		 {"apple", "orange", "strawberry", "kiwi", "lemon", "mango"},
		 {"apple", "orange", "strawberry", "kiwi", "lemon", "mango"},
		 {"apple", "orange", "strawberry", "kiwi", "lemon", "mango"},
		 {"apple", "orange", "strawberry", "kiwi", "lemon", "mango"}};
		
		//Task 1: print out the first element of every array
		for(int i=0; i < foods.length; i++) {
		System.out.println(foods[i][0]);
		}
		
		//Task: print out every element in the first row
		for(int i=0; i<foods[0].length; i++) {
			System.out.println(foods[0][i]);
		}
		
		//Task: print out every element in the second row
		for(int i = 0; i<foods[0].length; i++) {
			System.out.println(foods[1][i]);
		}
		
		//Task: print out every element
		for(int i=0; i < foods.length; i++) {
			for(int j = 0; j < i;j++) {
				System.out.println(foods[i][j]);
			}
		}
	}
}

