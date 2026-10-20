import java.util.Scanner;
class Student {
    String name;
    int[] marks = new int[3];

    void inputDetails(Scanner sc) {
        System.out.print("Enter student name: ");
        name = sc.nextLine();

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for subject "
                    + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    void displayResult() {
        int total = calculateTotal();
        double average = calculateAverage();

        System.out.println("\n--- STUDENT MARK SHEET ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total + " / 300");
        System.out.println("Average: " + average);

        boolean passed = true;

        for (int mark : marks) {
            if (mark < 35) {
                passed = false;
                break;
            }
        }

        if (!passed) {
            System.out.println("Result: FAIL");
        } else if (average >= 90) {
            System.out.println("Result: PASS - Grade A");
        } else if (average >= 75) {
            System.out.println("Result: PASS - Grade B");
        } else if (average >= 50) {
            System.out.println("Result: PASS - Grade C");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

public class StudentMarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.inputDetails(sc);
        student.displayResult();

        sc.close();
    }
}
