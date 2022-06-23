package tugas02;

import java.util.Scanner;

public class TugasKedua {

	public static void main(String[] args) { // TODO Auto-generated method stub
		
		// This variable will asks the user to select an Arithmetic Operation from the List
		int operation = askUser();
		
		// This variables will asks the user to input their 1st and 2nd number
		double number1 = firstNumber();
		double number2 = secondNumber();
		
		// This code will calculate the 1st and 2nd number based on the selected Arithmetic Operation
		if(operation == 1) {
			System.out.println("The calculation result is: " + (number1 + number2));
		}
		if(operation == 2) {
			System.out.println("The calculation result is: " + (number1 - number2));
		}
		if(operation == 3) {
			System.out.println("The calculation result is: " + (number1 * number2));
		}
		if(operation == 4) {
			System.out.println("The calculation result is: " + (number1 / number2));
		}
		
		
		
		
		

		


	}
	public static int askUser() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please choose an operation: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");


			int userInput = scanner.nextInt();
			
			if(userInput >=1 && userInput <=4) {
				
				return userInput;
			}

			else {
				System.out.println("Please choose from the listed operations!");
				return askUser();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("Please choose a number!");
			
			return askUser();
		}


	}
	
	public static double firstNumber() {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		try {
	        System.out.print("Now, please enter your first number: ");
	        String userInput = s.nextLine();
	        
	        return Double.parseDouble(userInput);
	        	        
	    } catch (NumberFormatException e) {
	        System.out.println("Please input a number!");
	        
	        return firstNumber();
	    }

	}
	
	public static double secondNumber() {
	
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		try {
	        System.out.print("Now, please enter your second number: ");
	        String userInput = s.nextLine();
	        
	        return Double.parseDouble(userInput);
	        	        
	    } catch (NumberFormatException e) {
	        System.out.println("Please input a number!");
	        
	        return secondNumber();
	    }
	}
	
	
}
