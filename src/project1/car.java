/*
Project Name: Car Rental System
Team Name: Shan LU & Sicong Tian
Developer Name: Shan LU
*/

package project1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public abstract class car /*implements Comparable <car>*/ {
    String model;
    String location;
    int days;
    int capacity;
    int price;
    boolean noMileageLimitation;
    
    car() {
        model = "";
        location = "";
        days = 0;
        capacity = 0;
        price = 0;        
        noMileageLimitation = true;
    }
    
    car(String m, String l, int d, int c, int p, boolean n) {
        model = m;
        location = l;
        days = d;
        capacity = c;
        price = p;
        noMileageLimitation = n;
    }
    
    public void read(String fileName) {
        File inputFile = new File(fileName);

        try {
            Scanner scanner = new Scanner(inputFile);
            while(scanner.hasNext()) {
                model = scanner.nextLine();
                location = scanner.nextLine();
                days = scanner.nextInt();
                capacity = scanner.nextInt();
                price = scanner.nextInt();
                noMileageLimitation = scanner.nextBoolean();
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
            output.write(model + "\n");
            output.write(location + "\n");
            output.write(days + "\n");
            output.write(capacity + "\n");
            output.write(price + "\n");
            output.write(noMileageLimitation + "\n");
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
            output.append(model + "\n");
            output.append(location + "\n");
            output.append(days + "\n");
            output.append(capacity + "\n");
            output.append(price + "\n");
            output.append(noMileageLimitation + "\n");
            output.flush();    
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void print() {
        System.out.println("        Model:  " + model);
        System.out.println("        Location:  " + location);       
        System.out.println("        Days for rent:  " + days);
        System.out.println("        Capacity:  " + capacity);
        System.out.println("        Price per weekday:  " + price);
        System.out.println("        Price per weekend:  " + (price / 2));
        System.out.println("        Mileage Limitation:  " + noMileageLimitation);
        System.out.println("---------------------------------");
    }    
}
