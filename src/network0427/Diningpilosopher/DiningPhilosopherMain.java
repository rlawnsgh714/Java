package network0427.Diningpilosopher;

import java.util.concurrent.Semaphore;

public class DiningPhilosopherMain extends Thread{
    static final int num = 5;
    public static void main(String[] args) {
        int i;

        Semaphore[] stick = new Semaphore[num];

        for (i=0; i<num; i++)
            stick[i] = new Semaphore(1);


        Thread_DiningPhilosopher[] phil = new Thread_DiningPhilosopher[num];

        for (i=0; i<num; i++) {

            phil[i] = new Thread_DiningPhilosopher(i, stick[i], stick[(i+1)%num]);
        }
//        첫 번째 정답
//        for (i=0; i<num; i++) {
//            if(i%2==0) {
//                phil[i] = new Thread_DiningPhilosopher(i, stick[i], stick[(i+1)%num]);
//            } else {
//                phil[i] = new Thread_DiningPhilosopher(i, stick[(i+1)%num], stick[i]);
//            }
//        }
        for (i=0; i<num; i++)
            phil[i].start();
    }
}