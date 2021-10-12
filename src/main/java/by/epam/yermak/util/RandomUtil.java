package by.epam.yermak.util;

import by.epam.yermak.model.Color;

import java.util.Random;

public final class RandomUtil {
    private static final Random random = new Random();

    public static Color gerRandomColor() {
        int pos = random.nextInt(Color.values().length);
        return Color.values()[pos];
    }

    public static Double getRandomWeight() {
        double min = 0.0;
        double max = 20.0;
        return min + (max - min) * random.nextDouble();
    }
}
