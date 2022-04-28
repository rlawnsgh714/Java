package network0427.Thread;

import java.util.concurrent.Semaphore;

public class Thread1 implements Runnable{
    private Semaphore sem = new Semaphore(1);
    private Semaphore sem1 = new Semaphore(1);
    private int i=0;


    public void run(){
        while(i<500){
            for(int j=0;j<2000;j++){
                try {
                    sem.acquire();
                    System.out.println((Thread.currentThread()).getName() + " i = " + i);
                    System.out.println();
                    i++;
                    sem.release();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
