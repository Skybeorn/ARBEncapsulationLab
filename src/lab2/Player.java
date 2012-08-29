package lab2;

public final class Player {

    private String pName;
    private DiceRoller diceRoller;

    public Player(String pName, String pColor) {
        this.pName = pName;
    }

    public void rollDice() {
        diceRoller.roll();
    }

    public String getPlayerInfo() {
        return pName;
    }

    public void setPlayerInfo(String pName) {
        if (pName == null || pName.length() == 0) {
            System.out.println("Error: Must contain Characters.");
        } else {
            this.pName = pName;
        }

    }

    public static void main(String[] args) {
        Player player = new Player("Andy", "Red");
        player.rollDice();
    }
}
