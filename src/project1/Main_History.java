/*
Project Name: Car Rental System
Team Name: Sicong Tian & Shan LU
Developer Name: Sicong Tian
*/

package project1;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Main_History extends JFrame implements ActionListener {

    private JLabel usernameLabel;
    private JLabel usernameTextField;
    private JLabel carLabel;
    private JLabel carTextField;
    private JLabel priceLabel;
    private JLabel priceTextField;
    private JButton reurnButton;
    private JLabel timeLabel;
    private JLabel timeTextField;
    private ArrayList<HistoryInformation> rentalHistory;
    private String username, model, price, day;
    private boolean found;

    public Main_History(String un) {
        username = un;
        setTitle("Rental Information");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        rentalHistory = new ArrayList<>();

        CSVToArray2 toarray = new CSVToArray2();
        String[][] info = toarray.getArray();
        found = false;

        for (int i = 0; i < info.length; i++) {
            if (username.equals(info[i][0])) {
                model = info[i][1];
                price = info[i][2];
                day = info[i][3];
                found = true;
                initComponents();
            }
        }
        if (found == false) {
            JOptionPane.showMessageDialog(this, "Not found.");
            Main_welcome welcome = new Main_welcome(username);            
            welcome.setVisible(true);
            dispose();
            
        }

    }
    
    public boolean isFound()
    {
        return found;
    }

    private void initComponents() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        add(panel);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20, 20, 80, 25);
        panel.add(usernameLabel);

        usernameTextField = new JLabel(username);
        usernameTextField.setBounds(110, 20, 200, 25);
        panel.add(usernameTextField);

        carLabel = new JLabel("Car Model:");
        carLabel.setBounds(20, 60, 80, 25);
        panel.add(carLabel);

        carTextField = new JLabel(model);
        carTextField.setBounds(110, 60, 200, 25);
        panel.add(carTextField);

        timeLabel = new JLabel("Prices:");
        timeLabel.setBounds(20, 100, 80, 25);
        panel.add(timeLabel);

        timeTextField = new JLabel(price);
        timeTextField.setBounds(110, 100, 200, 25);
        panel.add(timeTextField);

        priceLabel = new JLabel("Days:");
        priceLabel.setBounds(20, 140, 80, 25);
        panel.add(priceLabel);

        priceTextField = new JLabel(day);
        priceTextField.setBounds(110, 140, 200, 25);
        panel.add(priceTextField);

        reurnButton = new JButton("Return");
        reurnButton.setBounds(150, 200, 120, 30);
        reurnButton.addActionListener(this);
        panel.add(reurnButton);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == reurnButton) {
            Main_welcome wel = new Main_welcome(username);
            wel.setVisible(true);
            dispose();

        }

    }
//
//    public static void main(String[] args) {
//        Main_History history = new Main_History();
//        history.setVisible(true);
//    }
}
