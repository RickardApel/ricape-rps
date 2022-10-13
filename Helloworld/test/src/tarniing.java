import java.util.Scanner;

public class tarniing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilken siffra tror du tärningen visar?");
        int x = scanner.nextInt();

        int min = 0;
        int max = 6;
        int z = (int) (Math.random()*(max-min)) + 1;

        while (x>6) {
            System.out.println("En tärning har 6 sidor. Försök igen!");
            x = scanner.nextInt();
        }
        if (x==z) {
            System.out.println("Du slog " + z + ". Du gissade rätt!");
        }
        else {
            System.out.println("Du slog " + z + ". Du gissade fel!");
        }




        }


    }

