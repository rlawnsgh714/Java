package thread;

public class main {
	public static void main(String[] args) {
		
		System.out.printf("main 실행");
		
		Thread1 t1 = new Thread1();
//		Thread t1 = new Thread();
		
		Thread2 t2 = new Thread2();
//		Thread t2 = new Thread(mi2);
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<500;i++) {
					System.out.printf("t3 Thread: %d \n",i);
				}
			}
		});
		
		System.out.printf("t1 실행");
		t1.start();
		System.out.printf("t1 실행");
		t2.start();
		System.out.printf("t1 실행");
		t3.start();
		
		new Thread(()-> {
			for(int i=0;i<500;i++) {
				System.out.printf("t4 Thread: %d \n",i);
			}
		}).start();
		
		
		for(int i=0;i<500;i++) {
			System.out.printf("main Thread: %d \n",i);
		}
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
