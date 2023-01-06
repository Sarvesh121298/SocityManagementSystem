public class Child extends Parent {
    String childname;
    private byte  childage;
    private long childphno;
    public Child(String childname, byte childage, long childphno, int parentage, long parentphno ) {
        super(parentage,parentphno);
        super.name = name;
        super.place = place;
        this.childname = childname;
        this.childage = childage;
        this.childphno = childphno;
    }
    public static void main(String[] args) {
        Child childobj = new Child("Sarvesh", (byte) 24, 986798177,45,7474575 );
        childobj.display();
        
    }
    
}
