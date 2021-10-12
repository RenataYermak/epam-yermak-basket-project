package by.epam.yermak.runner;

import by.epam.yermak.model.Ball;
import by.epam.yermak.model.Basket;
import by.epam.yermak.model.Color;
import by.epam.yermak.util.RandomUtil;

public class Main {
    public static final Integer BALLS_COUNT = 20;

    public static void main(String[] args) {
        Basket basket = new Basket();
        for (int i = 0; i < BALLS_COUNT; i++) {
            basket.addBall(new Ball(RandomUtil.getRandomWeight(),RandomUtil.gerRandomColor()));
        }

        System.out.println("Weight of balls: " + String.format("%.2f", basket.getWeight()) + "kg");
        System.out.println("Count of " + Color.BLUE + " balls: " + basket.countBallsByColor(Color.BLUE));
        System.out.println("Count of " + Color.RED + " balls: " + basket.countBallsByColor(Color.RED));
    }
}
