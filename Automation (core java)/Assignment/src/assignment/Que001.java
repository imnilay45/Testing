package assignment;

import java.util.Scanner;

public class Que001 {
public static void main(String[] args) {
//Que1. W.A.J.P to Take three numbers from the user and print the greatest
//      number. 
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();	
	if(num1>num2) {
		System.out.println("Greatest Number is =  "+num1);
	}
	else if (num1>num2 && num1>num3) {
		System.out.println("Greatest Number is =  "+num1);
		}
	else if (num2>num1 && num1>num3) {
		System.out.println("Greatest Number is =  "+num2);
		}
	else if (num3>num1 && num3>num2) {
			System.out.println("Greatest Number is =  "+num3);
			}
	
	else {
		System.out.println("invalid input");
	}
}
}
