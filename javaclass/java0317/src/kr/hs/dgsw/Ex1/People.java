package kr.hs.dgsw.Ex1;

public class People {
	String name;
	int size;
	double height;
	
	public void BMI(String name,int size, double height) {
		double result = height / ((size * 0.01)  * (size * 0.01));
		printBMI(name,result);
	}
	
	public void printBMI(String name,double result) {
		if(result < 20)
			System.out.printf("%s의 비만도는 %.2f이고 저체중입니다\n",name,result);
		else if(result >= 20 && result < 25)
			System.out.printf("%s의 비만도는 %.2f이고 표준체중입니다\n",name,result);
		else if(result > 25)
			System.out.printf("%s의 비만도는 %.2f이고 과체중입니다\n",name,result);
	}
}
