package assignment;

import java.util.Scanner;

public class Que003 {
	public static void main(String[] args) {
//Que3. W.A.J.P to find factorial for Given Number. 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number to get factoral = ");
   int num = sc.nextInt();
   long factorial = 1;
   for(int i = 1;i<=num; i++) {
	   factorial*=i;}
	   System.out.println("factoral of "+ num +" = " + factorial);
	}
}
