package assignment;

import java.util.Scanner;

public class Que013 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks :  ");
	int marks = sc.nextInt();
	if (marks<=40) {
		System.out.println("Fail");
	}
	else if (marks>40 && marks<=50) {
		System.out.println("DD Grade ");
	}
	else if (marks>40 && marks<=50) {
		System.out.println("DD Grade ");
	}else if (marks>51 && marks<=60) {
		System.out.println("CD Grade ");
	}else if (marks>61 && marks<=70) {
		System.out.println("BC Grade ");
	}else if (marks>71 && marks<=80) {
		System.out.println("BB Grade ");
	}else if (marks>81&& marks<=90) {
		System.out.println("AB Grade ");
	}else if (marks>91 && marks<=100) {
		System.out.println("AA Grade ");
	}
	else {
		System.out.println("Invalid input");
	}
}

}
