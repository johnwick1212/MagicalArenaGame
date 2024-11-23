package files;
import java.util.Random;
class Dice {
    private final int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }
}