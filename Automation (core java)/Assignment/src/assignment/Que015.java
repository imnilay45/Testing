package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Que015 {
public static void main(String[] args) {
	
	//Que15.WAP to demonstrate multiple catch blocks 
	try {
	
		Scanner sc = new  Scanner(System.in);
	System.out.println("enter a = ");
	int a = sc.nextInt();
	System.out.println("enter b = ");
		int b = sc.nextInt();
		int c = a/b;
	System.out.println("c = "+c);
	} catch (ArithmeticException e) {
		System.out.println("denominator should be greater than 0");
	}
	catch(InputMismatchException e) {
		System.out.println("denominator should be numeric value");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
