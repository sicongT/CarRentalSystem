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
import project1.Project1.page1_GUI;

public class Main_welcome extends JFrame implements ActionListener {

    private JLabel lbl_title;
    private JButton btn_rent, btn_return, btn_history, btn_logout;
    private String username;
    
    
    public Main_welcome() {
        setTitle("Car Rental System - Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
    }

    public Main_welcome(String un) {
        setTitle("Car Rental System - Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        username = un;
        initComponents();
    }
    
    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        lbl_title = new JLabel("Car Rental System");
        lbl_title.setFont(new Font("Arial", Font.BOLD, 24));
        lbl_title.setBounds(85, 25, 250, 30);
        panel.add(lbl_title);

        btn_rent = new JButton("Rent a car");
        btn_rent.setBounds(100, 100, 200, 30);
        btn_rent.addActionListener(this);
        panel.add(btn_rent);

        btn_history = new JButton("History Information");
        btn_history.setBounds(100, 150, 200, 30);
        btn_history.addActionListener(this);
        panel.add(btn_history);

        btn_logout = new JButton("Log out");
        btn_logout.setBounds(100, 200, 200, 30);
        btn_logout.addActionListener(this);
        panel.add(btn_logout);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_rent) {
            page1_GUI page1 = new page1_GUI();
            page1.setUsername(username);
            page1.setVisible(true);
            dispose();
        }
       

        if (e.getSource() == btn_history) {
            Main_History history = new Main_History(username);
            if (history.isFound())
            {
                history.setVisible(true);
            }
            dispose();

        }

        if (e.getSource() == btn_logout) {
            Main_login login = new Main_login();
            login.setVisible(true);
            dispose();
        }
    }
    

//    public static void main(String[] args) {
//        Main_welcome welcome = new Main_welcome();
//        welcome.setVisible(true);
//    }
}

