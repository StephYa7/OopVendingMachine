import java.util.ArrayList;

import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();
    private final static List<Product> initProducts = new ArrayList<>();

    static {
        initProducts.add(new Product("1", 55.5));
        initProducts.add(new Product("2", 22.5));
        initProducts.add(new Product("3", 33.3));
    }

    public VendingMachine() {
        this(initProducts);
    }

    public VendingMachine(List<Product> prods) {
        this.products = prods;
    }

    public VendingMachine(String name, Double price) {
        this.products.add(new Product(name, price));
    }

    public Product getProductBy(String inpName) {
        for (Product p : products) {
            if (p.getName().contains(inpName)) {
                return p;
            }
        }
        return null;
    }

    public Product getProductBy(Double inpName) {
        for (Product p : products) {
            if (p.getPrice().equals( inpName)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (Product p : products) {
            result += p.toString()+ "\n";
        }
        return result;
    }
}

