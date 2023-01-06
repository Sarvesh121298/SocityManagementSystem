public class Parent{
    String name;
    private int Age;
    private long phno;
    static String place;
    public Parent(int age, long phno) {
        Age = age;
        this.phno = phno;
    }
    public Parent(){

    }

    


    void display(){
        System.out.println("Name: " +name);
        System.out.println("Age :" +Age );
        System.out.println("phno : " +phno);
        System.out.println("place : " + place);
    }

    static void show(){
    //     System.out.println("Name :"+ name);
    //     System.out.println("Age :" +Age );
    //     System.out.println("phno : " +phno);
    //     System.out.println("place : " + place);
    // }


    }

}