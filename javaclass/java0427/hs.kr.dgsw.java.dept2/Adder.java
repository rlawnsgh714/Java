public class Adder extends Calculator{
    @Override
    public int calculate(){
        return  value1 + value2;
    }

    @Override
    public String getOperator(){
        return "+";
    }

    public static void main(){
        Calculator adder = new Adder();
        adder.execute();
    }
}
