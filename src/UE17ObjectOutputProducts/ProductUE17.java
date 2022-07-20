package UE17ObjectOutputProducts;

import java.io.Serializable;

public class ProductUE17 implements Serializable {
    private String productName;
    private double price;
    private String productCategory;

    public ProductUE17(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "ProductUE17{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}
