package Hello;

public class hellojava {
	public void sayHello() {
//		System.out.println("Hello World");
		sayHello("World");
	}
	
	public void sayHello(String name) {
//		System.out.println("Hello " + name + "!");
		System.out.printf("Hello %s!\n",name);
	}
}
