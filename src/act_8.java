import java.util.Scanner;

public class act_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Length: ");
        double len = in.nextInt();
        System.out.print("Enter The Width: ");
        double wid = in.nextInt();
        System.out.println("The Area of the Rectangle by given Length and Width is " + (len * wid)
                + " and the perimeter is " + ((len + wid) * 2));

    }
}
