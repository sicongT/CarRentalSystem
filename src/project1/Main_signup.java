/*
Project Name: Car Rental System
Team Name: Sicong Tian & Shan LU
Developer Name: Sicong Tian
*/

package project1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main_signup extends JFrame implements ActionListener {

    private JFrame frame;
    private JTextField usernameField;
    private JTextField telephoneField;
    private JTextField emailField;
    private JTextField driverLicenseField;
    private JTextField passwordField;
    private JTextField confirmPasswordField;
    private JButton registerButton;
    private JButton loginButton;

    public Main_signup() {
        setTitle("Car Rental System - Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();
    }

    private void initComponents() {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(70, 50, 80, 25);
        panel.add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(150, 50, 165, 25);
        panel.add(usernameField);

        JLabel telephoneLabel = new JLabel("Telephone:");
        telephoneLabel.setBounds(70, 100, 80, 25);
        panel.add(telephoneLabel);

        telephoneField = new JTextField(20);
        telephoneField.setBounds(150, 100, 165, 25);
        panel.add(telephoneField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(70, 150, 80, 25);
        panel.add(emailLabel);

        emailField = new JTextField(20);
        emailField.setBounds(150, 150, 165, 25);
        panel.add(emailField);

        JLabel driverLicenseLabel = new JLabel("Driver's License:");
        driverLicenseLabel.setBounds(70, 200, 120, 25);
        panel.add(driverLicenseLabel);

        driverLicenseField = new JTextField(20);
        driverLicenseField.setBounds(180, 200, 135, 25);
        panel.add(driverLicenseField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(70, 250, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 250, 165, 25);
        panel.add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setBounds(70, 300, 120, 25);
        panel.add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField(20);
        confirmPasswordField.setBounds(200, 300, 115, 25);
        panel.add(confirmPasswordField);

        registerButton = new JButton("Register");
        registerButton.setBounds(150, 340, 100, 30);
        registerButton.addActionListener(this);
        panel.add(registerButton);

//        loginButton = new JButton("Log in");
//        loginButton.setBounds(220, 340, 100, 30);
//        loginButton.addActionListener(this);
//        panel.add(loginButton);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = usernameField.getText();
        String telephone = telephoneField.getText();
        String email = emailField.getText();
        String driverLicense = driverLicenseField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (e.getSource() == registerButton) {
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(frame, "Passwords do not match.");
            } else if (telephone.length() != 6) {
                JOptionPane.showMessageDialog(frame, "Telephone must be 6 digits.");
            } else {
                Register register = new Register(username, telephone, email, driverLicense, password);
                JOptionPane.showMessageDialog(frame, "Registration successful.");
                register.write("login.csv");
                Main_login login = new Main_login();
                login.setVisible(true);
                dispose();
            }
        }
    }
//    public static void main(String[] args) {
//        Main_signup signup = new Main_signup();
//        signup.setVisible(true);
//    }

}
