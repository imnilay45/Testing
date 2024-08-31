package assignment;

public class Que009 {
public static void main(String[] args) {
//Que9 WAP to calculate the average value of array elements. 
   int [] array = {1,2,3,4,5};
   int sum=0;
    for (int i=0;i<array.length;i++) {
    	sum=sum+array[i];
   }
    
    int average=sum/5;
    System.out.println("The average value of array is = "+average);
    
	}
	
	
}

