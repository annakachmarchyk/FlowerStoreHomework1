package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower(5, FlowerColor.RED, price, FlowerType.ROSE);
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }

    @Test
    public void testTotalPriceWithMultipleFlowerPacks() {
        Flower rose = new Flower(5, FlowerColor.RED, 10, FlowerType.ROSE);
        Flower tulip = new Flower(6, FlowerColor.BLUE, 8, FlowerType.TULIP);

        FlowerPack rosePack = new FlowerPack(rose, 5);
        FlowerPack tulipPack = new FlowerPack(tulip, 3);

        flowerBucket.add(rosePack);
        flowerBucket.add(tulipPack);

        Assertions.assertEquals((5 * 10) + (3 * 8), flowerBucket.getPrice());
    }


}
