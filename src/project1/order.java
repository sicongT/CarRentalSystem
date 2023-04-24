/*
Project Name: Car Rental System
Team Name: Shan LU & Sicong Tian
Developer Name: Shan LU
*/

package project1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import static project1.Project1.c;
import static project1.Project1.h;
import static project1.Project1.i;
import static project1.Project1.j;
import static project1.Project1.m;
import static project1.Project1.q;

public class order {
    static Scanner input = new Scanner (System.in);
    static int  p;
    static char s;
    
    String model;
    String location;
    int capacity;
    int rentdays;
    int totalPrice;
    boolean insurance;
    int insurancePrice;
    int priceSum;
    private int n;
    
    order() {
        model = "";
        location = "";
        capacity = 0;
        rentdays = 0;
        totalPrice = 0;
        insurance = false;
        insurancePrice = 0;
        priceSum = 0;
    }
    
    order(String m, String l, int c, int r, int t, boolean i, int v, int s) {
        model = "m";
        location = "l";
        capacity = c;
        rentdays = r;
        totalPrice = t;
        insurance = i;
        insurancePrice = v;
        priceSum = s;
    }
    
    public int index() {
        int index = 2 * (i - 1) + j - 1;
        return index;
    }  
    
    public int totalPrice(car[] carArray) {
        m = index();
        n = q / 7;
        h = q % 7;
        rentdays = q;
        carArray[m].days = rentdays; 
        if(n == 0 && h <= 5 && h > 0)
            return totalPrice = carArray[m].price * rentdays;
        else if(n == 0 && h == 6 || h == 0 ) 
            return totalPrice = carArray[m].price * 5 + carArray[m].price / 2 * (rentdays - 5); 
        else if(n != 0 && h <= 5 && h > 0) 
            return totalPrice = carArray[m].price * 6 * n + carArray[m].price * h;
        else
            return totalPrice = carArray[m].price * 6 * n + carArray[m].price * 5 + carArray[m].price / 2 * (rentdays - 5 - 7 * n);
        
    }
    
 
    public boolean insurance() {
        if(c == 'Y' || c == 'y')
            return insurance = true;
        else
            return insurance = false;
    }
    
    public int insurancePrice(insurance[] ab) {
        if(c == 'Y' || c == 'y')
            return insurancePrice = ab[p-1].priceDaily * rentdays;
        else
            return insurancePrice = 0;   
    }
    
    public int priceSum() {
        
        return priceSum = totalPrice + insurancePrice;
    }
    
    
    
    public void print(car[] carArray) {
        model = carArray[m].model;
        location = carArray[m].location;
        capacity = carArray[m].capacity;
        
        System.out.println("        Model:  " + model);
        System.out.println("        Location:  " + location);      
        System.out.println("        Capacity:  " + capacity);
        System.out.println("        Days for rent:  " + rentdays);
        System.out.println("        Total price of car rental:  " + totalPrice);
        System.out.println("        Insurance:  " + insurance);
        System.out.println("        Total price of insurance:  " + insurancePrice);
        System.out.println("        Total price including insurance:  " + priceSum);
        System.out.println("---------------------------------");
     }
    
    public void read(String fileName) {
        File inputFile = new File(fileName);

        try {
            Scanner scanner = new Scanner(inputFile);
            while(scanner.hasNext()) {
                model = scanner.nextLine();
                location = scanner.nextLine();
                capacity = scanner.nextInt();
                rentdays = scanner.nextInt();
                totalPrice = scanner.nextInt();
                insurance = scanner.nextBoolean();
                insurancePrice = scanner.nextInt();
                priceSum = scanner.nextInt();
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
            output.write(capacity + "\n");
            output.write(rentdays + "\n");
            output.write(totalPrice + "\n");
            output.write(insurance + "\n");
            output.write(insurancePrice + "\n");
            output.write(priceSum + "\n");
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
            output.append(capacity + "\n");
            output.append(rentdays + "\n");
            output.append(totalPrice + "\n");
            output.append(insurance + "\n");
            output.append(insurancePrice + "\n");
            output.append(priceSum + "\n");
            output.flush();    
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
