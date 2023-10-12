package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

    @Test
    public void testSepalLength() {
        double sepalLength = 5.5;
        flower.setSepalLength(sepalLength);
        Assertions.assertEquals(sepalLength, flower.getSepalLength(), 0.001);
    }

    @Test
    public void testFlowerType() {
        FlowerType flowerType = FlowerType.ROSE;
        flower.setFlowerType(flowerType);
        Assertions.assertEquals(flowerType, flower.getFlowerType());
    }

    @Test
    public void testDefaultConstructor() {
        Flower defaultFlower = new Flower();
        Assertions.assertEquals(0.0, defaultFlower.getPrice(), 0.001);
        Assertions.assertNull(defaultFlower.getFlowerType());
    }
}
