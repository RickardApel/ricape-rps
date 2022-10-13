import java.util.Scanner;

public class dag2uppg3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv första numret");
        int x = in.nextInt();
        System.out.println("Skriv andra numret");
        int y = in.nextInt();
        System.out.println("Skriv tredje numret");
        int z = in.nextInt();

        if (x > y && x > z) {
            System.out.println(x + " är största talet");
        }
        if (y > x && y > z) {
            System.out.println(y + " är största talet");
        }
        if (z > x && z > y) {
            System.out.println(z + " är största talet");
        }
    }
}


