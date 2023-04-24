/*
Project Name: Car Rental System
Team Name: Sicong Tian & Shan LU
Developer Name: Sicong Tian
*/

package project1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Findpasswords extends JFrame {

    private JPanel contentPane;
    private JTextField txtUsername;
    private JTextField txtTelephone;

    private List<Register> userList;

    public Findpasswords() throws IOException {

        loadUsersFromCSV();

        setTitle("Forget the Password");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(33, 31, 68, 14);
        contentPane.add(lblUsername);

        JLabel lblTelephone = new JLabel("Telephone:");
        lblTelephone.setBounds(30, 65, 90, 14);
        contentPane.add(lblTelephone);

        txtUsername = new JTextField();
        txtUsername.setBounds(111, 28, 128, 20);
        contentPane.add(txtUsername);
        txtUsername.setColumns(10);

        txtTelephone = new JTextField();
        txtTelephone.setBounds(111, 60, 128, 20);
        contentPane.add(txtTelephone);
        txtTelephone.setColumns(10);

        JButton btnReturn = new JButton("Return");
        btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnReturn) {
                    Main_login login = new Main_login();
                    login.setVisible(true);
                    dispose();
                }

            }
        });

        btnReturn.setBounds(100, 145, 100, 28);
        contentPane.add(btnReturn);

        JButton btnResetPassword = new JButton("Reset to Default Passwords");
        btnResetPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String telephone = txtTelephone.getText();
                Register user = findUserByUsernameAndTelephone(username, telephone);
                if (user == null) {
                    JOptionPane.showMessageDialog(contentPane, "User not found.");
                } else {
                    String newPassword = generateNewPassword();
                    user.setPassword(newPassword);
                    try {
                        saveUsersToCSV();
                    } catch (IOException ex) {
                        Logger.getLogger(Findpasswords.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(contentPane, "New password: " + newPassword);
                    Main_login login = new Main_login();
                    login.setVisible(true);
                    dispose();
                }

            }
        });
        btnResetPassword.setBounds(50, 90, 210, 28);
        contentPane.add(btnResetPassword);

        JButton btnChangePassword = new JButton("Change Passwords");
        btnChangePassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String telephone = txtTelephone.getText();
                Register user = findUserByUsernameAndTelephone(username, telephone);
                if (user == null) {
                    JOptionPane.showMessageDialog(contentPane, "User not found.");
                } else {
                    String newPassword = JOptionPane.showInputDialog(contentPane, "Enter new password:");
                    user.setPassword(newPassword);
                    try {
                        saveUsersToCSV();
                    } catch (IOException ex) {
                        Logger.getLogger(Findpasswords.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(contentPane, "Password changed.");
                    Main_login login = new Main_login();
                    login.setVisible(true);
                    dispose();
                }
            }
        });
        btnChangePassword.setBounds(80, 117, 143, 28);
        contentPane.add(btnChangePassword);
    }

    private void loadUsersFromCSV() throws IOException {
        userList = new ArrayList<Register>();
        File file = new File("login.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String username = parts[0];
            String telephone = parts[1];
            String email = parts[2];
            String driverNumber = parts[3];
            String password = parts[4];
            Register user = new Register(username, telephone, email, driverNumber, password);
            userList.add(user);
        }
        reader.close();
    }

    private void saveUsersToCSV() throws IOException {
        File file = new File("login.csv");
        FileWriter writer = new FileWriter(file);
        for (Register user : userList) {
            writer.write(user.getUsername() + ",");
            writer.write(user.getTelephone() + ",");
            writer.write(user.getEmail() + ",");
            writer.write(user.getDriverLicense() + ",");
            writer.write(user.getPassword() + "\n");
        }
        writer.close();
    }

    private Register findUserByUsernameAndTelephone(String username, String telephone) {
        for (Register user : userList) {
            if (user.getUsername().equals(username) && user.getTelephone().equals(telephone)) {
                return user;
            }
        }
        return null;
    }

    private String generateNewPassword() {

        return "123456";       
        
    }

//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    Findpasswords frame = new Findpasswords();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
}
