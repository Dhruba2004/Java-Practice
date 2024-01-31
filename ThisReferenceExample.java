public class ThisReferenceExample {
    private int exampleVar;

    public ThisReferenceExample(int exampleVar) {
        this.exampleVar = exampleVar;
    }

    public void printValue(int example) {
        System.out.println("Instance variable" + this.exampleVar);
        System.out.println("Method parameter" + exampleVar);
    }

    public static void main(String[] args) {
        ThisReferenceExample example = new ThisReferenceExample(42);
        example.printValue(10);
    }

}
