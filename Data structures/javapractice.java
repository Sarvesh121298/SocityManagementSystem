class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
}

public class javapractice{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry =new Employee();
        Employee sarvesh= new Employee();
        harry.id =11;
        harry.name ="codewithharry";

        sarvesh.id = 12;
        sarvesh.name ="sawant";
        // System.out.println(harry.id);
        // System.out.println(harry.name);
        harry.printDetails();
        sarvesh.printDetails();
    }
}