package assignment;

public class Que006 {
public static void main(String[] args) {
//	1)
	
//	1
//	12
//	123
//	1234
//	12345
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
	System.out.println();
	}

System.out.println("-------------------------");
//2)

//1
//22
//333
//1234
//12345

for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
System.out.println();
}

System.out.println("-------------------------");


// 3)

//1
//01
//101
//010
//10101
   for(int i=1;i<=5;i++) {
	   for(int j=1;j<=i;j++)  {
		   int sum=i+j;
		   if (sum%2 == 0) {
			   System.out.print(1);
		   }
		   else {
			   System.out.print(0);
		   }
	   }
	   System.out.println();
	   }
   System.out.println("------------------");
 //4)

 //    1
 //   2 2
 //  3 3 3
 // 4 4 4 4 
 //5 5 5 5 5 
   
   for(int i=1;i<=5;i++) {
	   for(int k=4;k>=i;k--) {
		   System.out.print(" ");
	   }
		for(int j=1;j<=i;j++) {
			System.out.print(" "+i);
		}
	System.out.println();
	}
System.out.println("-------------------");
//5)

//     *
//    * * 
//   * * *
//  * * * *
//   * * * 
//    * *
//     * 
 for(int i=1;i<=4;i++) {
	   for(int k=6;k>=i;k--) {
		   System.out.print(" ");
	   }
	   for(int j=1;j<=i;j++) {
			System.out.print(" *");
	   }
      System.out.println();
 }
 for(int i=3; i>=1; i--) {
		for(int k=6;k>=i; k--) {
			System.out.print(" ");
		}
		 for(int j=1; j<=i; j++) {
			 System.out.print(" *");
		 }
		 System.out.println();
	 }
 
 
 
 
}
}
	   
	  	


