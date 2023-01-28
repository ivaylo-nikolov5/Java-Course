package Classes;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old.");
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int age) {
        this.age = age;
        return getAge();
    }
}
