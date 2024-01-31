public class ThisKeywordExample {
    private String message;

    public ThisKeywordExample(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Message from displayMessage method" + this.message);
    }

    public void updateMessage(String newMessage) {
        this.displayMessage();
        this.message = newMessage;
        System.out.println("Message updated to" + this.message);
    }

    public static void main(String[] args) {
        ThisKeywordExample example = new ThisKeywordExample("Hello World");
        example.updateMessage("New message");
    }

}
