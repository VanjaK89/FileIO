package UE11ProductProductManager;

public class ProductDemo {
    public static void main(String[] args) {


        ProductManager pmg = new ProductManager();
        Product p1 = new Product("Chocolate", 1.99, "sweets");
        Product p2 = new Product("Rice", 2.99, "corn");
        Product p3 = new Product("juice", 1.99, "drinks");
        Product p4 = new Product("chicken", 5.99, "meat");

        pmg.add(p1);
        pmg.add(p2);
        pmg.add(p3);
        pmg.add(p4);
        pmg.saveToFile("products.txt");
        pmg.readFromFile("products.txt");

    }
}
