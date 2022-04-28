package network0427.CakeClass1;

public class CakeMaker extends Thread{
    CakePlate cake = null;

    public void CakeMaker(CakePlate cake){
        this.cake=cake;
    }

    public void run(){
        for(int i=0;i<50;i++){
            cake.makeBread();
        }
    }
}
