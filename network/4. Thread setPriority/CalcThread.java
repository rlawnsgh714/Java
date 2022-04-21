public class Thread_setPriority extends Thread {
    public Thread_setPriority(String name) {
        setName(name);
    }
    
    @Override
    public void run() {
        for (long i = 0; i < 2000000000; i++) {
            
        }
        System.out.println(getName());
    }
}