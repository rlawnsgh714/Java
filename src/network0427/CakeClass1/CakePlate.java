package network0427.CakeClass1;

public class CakePlate {
    private int breadCount = 0;
    public  CakePlate() {}

    public  synchronized void makeBread(){
        if(breadCount>=10){
            try{
                System.out.println("빵이 남는다.");
                wait();
            }catch (InterruptedException ire){ire.printStackTrace();}
        }
        breadCount++;
        System.out.println("빵을  1개 더 만듦 총 : " + breadCount + "개");
        this.notifyAll();
    }

    public synchronized void eatBread(){
        if(breadCount<=0){
            try{
                System.out.println("빵이 모자라 기다림.");
                wait();
            }catch (InterruptedException ire){}
        }
        breadCount--;
        System.out.println("빵을  1개 더 만듦 총 : " + breadCount + "개");
        this.notifyAll();
    }
}
