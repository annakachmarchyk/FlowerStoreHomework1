package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;


    public FlowerPack() {
        this.flower = new Flower(flower);
        this.quantity = quantity;

    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

    public void setQuantity() {
        this.quantity = quantity < 1 ? 1 : quantity;

    }
}
