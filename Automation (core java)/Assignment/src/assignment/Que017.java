package assignment;

/* Que16.W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It 
has two subclasses each having a method with the same name 
'message' that prints "This is first subclass" and "This is second 
subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.

*/abstract class A{
	abstract public void message();
}
class B extends A{

	public void message() {
		System.out.println("This is first subclass");
	}
}
class C extends A{

	public void message() {	
		System.out.println("This is second subclass");
	}	
}
public class Que017 {
public static void main(String[] args) {
	B b = new B();
	b.message();
	
	C c = new C();
	c.message();
}
}
