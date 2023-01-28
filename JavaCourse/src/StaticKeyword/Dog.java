package StaticKeyword;

public class Dog {
    protected static int count = 0;

    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;
        Dog.display();
    }

    public static void display() {
        System.out.println("I am a dog!");
    }

}

