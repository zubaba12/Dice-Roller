import java.util.Random;

public class RollerADice {
    public static void main(String[] args) {
        Random chance = new Random();
        int newRoll = chance.nextInt(6) + 1;
        System.out.println("You rolled a: " + newRoll);
    }
}