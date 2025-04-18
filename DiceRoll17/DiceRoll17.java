public class DiceRoll17 {
    public static void main(String[] args) {
        
        System.out.println(rollDice(3));
        
    }

    public static int rollDice(int numberOfDice) {
        int diceSum = 0;
        for (int i = 1; i <= numberOfDice; i++) {
            int diceRollRandom = ((int)(Math.random() * 6) + 1);
            diceSum = diceSum + diceRollRandom;
        }
        return diceSum;
    }
}