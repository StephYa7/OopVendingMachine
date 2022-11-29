
public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this(name);
        this.price = price;
    }

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price > 0) this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s %,.2f",this.name,this.price);
    }
}

