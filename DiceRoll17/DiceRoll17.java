public class DiceRoll17 {
    public static void main(String[] args) {
        
        int dice1 = rollDice();
        int dice2 = rollDice();
        int diceSum = dice1 + dice2;
        System.out.print(dice1 + " + " + dice2 + " = " + diceSum + "\n");
        
    }

    public static int rollDice() {
        int dice = ((int)(Math.random() * 6) + 1);
        return dice;

    }
}