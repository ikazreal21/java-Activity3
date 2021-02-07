import java.util.Scanner;

public class act_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the Sphere: ");
        double radius = in.nextDouble();
        System.out.println("The Volume of the Sphere is: "
                + String.format("%.4f", ((4 / 3) * Math.PI * radius * radius * radius)));
    }

}
