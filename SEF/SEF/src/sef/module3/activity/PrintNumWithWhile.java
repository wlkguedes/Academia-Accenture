/**
 * 
 */
package sef.module3.activity;

/**
 * @author Wilkie Guedes
 * 
 */
public class PrintNumWithWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Print all even numbers less than 100
		System.out.println("Print all even numbers less than 100");
		int i = 0;
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println();
		
		// write code to Print all odd numbers less than 100
		System.out.println("Print all odd numbers less than 100");
		int j = 0;
		while (j < 100) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
			j++;
		}
	}

}
