public class Thread_InterruptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_Interrupt t1 = new Thread_Interrupt();

		t1.start();
		
		for(int i =0;i<200;i++) {
			System.out.println("main Thread: " + i);
		}
		t1.interrupt();
	}

}
