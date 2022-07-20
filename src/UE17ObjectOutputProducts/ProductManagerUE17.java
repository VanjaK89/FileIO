package UE17ObjectOutputProducts;

import UE11ProductProductManager.Product;

import java.io.*;
import java.util.ArrayList;

public class ProductManagerUE17 {
    private ArrayList<ProductUE17> productUE17s = new ArrayList<>();

    public ProductManagerUE17() {
        this.productUE17s = productUE17s;

    }

    public void add(ProductUE17 p){
        productUE17s.add(p);
    }
    public void save(String path){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for(ProductUE17 p: productUE17s) {
                objectOutputStream.writeObject(p);
                System.out.println("getting the objects written in the file");
            }
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
