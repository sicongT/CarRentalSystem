/*
Project Name: Car Rental System
Team Name: Sicong Tian & Shan LU
Developer Name: Sicong Tian
*/

package project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToArray {
    
    List<String[]> dataList = new ArrayList<String[]>();
    static String filePath = "login.csv";
    
    public CSVToArray() {
        loadData();
    }

    public void loadData() {
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ","; 
       
        try {
            br = new BufferedReader(new FileReader(filePath)); 
            while ((line = br.readLine()) != null) { 
                String[] data = line.split(csvSplitBy);

                dataList.add(data); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }       
    }
    
    public String[][] getArray()
    {              
        String[][] dataArray = new String[dataList.size()][];
        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i] = dataList.get(i);
        }
        return dataArray;
    }
}
