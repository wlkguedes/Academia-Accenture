package sef.module8.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {

	// 1 - Type main method and call catchMe with 10 and 0
	public static void main(String[] args) {
		ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();

		obj.catchMe(10, 0);
		obj.catchMe(10, 2);
	}

	void catchMe(int num1, int num2) {
		// The following code results in an Exception.
		// 2 - Identify the exception and write code to handle this exception.

		if ((num1 == 0) || (num2 == 0)) {
			System.out.println("Divisao por zero.");
		} else {
			int result = num1 / num2;
			System.out.println("The result is :" + result);
		}
		
		// 3 - After handling the exception, write a finally block which
		// prints a message "Thank you for using this program."
		System.out.println("Thank you for using this program.");
	}

	// 4- try to call catchMe with 10 and 2 now and see which messages get
	// printed.

}
