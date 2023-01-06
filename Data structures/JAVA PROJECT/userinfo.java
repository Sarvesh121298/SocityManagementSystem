import java.util.Scanner;

public class userinfo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your details");


        System.out.println("whats your name");
        String name = scan.next();
        //System.out.println(name);

        System.out.println("Whats your age");
        int age = scan.nextInt();
        //System.out.println(age);

        System.out.println("Whats your Id ");
        int id = scan.nextInt();

        System.out.println("company name");
        String Companyname = scan.next();

        System.out.println("Position");
        String position = scan.next();

        System.out.println("Location");
        String Location = scan.next();

    }
        
    }

