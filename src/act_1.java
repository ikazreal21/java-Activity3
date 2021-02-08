import java.util.Scanner;

public class act_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a Dollar Amount: ");
        float n = in.nextFloat();
        System.out.println("The Peso Equivalents: " + (n * 50.75));

    }
}
