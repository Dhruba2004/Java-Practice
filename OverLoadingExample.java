public class OverLoadingExample {
    public int add (int a,int b){
        return a+b;
    }
    public int add (int a,int b,int c){
        return a+b+c;
    }
    
    public static void main(String []args){
        OverLoadingExample example = new OverLoadingExample();
        System.out.println("Sum of two integers:"+example.add(2,3));
        System.out.println("Sum of three numbers:" + example.add(2,3,5));
    }
}
