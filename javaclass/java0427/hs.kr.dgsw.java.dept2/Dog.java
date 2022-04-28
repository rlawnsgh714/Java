public class Dog extends Animal{
    @Override
    public String getName(){
        return "강아지";
    }

    @Override
    public String makeSound(){
        return "멍멍";
    }

    public void eat(){
        System.out.println("와구와구 먹습니댜");
    }

    public static void main(){
        Dog dog = new Dog();
        Animal dog1 = new Dog();
        dog1.move();
    }
}
