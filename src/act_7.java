import java.util.Scanner;

public class act_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Distance(Miles): ");
        double d = in.nextDouble();
        System.out.print("Enter the Speed(Mph): ");
        double s = in.nextDouble();

        System.out.println("The Time Required to Travel " + d + " with a speed of " + s + " is "
                + (String.format("%.2f", (d / s))) + " hrs");
    }
}
