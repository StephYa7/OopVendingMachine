
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product prod = new Product("Чипсы", 50.0);

        Product prod2 = new Product("ffe");
//
//        System.out.println(prod);
//
//        System.out.println(prod2);



        List<Product> prods = new ArrayList<Product>();
        prods.add(new Product("1",22.2));
        prods.add(new Product("2",222.2));
        prods.add(new Product("3",24.4));
        prods.add(new Product("6",223.));
        prods.add(new Milk("milk", 44.2, 22));
        prods.add(new Beer("Bud",22.2, 3));
        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);
//
//        System.out.println( v1.getProductBy("3"));
//        System.out.println( v1.getProductBy(22.2));




    }
}
