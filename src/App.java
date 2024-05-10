import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("***Cone***");
        System.out.println("--------------");
        System.out.print("Please, enter the Cone's base radius: ");
        double radius = sc.nextDouble();

        System.out.print("\n--------------\n");
        System.out.print("Please, enter cone's height: ");
        double height = sc.nextDouble();

        Cone c1 = new Cone(radius, height);

        System.out.printf("\n Cone information: %s\n", c1);
    }
}
