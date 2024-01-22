
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
