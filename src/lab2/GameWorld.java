package lab2;

public class GameWorld {

    private int spaceSectorNumber;
    private Player gameCharacter;

    
    public GameWorld(int spaceSectorNumber, String charName) {

        if (charName == null || charName.length() == 0) {
            System.out.println("Input Error: Character name must contain characters");
        } else {
            gameCharacter.setPlayerInfo(charName);
        }
        this.spaceSectorNumber = spaceSectorNumber;
    }

    public int getSpaceSectorNumber() {
        return spaceSectorNumber;
    }

    public void setSpaceSectorNumber(int spaceSectorNumber) {
        this.spaceSectorNumber = spaceSectorNumber;
    }

    public static void main(String[] args) {

        GameWorld gameWorld = new GameWorld(1, "Bob");
   }
}
