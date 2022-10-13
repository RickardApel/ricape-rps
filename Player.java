package games;

public class Player {

    int score;
    private String name;

    //constructor
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void ragequit() {
        System.exit(0);

    }


}
