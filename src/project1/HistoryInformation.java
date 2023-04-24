/*
Project Name: Car Rental System
Team Name: Sicong Tian & Shan LU
Developer Name: Sicong Tian
*/

package project1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistoryInformation {
    private String username;
    private String rentalTime;
    private String carName;
    private String price;

    public HistoryInformation(String username, String carName, String price, String rentalTime) {
        this.username = username;
        this.carName = carName;
        this.price = price;
        this.rentalTime = rentalTime;
    }

    public String getUsername() {
        return username;
    }
    
    public String getCarName() {
        return carName;
    }
    
    public void setCarName(String carName) {
        this.carName = carName;
    }
    
     public String getPrice() {
        return price;
    }
     
    public void setPrice(String price) {
        this.price = price;
    }

    public String getRentalTime() {
        return rentalTime;
    }
  
    public void setRentalTime(String rentalTime) {
        this.rentalTime = rentalTime;
    }

    public void write(String fileName) {
        List<String[]> dataList = new ArrayList<String[]>();
        dataList.add(new String[]{username, carName, price, rentalTime});     
        try {
            FileWriter writer = new FileWriter(fileName, true);
            for (String[] data : dataList) {
                writer.write(String.join(",", data));
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
}
