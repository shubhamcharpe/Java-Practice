import java.util.*;
public class Input {
    public static void main (String []args){
//        String name = "Shubham charpe";
//        int  age = 18;
//        System.out.print("Name : "+name + "\nAge : "+age);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String Name = sc.nextLine();
        System.out.print("Enter your age : ");
        int Age = sc.nextInt();
        System.out.println("Name : " +Name + "\nAge : " +Age);
        sc.close();
    }
}
