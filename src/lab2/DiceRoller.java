
package lab2;

public final class DiceRoller {

    private int die1;
    private int die2;

    public DiceRoller() {
        roll();
    }

    public void roll() {

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) +1;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public int getTotal() {
        return die1 + die2;
    }
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();
        
        diceRoller.roll();
        System.out.println(diceRoller.getTotal());
        
    }
}
