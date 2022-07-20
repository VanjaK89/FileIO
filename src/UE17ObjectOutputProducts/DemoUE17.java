package UE17ObjectOutputProducts;

import UE11ProductProductManager.Product;

import java.io.IOException;

public class DemoUE17 {
    public static void main(String[] args) throws IOException {
        ProductManagerUE17 pmgUE7 = new ProductManagerUE17();

        ProductUE17 p = new ProductUE17("choco", 2.99, "sweets");
        ProductUE17 p1 = new ProductUE17("Chocolate", 1.99, "sweets");
        ProductUE17 p2 = new ProductUE17("Rice", 2.99, "corn");
        ProductUE17 p3 = new ProductUE17("juice", 1.99, "drinks");
        ProductUE17 p4 = new ProductUE17("chicken", 5.99, "meat");
        pmgUE7.add(p);
        pmgUE7.add(p1);
        pmgUE7.add(p2);
        pmgUE7.add(p3);
        pmgUE7.add(p4);
        pmgUE7.saveToFile("dataText.dat");
        pmgUE7.readFromFile("dataText.dat");

    }
}
