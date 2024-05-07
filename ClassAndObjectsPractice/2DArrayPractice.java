
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
		
		double [][] doubArr = new double [3][3];
		
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
		
		//Task: print out every element (row major)
		for(int i=0; i < foods.length; i++) {
			for(int j = 0; j < i;j++) {
				System.out.println(foods[i][j]);
			}
		}
		//2D Array Practice!!
		//Task 1: Create a method print2DArray() that is passed a 2D String array 
		//and will print out each element in column-major order (up down)
		print2DArray(foods);
		
		//Task 2: Create a method allOnes2D() that is passed a 2D double array, makes 
		//an array of the same column and row length but all its literals are 0.0 
		//called copyArr, and then changes each element inside to 1.0 and returns copyArr. 
		//(So it is passed a 2D array and returns a 2D array with all 0.0).
		double [][] myArr = allOnes2D(doubArr);
		print2DArray(myArr);
		
	}
	/**
	 * Task 2
	 * @param copyArr
	 */
	private static double[][] allOnes2D(double[][] doubArr) {
		double [][] copyArr = new double [doubArr.length][doubArr[0].length];
		
		for(int i=0; i<copyArr.length; i++) {
			for(int j = 0; j< copyArr[0].length ; j++) {
				copyArr[i][j]=1.0;
				
			}
		}
		//print2DArray(copyArr);
		return copyArr;
		
		
	}
	/**
	 * Task 1
	 * @param foods
	 */

	private static void print2DArray(String [][] x) {
		for(int i = 0; i<x[0].length; i++) {
			for(int j = 0; j < x.length; j++) {
				System.out.println(x[j][i]);
			}
			
			
		}
		
	}
	
	private static void print2DArray(double [][] x) {
		for(int i = 0; i<x[0].length; i++) {
			for(int j = 0; j < x.length; j++) {
				System.out.println(x[j][i]);
			}
			
			
		}
		
	}
	
}

