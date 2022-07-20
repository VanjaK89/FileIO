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
    public void saveToFile(String path){
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

    public void readFromFile(String path){
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<ProductUE17>prList = new ArrayList<>();
            Object object;
            while((object = objectInputStream.readObject()) != null) {
                ProductUE17 p = (ProductUE17) object;
                prList.add(p);
                System.out.println(p);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
