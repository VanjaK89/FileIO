package UE11ProductProductManager;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> list = new ArrayList<>();

    public void add(Product p){
        list.add(p);
    }
    public void saveToFile(String path){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Product p: list){
                bufferedWriter.write(p.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Product Information successfully saved");
    }
    public void readFromFile(String path){
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Product Information successfully read");
    }


}
