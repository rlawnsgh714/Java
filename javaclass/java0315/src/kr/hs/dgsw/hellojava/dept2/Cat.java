package kr.hs.dgsw.hellojava.dept2;

public class Cat {
	String name;
	String color;
	String eyecolor;
	String eat;
	String play;
	String gender;
	int age;
	
	public void eat(String eat) {
		System.out.printf("%s이(가) %s를 먹는다\n",name,eat);
	}
	
	public void play(String play) {
		System.out.printf("%s이(가) %s 을(를) 가지고 논다\n",name,play);
	}
	
	public void postInformation() {
		System.out.printf("이름 : %s\n",name);
		System.out.printf("성별 : %s\n",gender);
		System.out.printf("나이 : %d\n",age);
		System.out.printf("색깔 : %s\n",color);
		System.out.printf("눈색깔 : %s\n",eyecolor);
		System.out.printf("\n");
	}
}
