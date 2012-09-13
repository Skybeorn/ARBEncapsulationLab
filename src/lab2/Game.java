package lab2;

public class Game {
    
    private GameBoard gameBoard;

    private Player[] players;

    public void startGame() {
        loadSavedGame();
    }

    public void loadSavedGame() {
    }

    public void EndGame() {
        saveGameStatus();
    }

    private void saveGameStatus() {
    }
}
