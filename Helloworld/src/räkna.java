import java.util.Scanner;

public class räkna {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("skriv tal");
        int num1 = in.nextInt();
        System.out.println();
        int num2 = in.nextInt();
        System.out.println();
        int num3 = in.nextInt();
        System.out.println(num1 - num2 + num3);

    }
}
