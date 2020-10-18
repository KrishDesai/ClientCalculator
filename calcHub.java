package clientCalculator;
import java.util.Scanner;


public class calcHub {
	
	public static void main(String[] args) {
		
        welcome(); 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			divider();
			System.out.println("Enter The First Integer: ");
			double numOne = scanner.nextDouble();
			divider();
			
			System.out.println("Enter The Second Integer:");
			double numTwo = scanner.nextDouble();
			divider();
			
			System.out.println("What function do you want us to calculate out of these: \n| + (Addition) |\n| a-b (Subtraction with #2) |\n| b-a (Subtraction with #1) |\n| a/b (Division with #2) |\n| b/a (Division with #1) |\n| * (Multiplication)|\n| a (Average) |\n| sqa (Square Root of Average) |\n| a^a (The First Number To The Power Of The Average) |\n| a^b (The Second Number To The Power Of The Average) | ");
		    String userFunc = scanner.next();   
		    divider();
		    
			System.out.println("The two numbers you inputed are " + numOne + " and " + numTwo + ". Please confirm this by saying Y. If you want to redo your input, say N. \nPlease enter space and type your answer.");
			String yesNo = scanner.next();
			divider();
			
			
			if (yesNo.equals("Y")) {
				calculate (userFunc, numOne, numTwo);
				divider();
				
			} 
			
			System.out.println("Do you want to do another operation? Y/N");
			divider();
			String more = scanner.next();
			if (!more.equals("Y")) {
				divider();
				System.out.println("Thank you for visiting the Client Calculator made by Krish Desai! Check out some other projects on my GitHub page. ");
				break;	
				
			}
		}
				
	}

	private static boolean yesNo(String string) {
		// TODO Auto-generated method stub
		return false;
	}
	
	//Calculation Page
	private static void calculate(String userFunc,double numOne, double numTwo) {
		
		switch (userFunc) { 
		
		//List of Functions:
		//+ (Addition) 
		//a-b (Subtraction with #2) 
		//b-a (Subtraction with #1) 
		//a/b (Division with #2) 
		//b/a (Division with #1) 
		//* (Multiplication)
		//a (Average) 
		//sqa (Square Root of Average) 
		//a^a (The First Number To The Power Of The Average) 
		//a^b (The Second Number To The Power Of The Average) | ");
		
	    
	    case "+": 
	    	int answer = (int) (numOne + numTwo);
	    	System.out.println(numOne +  " + " + numTwo + " = " + answer);
	    	break;
	    	
	    case "a":
	    	int answerTwo = (int) ((numOne+numTwo)/2);
	    	System.out.println("The average of these two numbers is " + answerTwo + ".");
	    	break;
	    	
	    case "sqa":
	    	int answerThree = (int) (Math.sqrt(numOne+numTwo/2));
	    	System.out.println("The Square Root of the average of both numbers is " + answerThree + ".");
	    	break;
	    	
	    case "a^a":
	    	int answerFour = (int) (Math.pow((numOne+numTwo/2), numOne));
	    	System.out.println("The first number to the power of the average of the two numbers is " + answerFour + ".");
	    	break;
	    	
	    case "a^b":
	    	int answerFive = (int) (Math.pow(numOne+numTwo/2, numOne));
	    	System.out.println("The second number to the power of the average of the two numbers is " + answerFive + ".");
	    	break;
	    	
	    case "a-b":
	    	int answerSix = (int) (numOne-numTwo);
	    	System.out.println(numOne + " - " + numTwo + " = " + answerSix);
	    	break;
	    	
	    case "b-a":
	    	int answerSeven = (int) (numTwo-numOne);
	    	System.out.println(numTwo + " - " + numOne + " = " + answerSeven);
	    	break;
	    	
	    case "a/b":
	    	int answerEight = (int) (numOne/numTwo);
	    	System.out.println(numOne + " / " + numTwo + " = " + answerEight);
	    	break;
	    	
	    case "b/a":
	    	int answerNine = (int) (numTwo/numOne);
	    	System.out.println(numTwo + " / " + numOne + " = " + answerNine);
	    	break;
	    	
	    case "*":
	    	int answerTen = (int) (numOne*numTwo);
	    	System.out.println(numOne + " * " + numTwo + " = " + answerTen);
	    	break;      
	    	
	    default:
	    	System.out.println("Please type the function again. The function you typed is not one that we offer at this time.");
	    	break;
	    }
	}
	
	private static void welcome() {
		System.out.println("Welcome To The Client Calculator");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Currently this calculator is offering ten diverse functions, though we do \nplan to add more in the future.");
		System.out.println("---------------------------------------------------------------------------------------------------------");

		
	}
	
	private static void divider() {
		System.out.println("---------------------------------------------------------------------------------------------------------");
	}
	
}

