/*
 * Created on Jun 25, 2008
 *
 * Hello World Program
 */

package sef.module3.sample;

import java.lang.*;

/**
 * @author John Doe
 */
public class MainSample {

	public static void main(String[] args) {
		// This line prints out the String 'Hello World!' in the console

		String aluno = args[0];
		String sobrenome = args[1];
		System.out.println("Welcome " + aluno + " " + sobrenome + "!");

	}
}