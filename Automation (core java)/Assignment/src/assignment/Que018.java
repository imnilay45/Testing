package assignment;

import java.util.Scanner;

/*Que17. W.A.J.P. to create a custom exception if Customer withdraw amount 
which is greater than account balance then program will show custom 
exception otherwise amount will deduct from account balance. 
Account balance is:2000 Enter withdraw 
amount:2500 
Sorry, insufficient balance, you need more 500 Rs. To perform 
this transaction.*/


public class Que018 {
public static void main(String[] args) {
	;
	try{
		Scanner sc = new Scanner(System.in);
		System.out.print("Account balance = " );
        int bal = sc.nextInt();
        System.out.println("enter amount to withdraw");
        int withdraw = sc.nextInt();
        boolean c= bal>withdraw;
        System.out.println(c);
	}
	catch(Exception e) {
		System.out.println("Sorry, insufficient balance, you need more 500 Rs. To perform"
				+ "this transaction.");
	}
	
	}
	
	
	
	
	
}

