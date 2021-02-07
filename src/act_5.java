import java.util.Scanner;

public class act_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Prelim Grade: ");
        int x = in.nextInt();
        System.out.print("Enter the Midterm Grade: ");
        int y = in.nextInt();
        System.out.print("Enter the Final Grade: ");
        int z = in.nextInt();
        System.out.println("The Average Grade is: " + ((x + y + z)/3));

    }
}
