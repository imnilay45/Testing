package assignment;

public class Que007 {
public static void main(String[] args) {
//Que7.AP to compute the sum of the first 100 prime numbers. 
  
	int counter=0, sum=0;
	for(int num=1;num<=100;num++){
		counter=0;
		for(int i=2;i<=num/2;i++) {
			if (num%i ==0)	{
				counter++;
				break;
			  }
			}
		
		if(counter==0 && num!=1) {
			sum=sum+num;
		}
	}
	System.out.println("Sum of the first 100 prime numbers = " +sum);
}
}
