package assignment;

import java.util.Scanner;

public class Que004 {
public static void main(String[] args) {
// Que4.W.A.J.P to check given number is Prime or not? 	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number to check if it's prime or not = ");
	int num =sc.nextInt();
	boolean flag = false;
	for(int i = 2; i<=num/2;i++ ) {
		if(num %i == 0){
			flag = true;
			
		} 
	}
	if(!flag) {
		System.out.println(num + " is a prime number");
	}
	else {
		System.out.println(num + " is not a prime number");
	}
		
		
		
	}	
}


