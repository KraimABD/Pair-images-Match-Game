package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuItemsDemo extends JFrame implements ActionListener {

    JPanel jPanelBorder;
    JPanel jPanel;
    JPanel jPanel2;
    JTextField textField;

    JButton btn;

    JMenuBar menuBar;
    JMenu file = new JMenu("File");;
    JMenuItem test;
    ArrayList<String> words = new ArrayList<>();


    MenuItemsDemo(){


        jPanelBorder = (JPanel) getContentPane();
        jPanelBorder.setLayout(new BorderLayout());

        textField = new JTextField();

        textField.setBounds(30,100,1000,30);


        btn = new JButton("Populate Menu");
        btn.addActionListener(this);

        menuBar = new JMenuBar();
        test = new JMenuItem("Hi");
        file.add(test);



        menuBar.add(file);


        jPanel = new JPanel();
        jPanel.add(textField);

        jPanel2 = new JPanel(new FlowLayout());
        jPanel2.add(btn);

        jPanelBorder.add(textField, BorderLayout.NORTH);
        jPanelBorder.add(jPanel2, BorderLayout.CENTER);







        this.setTitle("Class Anonyme");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 700);
        this.setVisible(true);
        this.setResizable(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn){
            test = new JMenuItem();
            String []tab;
            String msg = textField.getText();
            int i;
            tab = msg.split("\\s");
            for (i=0; i<tab.length;i++){

                file.add(tab[i]);
                menuBar.add(file);
                this.setJMenuBar(menuBar);
            }
            setJMenuBar(menuBar);
            revalidate();
            repaint();
            textField.setText("");
            System.out.println("Hello world");
        }
    }
}

