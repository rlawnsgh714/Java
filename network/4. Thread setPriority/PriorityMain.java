public class PriorityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<=10;i++) {	
				Thread t1 = new Thread_setPriority("thread" + i);
				
				// t1.setPriority(i);
				// t1.setPriority(Thread.MAX_PRIORITY);
				// t1.setPriority(Thread.MIN_PRIORITY);
				// t1.setPriority(Thread.NORM_PRIORITY);
				
				if(i == 10) {
					t1.setPriority(Thread.MAX_PRIORITY);
				} else {
					t1.setPriority(Thread.NORM_PRIORITY);
				}
				t1.start();
			}
	}

}
