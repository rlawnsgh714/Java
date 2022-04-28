package network0427.CakeClass1;

public class CakeEater extends Thread{
    private CakePlate cake = null;

    public void CakeEater(CakePlate cake){
        this.cake=cake;
    }

    public void run(){
        for(int i=0;i<50;i++){
            cake.eatBread();
        }
    }
}
