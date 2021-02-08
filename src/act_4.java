import java.util.Scanner;

public class act_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput First Number: ");
        int n = in.nextInt();
        System.out.print("Input Second Number: ");
        int y = in.nextInt();
        System.out.println("The Sum of " + n + " and " + y + " is: " + (n + y));
        System.out.println("The Product of " + n + " and " + y + " is: " + (n * y));
    }
}
