package games;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Rockpaperscissors {

    //@TODO: If the fields are not declared as private they can be manipulated from outside
    Player Rickard;
    Fist aifist;

    Rockpaperscissors(String playername, int playerscore) {
        Rickard = new Player(playername, playerscore);
        aifist = new Fist();

    }

    public static void main(String[] args) {
        Rockpaperscissors game = new Rockpaperscissors("**", 0);
        game.playgame();
    }

    //@FIXME: if you want to use these as global fields they should be declared up top, if you want them as local variables they should be declared within playgame()'s scope
    int aiscore = 0;
    int score = 0;

    void playgame() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Rock(1), Paper(2) or Scissors(3)?");
            int val = 4;
            Scanner scanner = new Scanner(System.in);
            val = scanner.nextInt();
            int fist = aifist.play();

            if (val > 3 || val < 1) {
                i = i - 1;
                System.out.println("Only the numbers 1,2,3 are available. Rock(1), Paper(2) or Scissors(3)?");
                val = scanner.nextInt();
            }



            if (val == fist) {
                i = i - 1;
                System.out.println("You choose the same. Its a tie!");
            }


            if (val == 2 & fist == 1) {
                score += +1;
                System.out.println("You choose Paper. Ai choose Rock. you win!");
            }

            if (val == 3 & fist == 1) {
                aiscore += +1;
                System.out.println("You choose Scissor. Ai choose Rock. You lose!");
            }

            if (val == 1 & fist == 2) {
                aiscore += +1;
                System.out.println("You choose Rock. Ai choose Paper. You lose!");
            }

            if (val == 3 & fist == 2) {
                score += +1;
                System.out.println("You choose Scissor. Ai choose Paper. You win!");
            }

            if (val == 1 & fist == 3) {
                score += +1;
                System.out.println("You choose Rock. Ai choose Scissor. You win!");
            }

            if (val == 2 & fist == 3) {
                aiscore += +1;
                System.out.println("You choose Paper. Ai choose Scissor. You lose!");
            }

            System.out.println("You " + score + "-" + aiscore + " Ai!");
        }
    }
}










