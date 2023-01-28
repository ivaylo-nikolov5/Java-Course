package Classes;

public class CreatingClasses {
    public static void main(String[] args) {
        Dog archie = new Dog("Archie", 3);
        archie.speak();

        Dog jack = new Dog("Jack", 1);
        jack.speak();

        Dog ruffus = new Dog("Ruffus", 6);
        ruffus.speak();

        jack.setAge(4);
        jack.speak();
    }
}
