package thread;

public class Thread1 extends Thread{

	public void run() {
		for(int i=0;i<500;i++) {
			System.out.printf("t1 Thread: %d \n",i);
		}
	}
	
}
