public class Thread_Interrupt extends Thread {
	public void run() {
		try {
			for(int i =0;i<500;i++) {
				System.out.println("T1 Thread: " + i);
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			System.out.println("Thread ���� ����");
			return;
		}
	}
}
