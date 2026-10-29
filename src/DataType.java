import java.util.*;
public class DataType {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        System.out.print("Enter your grade : ");
        char grade = s.next().charAt(0);
        s.nextLine();
        System.out.print("Enter your roll no. : ");
        String roll = s.nextLine();
        System.out.print("Enter your marks : ");
        double marks = s.nextDouble();

        System.out.println("Name :"+name);
        System.out.println("Age : "+age);
        System.out.println("Grade : "+ grade);
        System.out.println("Roll No. :"+roll);
        System.out.println("Marks : "+marks);
    }
}