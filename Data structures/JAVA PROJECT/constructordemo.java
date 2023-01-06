public class constructordemo {
    String userName;
    String userPlace;
    int userAge;
    public constructordemo(String userName,int userAge,String userPlace){//PARAMETERISED
        this.userName = userName;
        this.userAge = userAge;
        this.userPlace= userPlace;
        System.out.println("constructor is called");
    }

    public static void main(String[] args) {
        constructordemo obj = new constructordemo("Sarvesh",24,"mumbai");
       // obj.userName="Sarvesh";
        constructordemo sarvesh = new constructordemo("Ravi",19,"pune");
        //methodName(); call method
        obj.show();
        Sarvesh.show(;)
    Void show(){
        
        System.out.println(this.userName);
        System.out.println(this.userAge);
        System.out.println(this.userPlace);
    }
    }
    
}
