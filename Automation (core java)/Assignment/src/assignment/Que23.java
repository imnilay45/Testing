package assignment;

public class Que23 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		int[]array1 = {};
		
		for(int index=0;index<array.length;index++) {
			array1=array;
		}
			
		System.out.println("elements of original array = ");
		for(int index=0;index<array.length;index++) {
		System.out.println(array[index]+"");
		}
		
		System.out.println();
		
		
		System.out.println("elements of new array = ");
		for(int index=0;index<array.length;index++) {
		System.out.println(array1[index]+"");
		}
		
		System.out.println();
		
	}
	
}
