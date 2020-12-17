


import java.util.*; 

public class calculator {
	public static void main(String[] args) {
		boolean done = false;
		Scanner console = new Scanner (System.in);
		while (!done){
			displayMenu(); 
			String selection = getUserSelection(console);
			done = processSelection( selection, console);
		}
		System.out.println("Thank you for using this program. Goodbye.");
	}
	private static boolean processSelection(String selection, Scanner console) { 
		boolean done = false;
		if (!selection.equalsIgnoreCase("E")){
			if (selection.equalsIgnoreCase("C")){
					calculateResults(console); 
			}
			
			else {
				System.out.println("Incorrect entry...please try again!");
			}
		}
		else {
			done = true;
		}
		 return done;
	}
	//gets the mathematical operations to work properly
	private static void calculateResults(Scanner console) {
		
		displayCalculatorInstructions();
		double operand1 = console.nextDouble();
		char operator = console.next().charAt(0);
		double operand2 = console.nextDouble(); 
		double result = 0.0; 
		boolean isOperatorValid = true;
		if (operator == '+'){
			result = operand1 + operand2;
		}
		else if (operator == '-'){
			result = operand1 - operand2; 
		}
		else if (operator == '*'){
			if(operator != 0.0) {
			result = operand1 * operand2; 
		}
		}
		else if (operator == '/'){
			if (operand2 != 0.0){
				result = operand1/operand2; 
			}
			else {
				result = Double.NaN; 
			}
		}
		else if (operator == '^'){
			result = Math.pow(operand1, operand2); 
		}
		else {
			isOperatorValid = false;
		}
		if (isOperatorValid){
			System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
		}
		
	}
	//Displays the instructions on how to properly enter your mathematical operations
	private static void displayCalculatorInstructions() {
		System.out.println("Enter a mathematical expression to evaluate.");
		System.out.println("Valid operations are: +, -, /, *, ^ (for exponents).");
		System.out.println("Input expression using spaces between the operands (numbers) "
				+ "and the operator, followed by Enter.");
		System.out.println("Here is the valid format:");
		System.out.println("\t<operand1> <space> <operator> <space> <operand2> <Enter>");
		System.out.print("Your expression: ");
	}
	
	private static String getUserSelection(Scanner console) {
		String selection = console.next(); 
		return selection;
	}

	private static void displayMenu() {
		System.out.println("Enter one these options:");
		System.out.println("\tC for using calculator");
		System.out.println("\tE for exiting this program");
		System.out.print("Your selection: ");
	}
}