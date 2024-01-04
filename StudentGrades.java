
import java.util.*;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Grade");
        int gradeResult = scan.nextInt();

        switch (gradeResult) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
                System.out.println("you have an A");
                break;
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
                System.out.println("you have an B");
                break;
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79:
                System.out.println("you have an C");
                break;
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
                System.out.println("you have an D");
                break;
            default:
                System.out.println("you have an F");
                break;
        }
        scan.close();
    }
}
