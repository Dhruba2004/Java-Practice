public class ConstructorOverloadingExample {
    public ConstructorOverloadingExample() {
        System.out.println("Default constructor called");
    }

    public ConstructorOverloadingExample(int number) {
        System.out.println("Constructor with one parameter called number" + number);
    }

    public ConstructorOverloadingExample(String string, int number) {
        System.out.println("Constructor with two parameter called" + string + number);

    }
}
