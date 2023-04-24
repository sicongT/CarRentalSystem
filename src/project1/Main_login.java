/*
Project Name: Car Rental System
Team Name: Sicong Tian & Shan LU
Developer Name: Sicong Tian
*/

package project1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main_login extends JFrame implements ActionListener {

    private JLabel lbl_title, lbl_username, lbl_password;
    private JTextField tf_username;
    private JPasswordField pf_password;
    private JButton btn_login;
    private JButton btn_register;
    private JButton btn_findpassword;

    public Main_login() {
        setTitle("Car Rental System - Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();
    }

    private void initComponents() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        ImageIcon icon = new ImageIcon("/Users/haiyuwu/Desktop/Wechat.png");
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel smileLabel = new JLabel(scaledIcon);
        smileLabel.setBounds(20, 20, 50, 50);
        panel.add(smileLabel);

        lbl_title = new JLabel("Welcome to Car Rental System");
        lbl_title.setFont(new Font("Arial", Font.BOLD, 18));
        lbl_title.setBounds(90, 25, 300, 50);
        panel.add(lbl_title);

        lbl_username = new JLabel("Username:");
        lbl_username.setBounds(100, 80, 100, 40);
        panel.add(lbl_username);

        tf_username = new JTextField();
        tf_username.setBounds(180, 90, 150, 25);
        panel.add(tf_username);

        lbl_password = new JLabel("Password:");
        lbl_password.setBounds(100, 120, 100, 40);
        panel.add(lbl_password);

        pf_password = new JPasswordField();
        pf_password.setBounds(180, 130, 150, 25);
        panel.add(pf_password);

        btn_login = new JButton("Login");
        btn_login.setBounds(20, 185, 100, 30);
        btn_login.addActionListener(this);
        panel.add(btn_login);

        btn_findpassword = new JButton("Forget the Password");
        btn_findpassword.setBounds(120, 185, 165, 30);
        btn_findpassword.addActionListener(this);
        panel.add(btn_findpassword);

        btn_register = new JButton("Sign Up");
        btn_register.setBounds(280, 185, 100, 30);
        btn_register.addActionListener(this);
        panel.add(btn_register);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_login) {
            if (tf_username.getText().isEmpty() || pf_password.getPassword().length == 0) {
                JOptionPane.showMessageDialog(this, "Empty fields. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String username = tf_username.getText();
            String password = new String(pf_password.getPassword());

            CSVToArray toarray = new CSVToArray();
            String[][] info = toarray.getArray();
            boolean found = false;
            for (int i = 0; i < info.length; i++) {

                if (username.equals(info[i][0]) && password.equals(info[i][4])) {
                    Main_welcome welcome = new Main_welcome(username);
                    welcome.setVisible(true);
                    dispose();
                    found = true;
                }
            }
            if (found == false) {
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                tf_username.setText("");
                pf_password.setText("");
            }
        }

        if (e.getSource() == btn_register) {
            Main_signup signup = new Main_signup();
            signup.setVisible(true);
            dispose();
        }

        if (e.getSource() == btn_findpassword) {
            Findpasswords find = null;
            try {
                find = new Findpasswords();
            } catch (IOException ex) {
                Logger.getLogger(Main_login.class.getName()).log(Level.SEVERE, null, ex);
            }
            find.setVisible(true);
            dispose();
        }
    }

    public static void main(String[] args) {
        Main_login login = new Main_login();
        login.setVisible(true);
    }
}
