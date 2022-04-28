package network.src.thread;

public class Thread2 extends Thread {
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.printf("t2 Thread: %d \n",i);
		}
	}
}
 