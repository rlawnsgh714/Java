package kr.hs.dgsw.hellojava.dept2;

public class CatTester extends Cat {
	public static void main(String[] args) {
		Cat sham = new Cat();
		Cat persian = new Cat();
		
		sham.name = "새벽";
		sham.gender = "암컷";
		sham.color = "검은색";
		sham.eyecolor = "노란색";
		sham.age = 4;
		
		persian.name = "태양";
		persian.gender = "수컷";
		persian.color = "흰색";
		persian.eyecolor = "파란색";
		persian.age = 1;
		
		sham.eat("츄르");
		sham.play("깃털");
		sham.postInformation();
		
		persian.eat("사료");
		persian.play("공");
		persian.postInformation();
	}
}
