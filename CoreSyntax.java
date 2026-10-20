
import java.util.Scanner;
public class CoreSyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables and data types
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your mark: ");
        double mark = sc.nextDouble();

        // If-else
        if (mark >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        // For loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While loop
        int count = 1;
        while (count <= 3) {
            System.out.println("Practice " + count);
            count++;
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);

        sc.close();
    }
}
