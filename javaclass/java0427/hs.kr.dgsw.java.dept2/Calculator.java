import java.util.Scanner;

public abstract class Calculator {
    protected final Scanner scanner;

    protected int value1;
    protected int value2;

    public Calculator(){
        this.scanner = new Scanner(System.in);
    }

    public void execute(){
        while(true) {
            this.inputValues();
//            if("/".equals(getOperator())){
//                if(value2 == 0)
//                    break;
//            }else {
//                if(value1 == 0 && value2 == 0){
//                    break;
//                }
//            }
            if(isExitCondition()){
                break;
            }

            int result = this.calculate();

            this.showResult(result);
        }
        this.scanner.close();
    }

    public void inputValues(){
        System.out.println("두 정수를 입력하세요.");
        this.value1 = this.scanner.nextInt();
        this.value2 = this.scanner.nextInt();
    }

    public abstract int calculate();

    public void showResult(int result){
        System.out.printf("%d %s %d = %d\n",value1, "", value2, result);
    }
    public abstract String getOperator();

    public boolean isExitCondition(){
        return (value1 == 0 && value2 == 0);
    }
}
