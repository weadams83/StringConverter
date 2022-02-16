package com.personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsToConvert {

    private String input;

    private String invoiceCode;

    private String equipment;

    private String batchToYN;

    public StringsToConvert(String input, String invoiceCode, String equipment, String batchToYN) {
        this.input = input;
        this.invoiceCode = invoiceCode;
        this.equipment = equipment;
        this.batchToYN = batchToYN;
    }


    public void getPro(){
        if (input.contains("98-")) {

            String output = input.replace("98-","'").replace("\n", "', ");
            System.out.println(output);
        } else {
            StringBuilder build = new StringBuilder();

            build.insert(0, "'")
                    .append(input);
            String rebuild = build.toString();
            String output = rebuild.replace("\n", "', '" );
            System.out.println(output);

        }
    }
    public void invoices(){
        StringBuilder build = new StringBuilder();

        build.insert(0, "'")
                .append(invoiceCode);
        String rebuild = build.toString();
        String output = rebuild.replace("\n", "', '" );
        System.out.println(output);
    }

    public void equipment(){

        List<String> eqNumber;

        String eqComma = equipment.replace("\n", ",");

        eqNumber = Arrays.asList(eqComma.split(","));

        ArrayList<String> eqCodes =new ArrayList<>();

        for (String string: eqNumber ) {
            StringBuilder newCode= new StringBuilder();
            newCode.append(string.substring(0,10)).insert(0,"'").append("'");



            eqCodes.add(newCode.toString());




        }
        System.out.println(eqCodes);
    }

    public static void Batch(String batch){

        List<String> batchNumbers;

        List<String> sentYN = new ArrayList<>();

        batchNumbers = Arrays.asList(batch.split("\n"));


        System.out.println(batchNumbers);


        for (String batchnumber: batchNumbers) {

            if (batchnumber.contains("0") && batchnumber.length()== 1){
                sentYN.add("N");
            } else {
                sentYN.add("Y");
            }

        }

        System.out.println(sentYN);

        String x = sentYN.toString();

        String y = x.replace(",","\n");

        System.out.println(y);


    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getBatchToYN() {
        return batchToYN;
    }

    public void setBatchToYN(String batchToYN) {
        this.batchToYN = batchToYN;
    }
}
