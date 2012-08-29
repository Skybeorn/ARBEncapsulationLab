package lab2;

public class Game {

    private boolean wonDuel;
    private GameWorld gameWorld;

    public Game(boolean wonDuel, GameWorld gameWorld) {
        this.wonDuel = wonDuel;
        this.gameWorld = gameWorld;
    }

    public void startGame() {
    }

    public boolean isWonMatch() {
        return wonDuel;
    }

    public void setWonMatch(boolean wonMatch) {
        this.wonDuel = wonMatch;
    }

}
