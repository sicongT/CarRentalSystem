/*
Project Name: Car Rental System
Team Name: Sicong Tian & Shan LU
Developer Name: Sicong Tian
*/

package project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import project1.Project1.page5_GUI;

public class Main_payment extends JFrame implements ActionListener {

    private JLabel ownernameLabel;
    private JTextField ownernameTextField;
    private JLabel cardLabel;
    private JTextField cardTextField;
    private JLabel cvcLabel;
    private JTextField cvcTextField;
    private JLabel dateLabel;
    private JTextField dateTextField;
    private JButton reurnButton;
    private JButton nextButton;
    private JFrame frame;
    private String username;

    public Main_payment(String un) {
        setTitle("Credit Card Payment");
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

        add(panel);

        ownernameLabel = new JLabel("Owner Name:");
        ownernameLabel.setBounds(80, 40, 100, 20);
        panel.add(ownernameLabel);

        ownernameTextField = new JTextField();
        ownernameTextField.setBounds(180, 40, 150, 20);
        panel.add(ownernameTextField);

        cardLabel = new JLabel("Card Number:");
        cardLabel.setBounds(80, 80, 100, 20);
        panel.add(cardLabel);

        cardTextField = new JTextField();
        cardTextField.setBounds(180, 80, 150, 20);
        panel.add(cardTextField);

        cvcLabel = new JLabel("CVC Number:");
        cvcLabel.setBounds(80, 120, 100, 20);
        panel.add(cvcLabel);

        cvcTextField = new JTextField();
        cvcTextField.setBounds(180, 120, 150, 20);
        panel.add(cvcTextField);

        dateLabel = new JLabel("Expiration Date:");
        dateLabel.setBounds(70, 160, 110, 20);
        panel.add(dateLabel);

        dateTextField = new JTextField();
        dateTextField.setBounds(180, 160, 150, 20);
        panel.add(dateTextField);

        reurnButton = new JButton("Return");
        reurnButton.setBounds(80, 200, 120, 30);
        reurnButton.addActionListener(this);
        panel.add(reurnButton);

        nextButton = new JButton("Next");
        nextButton.setBounds(230, 200, 120, 30);
        nextButton.addActionListener(this);
        panel.add(nextButton);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == reurnButton) {
            page5_GUI page5 = new page5_GUI();
            page5.setVisible(true);
            dispose();
        }

        if (e.getSource() == nextButton) {

            String cvc = cvcTextField.getText();

            if (ownernameTextField.getText().isEmpty() || cardTextField.getText().isEmpty() || cvcTextField.getText().isEmpty() || dateTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Empty fields. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (cvc.length() != 4) {
                JOptionPane.showMessageDialog(frame, "CVC number must be 4 digits.");

            } else {
                JOptionPane.showMessageDialog(frame, "Successfully rent a car！");
                Main_welcome wel = new Main_welcome(username);
                wel.setVisible(true);
                dispose();
                
            }
        }
    }

//    public static void main(String[] args) {
//        Main_payment payment = new Main_payment();
//        payment.setVisible(true);
//    }

}
