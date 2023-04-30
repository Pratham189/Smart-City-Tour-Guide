/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "                 Welcome to India's Smart City Tour Guide System         \n  "
                + "\n the perfect tool for exploring the rich and diverse culture of our incredible country. "
                + "This state-of-the-art application has been designed to cater to the needs of both locals"
                +" and tourists alike, providing a seamless experience for all."
                +"India is a country steeped in history and tradition, with a myriad of sights and sounds to explore. Our application has been crafted to help you discover the very best of what this great nation has to offer, from ancient temples and majestic forts to bustling markets and vibrant festivals.\n" +
"\n" +
"With the Smart City Tour Guide System, you can say goodbye to the hassle of planning your itinerary and navigating unfamiliar streets. Our intelligent algorithms and user-friendly interface make it easy to find the best places to visit and the most efficient routes to take, ensuring that you get the most out of your time in each city.\n" +
"\n" +
"Whether you're a first-time visitor or a seasoned explorer, our application is the perfect companion for your journey through India's incredible cities. So what are you waiting for? Let's start exploring!"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:"
                + "\nGives accurate information"
                + "\nSimplifies the manual work"
                + "\nIt minimizes the documentation related work"
                + "\nProvides up to date information"
                + "\nFriendly Environment by providing warning messages."
                + "\ntravelers details can be provided"
                + "\nbooking confirmation notification"
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 450, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 180, 80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);        
    }
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
    public static void main(String args[]) {
        new About().setVisible(true);
    }
}
