public class ThisForReturnExample {
    private int value;
    public ThisForReturnExample setValue (int value){
        this.value = value;
        return this;
    }
    public int getValue(){
        return this.value;
    }
    
    public static void main(String [] args){
        ThisForReturnExample example = new ThisForReturnExample();
        int result = example.setValue(42).getValue();
        System.out.println("Result" + result);
    }
}
