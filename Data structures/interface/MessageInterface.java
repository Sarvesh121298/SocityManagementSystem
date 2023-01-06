//sharath

public interface MessageInterface{
    void sendmessage();

    void receiveMessage();

    void reply();

    default void notification(){
        System.out.println("notify");
    }
    

}