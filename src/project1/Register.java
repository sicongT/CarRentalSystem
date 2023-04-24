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

public class Register {

    private String username;
    private String telephone;
    private String email;
    private String driverLicense;
    private String password;

    public Register(String username, String telephone, String email, String driverLicense, String password) {
        this.username = username;
        this.telephone = telephone;
        this.email = email;
        this.driverLicense = driverLicense;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void write(String fileName) {
        List<String[]> dataList = new ArrayList<String[]>();
        dataList.add(new String[]{username, telephone, email, driverLicense, password});     
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
    