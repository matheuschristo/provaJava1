package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	
	public static void main(String[] args) {
		String data1 = "2022 12 03";
        String data2 = "03 12 2022";
        String data3 = "2022/12/03";
        String data4 = "03/12/2022";
        String data5 = "03-12-2022";

        System.out.println(converterData(data1));
        System.out.println(converterData(data2));
        System.out.println(converterData(data3));
        System.out.println(converterData(data4));
        System.out.println(converterData(data5));
	}
	
	public static String converterData (String entrada) {
		      
        LocalDate dataParse = null;

        entrada = entrada.replaceAll("[^0-9]", " ");

        String[] dataSplit = entrada.split(" ");
        String dataResplit = "";
        
        if(dataSplit.length == 3 && dataSplit[0].length() == 4) {
        	
        		dataResplit = dataSplit[2]+dataSplit[1]+dataSplit[0];
        		
        		dataParse = LocalDate.parse(dataResplit, DateTimeFormatter.ofPattern("ddMMyyyy"));
                
        		String saida = dataParse.format(DateTimeFormatter.ofPattern("yyyy MM"));

                return saida;
        }
        	
        entrada = entrada.replaceAll(" ", "");
        

        dataParse = LocalDate.parse(entrada, DateTimeFormatter.ofPattern("ddMMyyyy"));
        String saida = dataParse.format(DateTimeFormatter.ofPattern("yyyy MM"));

        return saida;
	}

}
