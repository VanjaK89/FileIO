package com.company.AbschlussPrüfung;

public class DemoAddress {
    public static void main(String[] args) {


        AddressManager addressManager = new AddressManager();
        String separator = ",";
        String path = "test.csv";

        Address a1 = new Address("Robert", "Leitener", "+43098988", "robert.leitner.com");
        Address a2 = new Address("Ana", "Leitener", "+43098988", "ana.leitner.com");
        Address a3 = new Address("Susi", "Leitener", "+43098988", "susi.leitner.com");
        Address a4 = new Address("Max", "Leitener", "+43098988", "max.leitner.com");

        addressManager.add(a1);
        addressManager.add(a2);
        addressManager.add(a3);
        addressManager.add(a4);

        try {
            addressManager.exportToCsv(path, separator);

        } catch (AddressExportFileAlreadyExistsException e) {
            e.printStackTrace();
        }
        addressManager.loadFromCsv(path, separator);
    }
}