/*
Project Name: Car Rental System
Team Name: Shan LU & Sicong Tian
Developer Name: Shan LU
*/

package project1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class insurance {
    String company;
    String coverage;
    int priceDaily;
    
    insurance() {
        company = "";
        coverage = "";
        priceDaily = 0;
    }
    
    insurance(String c, String d, int p) {
        company = c;
        coverage = d;
        priceDaily = p;
    }
    
    public void read(String fileName) {
        File inputFile = new File(fileName);


        try {
            Scanner scanner = new Scanner(inputFile);
            while(scanner.hasNext()) {
                company = scanner.nextLine();
                coverage = scanner.nextLine();
                priceDaily = scanner.nextInt();
            }    
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void write(String fileName) {
        File file = new File(fileName);//blank
       
        try {
            FileWriter output = new FileWriter(file);
            output.write(company + "\n");
            output.write(coverage + "\n");
            output.write(priceDaily + "\n");
            output.flush();    
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void append(String fileName) {
        File file = new File(fileName);//blank
       
        try {
            FileWriter output = new FileWriter(file, true);
            output.append(company + "\n");
            output.append(coverage + "\n");
            output.append(priceDaily + "\n");
            output.flush();    
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void print() {
        System.out.println("        Insurance company:  " + company);
        System.out.println("        Coverage:  " + coverage);       
        System.out.println("        Price per day:  " + priceDaily);
        System.out.println("---------------------------------");
    } 
}
