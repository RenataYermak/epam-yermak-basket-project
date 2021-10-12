package by.epam.yermak.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    @Test
    public void countBallsByColor_shouldReturnCorrectCount() {
        Basket basket = new Basket();
        basket.addBall(new Ball(23.6, Color.RED));
        assertEquals(1, basket.countBallsByColor(Color.RED));
    }
}
