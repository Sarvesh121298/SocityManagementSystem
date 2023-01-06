import java.util.Scanner;

class userinfo {

    String username;

    int mobileNumber;

    int age;



    void createUser(userinfo user1) {

        System.out.println("Enter User Information");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");

        user1.username = sc.next();

        System.out.println("Enter your Mobile number");

        user1.mobileNumber = sc.nextInt();

        System.out.println("Enter Age");

        user1.age = sc.nextInt();



    }



    void displayUserInfo(userinfo user1) {

        System.out.println("Name: " + user1.username);

        System.out.println("Mobile Number: " + user1.mobileNumber);

        System.out.println("Age: " + user1.age);



    }



}



class User {



    public static void main(String[] args) {



        userinfo user1 = new userinfo();

        user1.createUser(user1);

        user1.displayUserInfo(user1);



    }

}