public class child extends parent {
    void show(){
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        child chiobj = new child();
        chiobj.call();

        
    }
    void call(){
        //this.show();
        super.show();
    }
    
}
