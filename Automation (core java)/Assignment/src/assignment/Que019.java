package assignment;
class runnablethread implements Runnable{


	public void run() {
			for (int i =1; i<5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
		
			
		}
	}
	

public class Que019 {
public static void main(String[] args) {
//    Que18 WAP to create one thread by implementing Runnable interface in 
//	           Class.
	runnablethread t1 = new runnablethread();
		t1.run();
		
	
}
}
