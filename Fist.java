package games;

import java.util.*;

public class Fist {

    //@TODO: where can these fields come to use?
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    private Random random;

    Fist() {
        random = new Random();
    }

    public int play() {
        return (int) (Math.floor(Math.random() * 3) + 1);
    }
}
