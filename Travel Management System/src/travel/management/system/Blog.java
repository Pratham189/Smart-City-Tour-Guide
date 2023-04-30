/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
/**
 *
 * @author Pratham Dave
 */
public class Blog extends JFrame implements ActionListener{


    JButton j1;
    JLabel jl;
    Font g, h, j;
    TextArea ta;
    String st;
    public Blog(){

        setLayout(null);
        JButton j1 = new JButton("Exit");
        add(j1);
        j1.setBounds(180, 430, 120, 20);
        j1.addActionListener(this);

        Font g = new Font("Arial", Font.BOLD, 180);
        setFont(g);

        ImageIcon ii = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/blog_gif.gif"));
Image ic = ii.getImage().getScaledInstance(300, 270, Image.SCALE_DEFAULT);
ImageIcon imc = new ImageIcon(ic);
jl = new JLabel(imc);
jl.setBounds(50, 100, 350, 270);
add(jl);
      

        JLabel jl = new JLabel("Blog Page");
        add(jl);
        jl.setBounds(170, 10, 180, 80);
        jl.setForeground(Color.black);

        Font j = new Font("Arial", Font.ITALIC, 22);
        jl.setFont(j);

        setBounds(700, 220, 500, 550);

        setLayout(null);
        setVisible(true);        
    }
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
    public static void main(String args[]) {
        new Blog().setVisible(true);
    }
}    
    
    
    

