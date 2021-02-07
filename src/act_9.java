import java.util.Scanner;

public class act_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Feet Value: ");
        int feet = in.nextInt();
        System.out.println(feet + " feet to Inches: " + (feet * 12));
    }
}
