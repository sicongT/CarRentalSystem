/*
Project Name: Car Rental System
Team Name: Shan LU & Sicong Tian
Developer Name: Shan LU
*/

package project1;

import java.util.Scanner;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Image;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Project1 {
    static Scanner input = new Scanner (System.in);
    static int i, j, k, m, Price, TotalPrice, n, h, p, q, InsurancePrice, PriceSum;
    static char c;
    static String s, Model, Location, Capacity, username;
    static boolean insurance;
    
    
    static public class page1_GUI extends JFrame implements ActionListener {

        private JLabel lbl_title, lbl_car, lbl_standard, lbl_van, lbl_SUV, lbl_choose;
        private JTextField tf_choose;
        private JButton btn_next;
        private JButton btn_back;

        public page1_GUI() {
            setTitle("Car Rental System - Rental");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 300);
            setLocationRelativeTo(null);
            setResizable(false);

            initComponents();
        }
        
        public void setUsername(String un)
        {
            username = un;
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

            lbl_title = new JLabel("Car Rental System");
            lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
            lbl_title.setBounds(85, 25, 300, 50);
            panel.add(lbl_title);
            
            lbl_car = new JLabel("Car Type:");
            lbl_car.setBounds(50, 80, 100, 25);
            panel.add(lbl_car);
            
            lbl_standard = new JLabel("1. Standard");
            lbl_standard.setBounds(150, 80, 100, 25);
            panel.add(lbl_standard);
            
            lbl_SUV = new JLabel("2. SUV");
            lbl_SUV.setBounds(150, 105, 100, 25);
            panel.add(lbl_SUV);
            
            lbl_van = new JLabel("3. Van");
            lbl_van.setBounds(150, 130, 100, 25);
            panel.add(lbl_van);
            
            lbl_choose = new JLabel("Choose number: ");
            lbl_choose.setBounds(50, 155, 150, 25);
            panel.add(lbl_choose);
            
            tf_choose = new JTextField(20);
            tf_choose.setBounds(150, 155, 100, 25);
            panel.add(tf_choose);

            btn_next = new JButton("Next");
            btn_next.setBounds(100, 185, 100, 30);
            btn_next.addActionListener(this);
            panel.add(btn_next);

            btn_back = new JButton("Back");
            btn_back.setBounds(250, 185, 100, 30);
            btn_back.addActionListener(this);
            panel.add(btn_back);

            add(panel);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_next) {
                i = Integer.parseInt(tf_choose.getText());
            
                if (tf_choose.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(this, "Empty fields. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                else if (i == 1) {
                    page21_GUI page2 = new page21_GUI();
                    page2.setVisible(true);
                    dispose();
                }
                else if (i == 2) {
                    page22_GUI page2 = new page22_GUI();
                    page2.setVisible(true);
                    dispose();
                }
                else if (i == 3) {
                    page23_GUI page2 = new page23_GUI();
                    page2.setVisible(true);
                    dispose();
                }
                else {
                    
                    JOptionPane.showMessageDialog(this, "Invalid number. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    tf_choose.setText("");
                }
            }

            else if (e.getSource() == btn_back) {
                Main_welcome welcome = new Main_welcome(username);
                welcome.setVisible(true);
                dispose();
            }
        }
    }
    
    static public class page21_GUI extends JFrame implements ActionListener {

        private JLabel lbl_title, lbl_line1, lbl_line21, lbl_line22, lbl_line31, lbl_line32, lbl_line41, lbl_line42, lbl_line5, lbl_line61, lbl_line62, lbl_line71, lbl_line72, lbl_line81, lbl_line82,lbl_choose;
        private JTextField tf_choose;
        private JButton btn_next;
        private JButton btn_back;

        public page21_GUI() {
            setTitle("Car Rental System - Rental");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 400);
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

            lbl_title = new JLabel("Car Rental System");
            lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
            lbl_title.setBounds(85, 25, 300, 50);
            panel.add(lbl_title);
            
            
            lbl_line1 = new JLabel("1. Volkswagen Jetta");
            lbl_line1.setBounds(50, 80, 200, 25);
            panel.add(lbl_line1);

            lbl_line21 = new JLabel("Location: ");
            lbl_line21.setBounds(50, 105, 100, 25);
            panel.add(lbl_line21);

            lbl_line22 = new JLabel("Chicago");
            lbl_line22.setBounds(150, 105, 100, 25);
            panel.add(lbl_line22);

            lbl_line31 = new JLabel("Passengers: ");
            lbl_line31.setBounds(50, 130, 100, 25);
            panel.add(lbl_line31);

            lbl_line32 = new JLabel("5");
            lbl_line32.setBounds(150, 130, 100, 25);
            panel.add(lbl_line32);

            lbl_line41 = new JLabel("Daily Price: ");
            lbl_line41.setBounds(50, 155, 100, 25);
            panel.add(lbl_line41);

            lbl_line42 = new JLabel("97");
            lbl_line42.setBounds(150, 155, 100, 25);
            panel.add(lbl_line42);

            lbl_line5 = new JLabel("2. HONDA CIVIC");
            lbl_line5.setBounds(50, 180, 200, 25);
            panel.add(lbl_line5);

            lbl_line61 = new JLabel("Location: ");
            lbl_line61.setBounds(50, 205, 100, 25);
            panel.add(lbl_line61);

            lbl_line62 = new JLabel("South Bend");
            lbl_line62.setBounds(150, 205, 100, 25);
            panel.add(lbl_line62);

            lbl_line71 = new JLabel("Passengers: ");
            lbl_line71.setBounds(50, 230, 100, 25);
            panel.add(lbl_line71);

            lbl_line72 = new JLabel("5");
            lbl_line72.setBounds(150, 230, 100, 25);
            panel.add(lbl_line72);

            lbl_line81 = new JLabel("Daily Price: ");
            lbl_line81.setBounds(50, 255, 100, 25);
            panel.add(lbl_line81);

            lbl_line82 = new JLabel("45");
            lbl_line82.setBounds(150, 255, 100, 25);
            panel.add(lbl_line82);

            lbl_choose = new JLabel("Choose number: ");
            lbl_choose.setBounds(50, 280, 150, 25);
            panel.add(lbl_choose);

            tf_choose = new JTextField(20);
            tf_choose.setBounds(150, 280, 100, 25);
            panel.add(tf_choose);
            
            btn_next = new JButton("Next");
            btn_next.setBounds(100, 320, 100, 30);
            btn_next.addActionListener(this);
            panel.add(btn_next);

            btn_back = new JButton("Back");
            btn_back.setBounds(250, 320, 100, 30);
            btn_back.addActionListener(this);
            panel.add(btn_back);

            add(panel);            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_next) {
                j = Integer.parseInt(tf_choose.getText());
                if(j == 1) {
                    Model = lbl_line1.getText();
                    Location = lbl_line22.getText();
                    Capacity = lbl_line32.getText();
                    Price = Integer.parseInt(lbl_line42.getText());
                }
                else if (j == 2) {
                    Model = lbl_line5.getText();
                    Location = lbl_line62.getText();
                    Capacity = lbl_line72.getText();
                    Price = Integer.parseInt(lbl_line82.getText());
                }
                if (tf_choose.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(this, "Empty fields. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                else if (j != 1 && j != 2) {
                    JOptionPane.showMessageDialog(this, "Invalid number. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    tf_choose.setText("");
                }
                else {
                    page3_GUI page3 = new page3_GUI();
                    page3.setVisible(true);
                    dispose();
                }
            }

            else if (e.getSource() == btn_back) {
                page1_GUI page1 = new page1_GUI();
                page1.setVisible(true);
                dispose();
            }
        }
    }
    static public class page22_GUI extends JFrame implements ActionListener {

        private JLabel lbl_title, lbl_line1, lbl_line21, lbl_line22, lbl_line31, lbl_line32, lbl_line41, lbl_line42, lbl_line5, lbl_line61, lbl_line62, lbl_line71, lbl_line72, lbl_line81, lbl_line82,lbl_choose;
        private JTextField tf_choose;
        private JButton btn_next;
        private JButton btn_back;

        public page22_GUI() {
            setTitle("Car Rental System - Rental");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 400);
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

            lbl_title = new JLabel("Car Rental System");
            lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
            lbl_title.setBounds(85, 25, 300, 50);
            panel.add(lbl_title);
            
            
            lbl_line1 = new JLabel("1. Lincoln Navigator");
            lbl_line1.setBounds(50, 80, 200, 25);
            panel.add(lbl_line1);

            lbl_line21 = new JLabel("Location: ");
            lbl_line21.setBounds(50, 105, 100, 25);
            panel.add(lbl_line21);

            lbl_line22 = new JLabel("Chicago");
            lbl_line22.setBounds(150, 105, 100, 25);
            panel.add(lbl_line22);

            lbl_line31 = new JLabel("Passengers: ");
            lbl_line31.setBounds(50, 130, 100, 25);
            panel.add(lbl_line31);

            lbl_line32 = new JLabel("7");
            lbl_line32.setBounds(150, 130, 100, 25);
            panel.add(lbl_line32);

            lbl_line41 = new JLabel("Daily Price: ");
            lbl_line41.setBounds(50, 155, 100, 25);
            panel.add(lbl_line41);

            lbl_line42 = new JLabel("128");
            lbl_line42.setBounds(150, 155, 100, 25);
            panel.add(lbl_line42);

            lbl_line5 = new JLabel("2. Ford Edge");
            lbl_line5.setBounds(50, 180, 200, 25);
            panel.add(lbl_line5);

            lbl_line61 = new JLabel("Location: ");
            lbl_line61.setBounds(50, 205, 100, 25);
            panel.add(lbl_line61);

            lbl_line62 = new JLabel("South Bend");
            lbl_line62.setBounds(150, 205, 100, 25);
            panel.add(lbl_line62);

            lbl_line71 = new JLabel("Passengers: ");
            lbl_line71.setBounds(50, 230, 100, 25);
            panel.add(lbl_line71);

            lbl_line72 = new JLabel("5");
            lbl_line72.setBounds(150, 230, 100, 25);
            panel.add(lbl_line72);

            lbl_line81 = new JLabel("Daily Price: ");
            lbl_line81.setBounds(50, 255, 100, 25);
            panel.add(lbl_line81);

            lbl_line82 = new JLabel("96");
            lbl_line82.setBounds(150, 255, 100, 25);
            panel.add(lbl_line82);

            lbl_choose = new JLabel("Choose number: ");
            lbl_choose.setBounds(50, 280, 150, 25);
            panel.add(lbl_choose);

            tf_choose = new JTextField(20);
            tf_choose.setBounds(150, 280, 100, 25);
            panel.add(tf_choose);
            
            btn_next = new JButton("Next");
            btn_next.setBounds(100, 320, 100, 30);
            btn_next.addActionListener(this);
            panel.add(btn_next);

            btn_back = new JButton("Back");
            btn_back.setBounds(250, 320, 100, 30);
            btn_back.addActionListener(this);
            panel.add(btn_back);

            add(panel);            
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_next) {
                j = Integer.parseInt(tf_choose.getText());
                if(j == 1) {
                    Model = lbl_line1.getText();
                    Location = lbl_line22.getText();
                    Capacity = lbl_line32.getText();
                    Price = Integer.parseInt(lbl_line42.getText());
                }
                else if (j == 2) {
                    Model = lbl_line5.getText();
                    Location = lbl_line62.getText();
                    Capacity = lbl_line72.getText();
                    Price = Integer.parseInt(lbl_line82.getText());
                }
                if (tf_choose.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(this, "Empty fields. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                else if (j != 1 && j != 2) {
                    JOptionPane.showMessageDialog(this, "Invalid number. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    tf_choose.setText("");
                }
                else {
                    page3_GUI page3 = new page3_GUI();
                    page3.setVisible(true);
                    dispose();
                }
            }

            else if (e.getSource() == btn_back) {
                page1_GUI page1 = new page1_GUI();
                page1.setVisible(true);
                dispose();
            }
        }
    }    
    static public class page23_GUI extends JFrame implements ActionListener {

        private JLabel lbl_title, lbl_line1, lbl_line21, lbl_line22, lbl_line31, lbl_line32, lbl_line41, lbl_line42, lbl_line5, lbl_line61, lbl_line62, lbl_line71, lbl_line72, lbl_line81, lbl_line82,lbl_choose;
        private JTextField tf_choose;
        private JButton btn_next;
        private JButton btn_back;

        public page23_GUI() {
            setTitle("Car Rental System - Rental");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 400);
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

            lbl_title = new JLabel("Car Rental System");
            lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
            lbl_title.setBounds(85, 25, 300, 50);
            panel.add(lbl_title);
            
            
            lbl_line1 = new JLabel("1. Toyota_Sienna");
            lbl_line1.setBounds(50, 80, 200, 25);
            panel.add(lbl_line1);

            lbl_line21 = new JLabel("Location: ");
            lbl_line21.setBounds(50, 105, 100, 25);
            panel.add(lbl_line21);

            lbl_line22 = new JLabel("Chicago");
            lbl_line22.setBounds(150, 105, 100, 25);
            panel.add(lbl_line22);

            lbl_line31 = new JLabel("Passengers: ");
            lbl_line31.setBounds(50, 130, 100, 25);
            panel.add(lbl_line31);

            lbl_line32 = new JLabel("8");
            lbl_line32.setBounds(150, 130, 100, 25);
            panel.add(lbl_line32);

            lbl_line41 = new JLabel("Daily Price: ");
            lbl_line41.setBounds(50, 155, 100, 25);
            panel.add(lbl_line41);

            lbl_line42 = new JLabel("95");
            lbl_line42.setBounds(150, 155, 100, 25);
            panel.add(lbl_line42);

            lbl_line5 = new JLabel("2. Nissan Quest");
            lbl_line5.setBounds(50, 180, 200, 25);
            panel.add(lbl_line5);

            lbl_line61 = new JLabel("Location: ");
            lbl_line61.setBounds(50, 205, 100, 25);
            panel.add(lbl_line61);

            lbl_line62 = new JLabel("South Bend");
            lbl_line62.setBounds(150, 205, 100, 25);
            panel.add(lbl_line62);

            lbl_line71 = new JLabel("Passengers: ");
            lbl_line71.setBounds(50, 230, 100, 25);
            panel.add(lbl_line71);

            lbl_line72 = new JLabel("7");
            lbl_line72.setBounds(150, 230, 100, 25);
            panel.add(lbl_line72);

            lbl_line81 = new JLabel("Daily Price: ");
            lbl_line81.setBounds(50, 255, 100, 25);
            panel.add(lbl_line81);

            lbl_line82 = new JLabel("86");
            lbl_line82.setBounds(150, 255, 100, 25);
            panel.add(lbl_line82);

            lbl_choose = new JLabel("Choose number: ");
            lbl_choose.setBounds(50, 280, 150, 25);
            panel.add(lbl_choose);

            tf_choose = new JTextField(20);
            tf_choose.setBounds(150, 280, 100, 25);
            panel.add(tf_choose);
            
            btn_next = new JButton("Next");
            btn_next.setBounds(100, 320, 100, 30);
            btn_next.addActionListener(this);
            panel.add(btn_next);

            btn_back = new JButton("Back");
            btn_back.setBounds(250, 320, 100, 30);
            btn_back.addActionListener(this);
            panel.add(btn_back);

            add(panel);            
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_next) {
                j = Integer.parseInt(tf_choose.getText());
                if(j == 1) {
                    Model = lbl_line1.getText();
                    Location = lbl_line22.getText();
                    Capacity = lbl_line32.getText();
                    Price = Integer.parseInt(lbl_line42.getText());
                }
                else if (j == 2) {
                    Model = lbl_line5.getText();
                    Location = lbl_line62.getText();
                    Capacity = lbl_line72.getText();
                    Price = Integer.parseInt(lbl_line82.getText());
                }
                if (tf_choose.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(this, "Empty fields. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                else if (j != 1 && j != 2) {
                    JOptionPane.showMessageDialog(this, "Invalid number. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    tf_choose.setText("");
                }
                else {
                    page3_GUI page3 = new page3_GUI();
                    page3.setVisible(true);
                    dispose();
                }
            }

            else if (e.getSource() == btn_back) {
                page1_GUI page1 = new page1_GUI();
                page1.setVisible(true);
                dispose();
            }
        }        
    }    
    static public class page3_GUI extends JFrame implements ActionListener {

        private JLabel lbl_title, lbl_day, lbl_insurance;
        private JTextField tf_day, tf_insurance;
        private JButton btn_next;
        private JButton btn_back;

        public page3_GUI() {
            setTitle("Car Rental System - Rental");
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

            lbl_title = new JLabel("Car Rental System");
            lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
            lbl_title.setBounds(85, 25, 300, 50);
            panel.add(lbl_title);
            
            lbl_day = new JLabel("Days to Rent:");
            lbl_day.setBounds(50, 80, 150, 25);
            panel.add(lbl_day);
            
            tf_day = new JTextField(20);
            tf_day.setBounds(200, 80, 100, 25);
            panel.add(tf_day);
            
            lbl_insurance = new JLabel("Insurance? Y/N");
            lbl_insurance.setBounds(50, 120, 150, 25);
            panel.add(lbl_insurance);
            
            tf_insurance = new JTextField(20);
            tf_insurance.setBounds(200, 120, 100, 25);
            panel.add(tf_insurance);
            
            btn_next = new JButton("Next");
            btn_next.setBounds(100, 185, 100, 30);
            btn_next.addActionListener(this);
            panel.add(btn_next);

            btn_back = new JButton("Back");
            btn_back.setBounds(250, 185, 100, 30);
            btn_back.addActionListener(this);
            panel.add(btn_back);

            add(panel);

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_next) {
                q = Integer.parseInt(tf_day.getText());
                c = tf_insurance.getText().charAt(0);
                n = q / 7;
                h = q % 7;

                if(n == 0 && h <= 5 && h > 0)
                    TotalPrice = Price * q;
                else if(n == 0 && h == 6 || h == 0 ) 
                    TotalPrice = Price * 5 + Price / 2 * (q - 5); 
                else if(n != 0 && h <= 5 && h > 0) 
                    TotalPrice = Price * 6 * n + Price * h;
                else
                    TotalPrice = Price * 6 * n + Price * 5 + Price / 2 * (q - 5 - 7 * n);
                
                if (tf_day.getText().isEmpty() || tf_insurance.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Empty fields. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                else if (c == 'Y' || c == 'y') {
                    page4_GUI page4 = new page4_GUI();
                    page4.setVisible(true);
                    dispose();
                }
                else if (c == 'N' || c == 'n') {
                    InsurancePrice = 0;
                    PriceSum = TotalPrice + InsurancePrice;
                    page5_GUI page5 = new page5_GUI();
                    page5.setVisible(true);
                    dispose();
                }
                else {
                    
                    JOptionPane.showMessageDialog(this, "Invalid number. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    tf_insurance.setText("");
                }
            }

            else if (e.getSource() == btn_back) {
                page1_GUI page1 = new page1_GUI();
                page1.setVisible(true);
                dispose();
            }
        }

    }
    static public class page4_GUI extends JFrame implements ActionListener {

        private JLabel lbl_title, lbl_line1, lbl_line21, lbl_line22, lbl_line31, lbl_line32, lbl_line4, lbl_line51, lbl_line52, lbl_line61, lbl_line62, lbl_choose;
        private JTextField tf_choose;
        private JButton btn_next;
        private JButton btn_back;

        public page4_GUI() {
            setTitle("Car Rental System - Rental");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 400);
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

            lbl_title = new JLabel("Car Rental System");
            lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
            lbl_title.setBounds(85, 25, 300, 50);
            panel.add(lbl_title);
            
            
            lbl_line1 = new JLabel("1. A");
            lbl_line1.setBounds(50, 80, 200, 25);
            panel.add(lbl_line1);

            lbl_line21 = new JLabel("Coverage: ");
            lbl_line21.setBounds(50, 105, 100, 25);
            panel.add(lbl_line21);

            lbl_line22 = new JLabel("Full");
            lbl_line22.setBounds(150, 105, 100, 25);
            panel.add(lbl_line22);

            lbl_line31 = new JLabel("Daily Price: ");
            lbl_line31.setBounds(50, 130, 100, 25);
            panel.add(lbl_line31);

            lbl_line32 = new JLabel("20");
            lbl_line32.setBounds(150, 130, 100, 25);
            panel.add(lbl_line32);

            lbl_line4 = new JLabel("2. B");
            lbl_line4.setBounds(50, 155, 200, 25);
            panel.add(lbl_line4);

            lbl_line51 = new JLabel("Coverage: ");
            lbl_line51.setBounds(50, 180, 100, 25);
            panel.add(lbl_line51);

            lbl_line52 = new JLabel("Partial");
            lbl_line52.setBounds(150, 180, 100, 25);
            panel.add(lbl_line52);

            lbl_line61 = new JLabel("Daily Price: ");
            lbl_line61.setBounds(50, 205, 100, 25);
            panel.add(lbl_line61);

            lbl_line62 = new JLabel("10");
            lbl_line62.setBounds(150, 205, 100, 25);
            panel.add(lbl_line62);

            lbl_choose = new JLabel("Choose number: ");
            lbl_choose.setBounds(50, 230, 150, 25);
            panel.add(lbl_choose);

            tf_choose = new JTextField(20);
            tf_choose.setBounds(150, 230, 100, 25);
            panel.add(tf_choose);
            
            btn_next = new JButton("Next");
            btn_next.setBounds(100, 260, 100, 30);
            btn_next.addActionListener(this);
            panel.add(btn_next);

            btn_back = new JButton("Back");
            btn_back.setBounds(250, 260, 100, 30);
            btn_back.addActionListener(this);
            panel.add(btn_back);

            add(panel);            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_next) {
                p = Integer.parseInt(tf_choose.getText());
                if(p == 1) {
                    InsurancePrice = Integer.parseInt(lbl_line32.getText()) * q;
                }
                else if(p == 2) {
                    InsurancePrice = Integer.parseInt(lbl_line62.getText()) * q;
                }
                PriceSum = TotalPrice + InsurancePrice;
                if (tf_choose.getText().isEmpty() ) {
                    JOptionPane.showMessageDialog(this, "Empty fields. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                else if (p != 1 && p != 2) {
                    JOptionPane.showMessageDialog(this, "Invalid number. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    tf_choose.setText("");
                }
                else {
                    page5_GUI page5 = new page5_GUI();
                    page5.setVisible(true);
                    dispose();
                }
            }

            else if (e.getSource() == btn_back) {
                page3_GUI page3 = new page3_GUI();
                page3.setVisible(true);
                dispose();
            }
        }
    
    }
    static public class page5_GUI extends JFrame implements ActionListener {

        private JLabel lbl_title, lbl_line11, lbl_line12, lbl_line21, lbl_line22, lbl_line31, lbl_line32, lbl_line41, lbl_line42, lbl_line51, lbl_line52, lbl_line61, lbl_line62, lbl_line71, lbl_line72;
        private JButton btn_next;
        private JButton btn_back;

        public page5_GUI() {

            
            
            setTitle("Car Rental System - Rental");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400, 400);
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

            lbl_title = new JLabel("Car Rental System");
            lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
            lbl_title.setBounds(85, 25, 300, 50);
            panel.add(lbl_title);
            
            
            lbl_line11 = new JLabel("Model: ");
            lbl_line11.setBounds(50, 80, 100, 25);
            panel.add(lbl_line11);

            lbl_line12 = new JLabel(Model);
            lbl_line12.setBounds(150, 80, 200, 25);
            panel.add(lbl_line12);
            
            lbl_line21 = new JLabel("Location: ");
            lbl_line21.setBounds(50, 105, 100, 25);
            panel.add(lbl_line21);

            lbl_line22 = new JLabel(Location);
            lbl_line22.setBounds(150, 105, 100, 25);
            panel.add(lbl_line22);

            lbl_line31 = new JLabel("Capacity: ");
            lbl_line31.setBounds(50, 130, 100, 25);
            panel.add(lbl_line31);

            lbl_line32 = new JLabel(Capacity);
            lbl_line32.setBounds(150, 130, 100, 25);
            panel.add(lbl_line32);

            lbl_line41 = new JLabel("Days to Rent: ");
            lbl_line41.setBounds(50, 155, 100, 25);
            panel.add(lbl_line41);
            
            lbl_line42 = new JLabel(String.valueOf(q));
            lbl_line42.setBounds(150, 155, 100, 25);
            panel.add(lbl_line42);
            
            lbl_line51 = new JLabel("Total price of car rental: ");
            lbl_line51.setBounds(50, 180, 200, 25);
            panel.add(lbl_line51);

            lbl_line52 = new JLabel(String.valueOf(TotalPrice));
            lbl_line52.setBounds(250, 180, 200, 25);
            panel.add(lbl_line52);

            lbl_line61 = new JLabel("Total price of insurance: ");
            lbl_line61.setBounds(50, 205, 200, 25);
            panel.add(lbl_line61);

            lbl_line62 = new JLabel(String.valueOf(InsurancePrice));
            lbl_line62.setBounds(250, 205, 100, 25);
            panel.add(lbl_line62);

            lbl_line71 = new JLabel("Total price including insurance: ");
            lbl_line71.setBounds(50, 230, 250, 25);
            panel.add(lbl_line71);

            lbl_line72 = new JLabel(String.valueOf(PriceSum));
            lbl_line72.setBounds(300, 230, 100, 25);
            panel.add(lbl_line72);
            
            btn_next = new JButton("Next");
            btn_next.setBounds(100, 260, 100, 30);
            btn_next.addActionListener(this);
            panel.add(btn_next);

            btn_back = new JButton("Back");
            btn_back.setBounds(250, 260, 100, 30);
            btn_back.addActionListener(this);
            panel.add(btn_back);

            add(panel);            
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            if (e.getSource() == btn_next) {
                
                String price = String.valueOf(PriceSum);
                String days = String.valueOf(q);
                HistoryInformation info = new HistoryInformation(username, Model, price, days);               
                info.write("info.csv");
               
                Main_payment payment = new Main_payment(username);
                payment.setVisible(true);
                dispose();

            }
            else if (e.getSource() == btn_back) {
                page3_GUI page3 = new page3_GUI();
                page3.setVisible(true);
                dispose();
            }
        }

        
        
    }
}

       
