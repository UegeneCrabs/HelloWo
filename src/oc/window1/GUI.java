package oc.window1;

import oc.calculator.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {

    public GUI(){
        JFrame frame = new JFrame("Window Hello");


        JLabel label = new JLabel("Hello World!");
        JButton btnClose = new JButton("CLose");
        btnClose.addActionListener(this);



        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(btnClose);


        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(450, 500));
        frame.setSize(500, 500);
        frame.setVisible(true);


    }

    private JPanel JavaWindow;
    private JButton btnClose;


    public static void main(String[] args){
        new GUI();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
