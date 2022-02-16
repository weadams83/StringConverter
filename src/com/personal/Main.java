package com.personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.personal.StringsToConvert;

public class Main {


//    private StringsToConvert stringsToConvert;
//
//    public Main(StringsToConvert stringsToConvert) {
//        this.stringsToConvert = stringsToConvert;
//    }

    public static void main(String[] args) {
	String input = "";

    String invoiceCode = "HDMUHKWB8533427\n" +
            "YMLUW490382343\n" +
            "YMLUW490383200\n" +
            "OOLU2643878849\n" +
            "OOLU2643877460\n" +
            "MAEU912623203\n" +
            "OOLU2643877463\n" +
            "OOLU2643877464\n" +
            "OOLU2124155500\n" +
            "HLCUNG12107XQYE5\n" +
            "CMDUNBYE788557\n" +
            "CMDUNBYE788529\n" +
            "CMDUNBYE788556\n" +
            "CMDUNBYE788329\n" +
            "CMDUNBYE788327\n" +
            "CMDUNBYE788534\n" +
            "CMDUNBYE788551\n" +
            "CMDUNBYE788352\n" +
            "CMDUNBYE788535\n" +
            "CMDUNBYE788558\n" +
            "CMDUNBYE788531\n" +
            "CMDUNBYE788533\n" +
            "AMZDCN2127CD3EFF\n" +
            "YMLUW232440985\n" +
            "HDMUNBOZ86128400\n" +
            "YMLUW232440988\n" +
            "MAEU293777675\n" +
            "MAEU293167932\n" +
            "MAEU211961733\n" +
            "OOLU4050304992\n" +
            "OOLU2643878842\n" +
            "WHLC025A590098\n" +
            "ONEYSZPA92777809\n" +
            "OOLU2643061220\n" +
            "OOLU4050304996\n" +
            "OOLU2642663637\n" +
            "OOLU4050197886\n" +
            "OOLU2642663639\n" +
            "HDMUHKWB8522138\n" +
            "ONEYSZPAB0779803\n" +
            "COSU6268623125\n" +
            "ONEYSZPAA2554706\n" +
            "OOLU4050197884\n" +
            "HDMUSHAZ48523500\n" +
            "OOLU4050197881\n" +
            "OOLU2643878840\n" +
            "OOLU4050304995\n" +
            "ONEYSZPAB0779802\n" +
            "ONEYSZPAB0779801\n" +
            "OOLU4050197887\n" +
            "ONEYSZPAA2554709\n" +
            "WHLC025A590091\n" +
            "YMLUW490383454\n" +
            "YMLUW240256606\n" +
            "OOLU2643878843\n" +
            "OOLU2642663633\n" +
            "EGLV149001898069\n" +
            "MAEU597958472\n" +
            "MEDUN8401543\n" +
            "OOLU4050197883\n" +
            "OOLU2642663634\n" +
            "OOLU2642663631\n" +
            "ONEYSZPAA2554708\n" +
            "WHLC025A590097\n" +
            "WHLC025A590096\n" +
            "OOLU2642663638\n" +
            "AMZDCN212FF7D4FD\n" +
            "YMLUW490383455\n" +
            "YMLUW490383450\n" +
            "YMLUW490383450\n" +
            "YMLUW490383453\n" +
            "MAEU912623203\n" +
            "CMDUNBYE788021\n" +
            "CMDUNBYE788541\n";

    String equipment = "HDMU6715111\n" +
            "KOCU5101181\n" +
            "KOCU4328083\n" +
            "KOCU5010179\n" +
            "CAIU9358255\n" +
            "HDMU6848264\n" +
            "HMMU6261090\n";

    String batch = "30\n" +
            "59\n"+
            "0\n" +
            "0\n";


    String orderNo = "105933169\n" +
            "105930737\n" +
            "105933158\n" +
            "105943451\n" +
            "105884909\n" +
            "105857458\n" +
            "105930742\n" +
            "105819123\n" +
            "105942687\n" +
            "105933168\n" +
            "105942694\n" +
            "105915386\n" +
            "105808995\n" +
            "105926012\n" +
            "105939356\n" +
            "105933164\n" +
            "105946722\n" +
            "105900435\n" +
            "105925986\n" +
            "105930709\n" +
            "105939357\n" +
            "105900436\n" +
            "105969402\n" +
            "105857456\n" +
            "105939360\n" +
            "105915382\n" +
            "105962649\n" +
            "105962633\n" +
            "105926011\n";

//        invoices(invoiceCode);

//        getPro(invoiceCode);

//        invoicesToCreate(invoiceCode,"NIKEFF","9");
//
//
        String output = equipment(equipment);
        System.out.println(output);
//    Batch(batch);

//        insertSql(orderNo);
    
    }
    public static void getPro(String input){
        if (input.contains("96-")) {

            String output = input.replace("96-","'").replace("D96-","'").replace("\n", "', ");
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
    public static void invoicesToCreate(String invCode, String ediCode, String cmpyNo){

        StringBuilder build = new StringBuilder();

        String invoiceComma = invCode.replace("\n", ",");

        List <String> invoiceList = Arrays.asList(invoiceComma.split(","));

//        build.insert(0, ediCode + ",");

        for (String string: invoiceList) {

            build.append(ediCode + "," +string +"," + cmpyNo +",Y,0\n");

        }
        System.out.println(build);


    }

    public static void insertSql(String orNo){

        List<String> orderNo;

        String orComma = orNo.replace("\n", ",");

        orderNo = Arrays.asList(orComma.split(","));

        ArrayList<String> orNoList=new ArrayList<>();

        StringBuilder build = new StringBuilder();

        build.insert(0,"INSERT INTO edi.edi214_queue (no, cmpy_no, or_no) VALUES (DEFAULT, 1, ");

        for (String string: orderNo ) {

                build.append(string);
                build.append(");\n");
                build.append("INSERT INTO edi.edi214_queue (no, cmpy_no, or_no) VALUES (DEFAULT, 1, ");

        }

        System.out.println(build);
    }

    public static void invoices(String invoice){
        StringBuilder build = new StringBuilder();

        build.insert(0, "'")
                .append(invoice);
        String rebuild = build.toString();
        String output = rebuild.replace("\n", "', '" );
        System.out.println(output);
    }

    public static String equipment(String equipment){

        List<String> eqNumber;

        if (equipment.contains("-")){
            String eqcode = equipment.replace("---9--", "");
            equipment=eqcode;
        }

        String eqComma = equipment.replace("\n", ",");

        eqNumber = Arrays.asList(eqComma.split(","));

        ArrayList<String> eqCodes =new ArrayList<>();

        for (String string: eqNumber ) {
            StringBuilder newCode= new StringBuilder();
            newCode.append(string.substring(0,10)).insert(0,"'").append("'");



            eqCodes.add(newCode.toString());

//            System.out.printf(eqCodes.toString());

            
        }
        return eqCodes.toString();
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
}
