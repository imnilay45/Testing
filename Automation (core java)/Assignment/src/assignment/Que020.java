package assignment;
class Thread1 extends Thread{
	public void run() {
		for (int i=5;i>=1;i--) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Que020 {
public static void main(String[] args) {
//     Que20.WAP to create one thread by extending Thread class in another Class.
	Thread1 t1 = new Thread1();
	t1.run();
}
}
