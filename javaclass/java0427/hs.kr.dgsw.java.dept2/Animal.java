public abstract class Animal {
    public String getName(){
         return "동물";
    }

    public abstract String makeSound();

    public void move(){
        System.out.printf("%s가 %s 소리를 내며 움직입니다\n",getName()),makeSound());
    }

    public static void main(String[] args){
        Animal animal = new Dog();
        animal.move();
    }
}
