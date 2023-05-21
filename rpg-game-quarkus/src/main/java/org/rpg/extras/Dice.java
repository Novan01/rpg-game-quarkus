package org.rpg.extras;
import java.util.Random;

public class Dice {
    Random generator = new Random();

    public int rollD3() {
        return generator.nextInt(3) + 1;
    }

    public int rollD6() {
        return generator.nextInt(6) + 1;
    }

    public int rollD8() {
        return generator.nextInt(8) + 1;
    }

    public int rollD10() {
        return generator.nextInt(10) + 1;
    }

    public int rollD20() {
        return generator.nextInt(20) + 1;
    }
}
