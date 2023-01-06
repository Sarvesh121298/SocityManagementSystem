import java.util.Scanner;

class pr1 {
    public static void main(String[] args) {
    String name = "SARVESH";   
    System.out.println(name);

    int a = 45, x = 24, y = 45;
    float b = 45.2f;
    System.out.println(a);
    System.out.println(b);
    boolean isadult = false;
    System.out.println(isadult);
    System.out.println(x);
    int num1 = 45, num2 = 77;
    System.out.print("The value of num1 + num2 is : ");
    System.out.println(num1 + num2);
    System.out.print("The value of num1 - num2 is : ");
    System.out.println(num1 - num2);
    System.out.print("The value of num1 * num2 is : ");
    System.out.println(num1 * num2);
    System.out.print("The value of num1 / num2 is : ");
    System.out.println(num1 % num2);
    System.out.println(num1++);
    System.out.println(++num1);
    System.out.println(num1--);
    System.out.println(--num1);

   // Scanner scan = new Scanner(System.in);
   // System.out.println("Enter your name");
   // String input = scan.next();
    //System.out.println(input);
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter age");
    int input = scan.nextInt();
        int age = 3;
    if (age>5){
        System.out.println("Yor r not kid");

    }
    else{
        System.out.println("U R KID");
    }

    }


}