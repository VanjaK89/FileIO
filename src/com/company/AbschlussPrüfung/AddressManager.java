package com.company.AbschlussPrüfung;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {
    private ArrayList<Address> addresses = new ArrayList<>();

    public AddressManager() {
        this.addresses = addresses;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses() {
        this.addresses = addresses;
    }
    public void add(Address a){
        addresses.add(a);
    }
    public void exportToCsv(String path, String separator) throws AddressExportFileAlreadyExistsException {
//
//        if(file.exists()){
//            throw new AddressExportFileAlreadyExistsException("File already exists");
//        }
//        else{
        File file = new File(path);
            try {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for(Address a: addresses){
                    bufferedWriter.write(a.getFirstname() + separator + a.getLastname() +
                            separator + a.getMobilNumber() + separator +a.getEmail());
                    bufferedWriter.newLine();
                    System.out.println("Write to file: " + a);
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                System.out.println("File created and saved");
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
    public List<Address> loadFromCsv(String path, String separator){
        ArrayList<Address> newList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] tempArr = line.split(separator);
                if(tempArr.length != 4){
                    throw new AddressLoadWrongFormatException("4 Spalten erwartet");
                }
                newList.add(new Address(tempArr[0], tempArr[1], tempArr[2], tempArr[3]));
            }
            bufferedReader.close();
            System.out.println(newList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (AddressLoadWrongFormatException e) {
            e.printStackTrace();
        }
        return newList;

    }
}
