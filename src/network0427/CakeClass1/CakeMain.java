package network0427.CakeClass1;

public class CakeMain {
    public static void main(String[] args) {
        CakePlate cake = new CakePlate();
        CakeMaker baker = new CakeMaker();
        CakeEater eater = new CakeEater();

        baker.start();
        eater.start();
    }
}
