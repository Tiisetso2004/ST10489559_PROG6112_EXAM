package io.github.tiisetso2004;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductGUI extends JFrame implements ActionListener {

    //create JLabels and JFields
    JLabel NameLabel = new JLabel("Customer Name");
    JTextField nameField = new JTextField(20);

    JLabel productLabel = new JLabel("Select Product");

    //JComboBox items using array
    String[] items = {"Cozy Nights Monarch mattress","Restonic Barbados mattress","Sealy Plunkett mattress"};
    JComboBox<String> productField = new JComboBox<String>(items);

    JLabel priceLabel = new JLabel("Enter Price");
    JTextField priceField = new JTextField(20);

    JButton button = new JButton("Process");

    public ProductGUI() {

        //adding the layout components inside the constructor
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

    //main method on the event dispatch thread
    public static void main (String[] args) {
        SwingUtilities.invokeLater(()->{
            ProductGUI frame =  new ProductGUI();
            final int WIDTH = 400;
            final int HEIGHT = 500;
            frame.setSize(WIDTH, HEIGHT);
            frame.setVisible(true);
        });
    }
}
