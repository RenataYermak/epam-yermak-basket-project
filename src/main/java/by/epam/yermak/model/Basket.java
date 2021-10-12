package by.epam.yermak.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Ball> balls;

    private Double weight;

    public Basket() {
        this.balls = new ArrayList<>();
        this.weight = 0.0;
    }

    public void addBall(Ball ball) {
        this.balls.add(ball);
        this.weight += ball.getWeight();
    }

    public Double getWeight() {
        return this.weight;
    }

    public  Integer countBallsByColor(Color color) {
        int count = 0;
        for (Ball ball: balls) {
            if (ball.getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }
}
