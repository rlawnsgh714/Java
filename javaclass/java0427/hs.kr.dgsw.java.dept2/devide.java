public class devide {
    @Override
    public int calculate(){
        return  value1 / value2;
    }

    @Override
    public String getOperator(){
        return "/";
    }

    @Override
    public boolean isExitCondition(){
        return (value2 == 0);
    }

    public static void main(){
        Calculator devide = new devide();
        devide.execute();
    }


}
