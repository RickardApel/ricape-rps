package games;

import java.util.Scanner;

public class Dicegame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice(6);
        Player Rickard = new Player("rickard", 0);
        for (int i = 0; i < 3; i++) {

            int ratt=2-i;

            int result = dice.roll();

            System.out.println("Guess what the dice roll");
            int guess = scanner.nextInt();

            while (guess>6) {
                System.out.println("En tärning har 6 sidor. Försök igen!");
                guess = scanner.nextInt();
            }

            System.out.println("Tärningen slog " + result + "\n" +
                    "Du gissade " + guess);

            if (guess == result) {
                System.out.println("Du vann! "  + ratt + " försök kvar!");

            } else {
                System.out.println("Du förlorade! " + ratt + " försök kvar!");
            }

        }
    }
}
