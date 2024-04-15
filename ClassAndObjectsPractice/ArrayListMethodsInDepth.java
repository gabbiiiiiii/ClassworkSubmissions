import java.util.ArrayList;

public class ArrayListMethodsInDepth {

	public static void main(String[] args) {
		
		//Make a class called ArrayListMethodsInDepth with a main method. 
		//In the main method, instatiate an empty ArrayList foods that 
		//stores Strings. 
		ArrayList <String> foods = new ArrayList <String>();
		
		//Then add the following Strings to foods: "Apples", 
		//"Bread", "Cookies". After each task (except task 1) print out the 
		//length of the foods ArrayList.
		foods.add("Apples");
		foods.add("Bread");
		foods.add("Cookies");
		
		//Task 1: Print out the length of the foods ArrayList
		//This print statement uses the method .size in order to return the size/length
		//of the array list
		System.out.println(foods.size());
		
		//Task 2: Inside of a print statement, add the String "Dole Whip" to foods. 
		//This code should print out if this string can be added to the array list
		//This code uses the method .add to input an additional string into the array list
		System.out.println(foods.add("DoleWhip"));
		System.out.println(foods.size());
		
		//Task 3: Inside of a print statement, use the .set(E) method to change "Bread" 
		//in foods to "Butter". 
		//This code should print out the string that is being replaced, in this case it 
		//should be "Bread" because it is being replaced by "Butter"
		//This print statement uses the method .set in order to swap a string within the 
		//current array list to a new string value
		System.out.println(foods.set(1, "Butter"));
		System.out.println(foods.size());
		
		//Task 4: Inside of a print statement, use the .remove(int) method to remove 
		//"Cookies" from foods. 
		//This code should print the string that is being removed, in this case it should
		//print "Cookies" because it is being removed
		//This print statement uses the .remove method in order to remove a string that is 
		//currently in the array list
		System.out.println(foods.remove(2));
		System.out.println(foods.size());
		
		//Task 5: For each task, go back and comment what the method you are calling does, 
		//and what the method returns (both in general and in this case).
	}
}
