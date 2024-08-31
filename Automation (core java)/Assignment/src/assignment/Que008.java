package assignment;

import java.util.Scanner;

public class Que008 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a size of array = ");
	int size=sc.nextInt();
	System.out.println("---------------------------------");
	int a[]=new int[size];
	for(int index=0;index<a.length;index++) {
		System.out.print("Enter element at a ["+index+"] : ");
		a[index] = sc.nextInt();
	}
	System.out.println("---------------------------------");
	int sum=0;
	for(int index=0;index<a.length;index++) {
		sum=sum+a[index];
		System.out.println("sum of element = "+ sum);
	}
}
}
