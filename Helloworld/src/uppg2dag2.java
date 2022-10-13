/**
import java.util.Scanner;

public class uppg2dag2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("skriv a");
        double a = in.nextDouble();
        System.out.println("skriv b");
        double b = in.nextDouble();
        System.out.println("skriv c");
        double c = in.nextDouble();
        double result = b * b - 4.0 * a * c;
        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0, 5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0, 5)) / (2.0 * a);
            System.out.println("Roten är" + r1 + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("Roten är + r1");
        } else {
            System.out.println("Resultatet har  ingen roten ur");
        }
    }
}
 **/

