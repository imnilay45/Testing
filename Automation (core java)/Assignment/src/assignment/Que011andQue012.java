package assignment;

public class Que011andQue012 {
public static void main(String[] args) {
//Que11.WAP to Compare Two String. 
	String s1 = "JAVA ";
	String s2 = "java";
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareToIgnoreCase(s2));
	
	System.out.println("----------------------------------------------------");
	
//WAP to concatenate a given string to the end of another string.
	
	String s3 = "java and ";
	String s4 = "python is widely used for web development.";
	System.out.println(s3.concat(s4));
}
}
