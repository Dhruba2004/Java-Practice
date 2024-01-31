public class ThisConstructorExample {
    private String message;

    public ThisConstructorExample() {
        this("Hello World");
    }

    public ThisConstructorExample(String message) {
        this.message = message;
        System.out.println("Constructor invoked with message:" + message);

    }

    public static void main(String[] args) {
        ThisConstructorExample example = new ThisConstructorExample();

    }

}
