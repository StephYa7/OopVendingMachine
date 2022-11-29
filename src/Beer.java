import java.util.PrimitiveIterator;

public class Beer extends Product {

    public Beer(String name) {
        super(name);
    }

    private Integer alcohol;

    public Beer(String name, Double price) {
        super(name, price);
    }

    public Beer(String name, Double price, Integer alcohol) {
        super(name, price);
        this.alcohol = alcohol;

    }

    public Integer getAlcohol() {
        return alcohol;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", super.toString(),alcohol);
    }
}
