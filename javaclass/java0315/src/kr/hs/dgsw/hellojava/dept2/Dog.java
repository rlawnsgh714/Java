package kr.hs.dgsw.hellojava.dept2;

public class Dog extends HelloTester {
	String name;
	String color;
	int age;
	
	public void makeSound() {
		System.out.println("멍멍");
	}
	
	public void eat(String food) {
		System.out.println(name + "이(가)" + food +"을(를) 먹는다");
	}
	
	public void printInformation() {
		System.out.printf("이름 : %s\n",name);
		System.out.printf("색깔 : %s\n",color);
		System.out.printf("나이 : %d\n",age);
	}
}
