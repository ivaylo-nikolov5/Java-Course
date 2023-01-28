package InnerClasses;

public class OuterClass {
    public void inner() {
        class InnerClass {
            public void display() {
                System.out.println("This is a inner class!");
            }
        }
        InnerClass in = new InnerClass();
        in.display();
    }
}
