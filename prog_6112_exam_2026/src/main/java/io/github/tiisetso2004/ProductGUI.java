package io.github.tiisetso2004;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductGUI extends JFrame implements ActionListener{

    //create JLabels and JFields
    JLabel NameLabel = new JLabel("Customer Name");
    JTextField nameField = new JTextField(20);

    JLabel productLabel = new JLabel("Select Product");
    JTextField productField = new JTextField(20);

    JLabel priceLabel = new JLabel("Enter Price");
    JTextField priceField = new JTextField(20);

    JButton button = new JButton("Process");

    public ProductGUI() {
        super("ProductApp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(NameLabel);
        add(nameField);
        add(productLabel);
        add(productField);
        add(priceLabel);
        add(priceField);
        add(button);

        //adding the ActionListener to the button
        button.addActionListener(this);
    }

    //event management
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

    }

    //main method
    public static void main (String[] args) {
        ProductGUI frame =  new ProductGUI();
        final int WIDTH = 400;
        final int HEIGHT = 500;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
