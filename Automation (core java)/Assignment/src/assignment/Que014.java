package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide{
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b>0) {
			int c = a/b;
			System.out.println("c = "+c);
		}else {
			throw new ArithmeticException("msg");
		}
	}
}


public class Que014 {
public static void main(String[] args) {
	try {
		Divide d = new Divide();
		d.division();
		}
	catch (ArithmeticException e) {
	System.out.println("ArithmeticException msg");
		}
	
}
}
