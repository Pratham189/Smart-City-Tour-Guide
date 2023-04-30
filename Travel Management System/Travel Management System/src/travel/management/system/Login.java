/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

 private JPanel panel;
 private JTextField textField;
 private JPasswordField passwordField;
        private JButton b1,b2,b3;


 public Login() {
            
 setBackground(new Color(153, 153, 153)); 
        setBounds(550, 250, 700, 400);
  
        panel = new JPanel();
 panel.setBackground(Color.WHITE);
 setContentPane(panel);
 panel.setLayout(null);
        
        JLabel l0 = new JLabel("LOGIN DETAILS");
        l0.setBounds(150,60,190,20);
        l0.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(l0);

 JLabel l1 = new JLabel("Username : ");
 l1.setBounds(50, 89, 95, 24);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
 panel.add(l1);

 JLabel l2 = new JLabel("Password : ");
 l2.setBounds(50, 124, 95, 24);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));

 panel.add(l2);

 textField = new JTextField();
 textField.setBounds(150, 93, 157, 20);
 panel.add(textField);
 
 passwordField = new JPasswordField();
 passwordField.setBounds(150, 128, 157, 20);
 panel.add(passwordField);

 JLabel l3 = new JLabel("");
 l3.setBounds(150, 79, 46, 34);
 panel.add(l3);

 JLabel l4 = new JLabel("");
 l4.setBounds(377, 124, 46, 34);
 panel.add(l3);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/login.png"));
        Image i1 = c1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        
        JLabel l6 = new JLabel(i2);
        l6.setBounds(480, 70, 150, 150);
        add(l6);
        
        
 b1 = new JButton("Login");
 b1.addActionListener(this);
                
 b1.setForeground(new Color(0, 0, 0));
 b1.setBackground(new Color(176, 224, 230));
 b1.setBounds(149, 181, 113, 25);
 panel.add(b1);
  
        b2 = new JButton("SignUp");
 b2.addActionListener(this);
 
 b2.setForeground(new Color(0, 0, 0));
 b2.setBackground(new Color(255, 235, 205));
 b2.setBounds(289, 181, 113, 25);
 panel.add(b2);

 b3 = new JButton("Forgot Password");
 b3.addActionListener(this);
 
        b3.setForeground(new Color(0, 0, 0));
 b3.setBackground(new Color(253, 245, 230));
 b3.setBounds(199, 231, 179, 25);
 panel.add(b3);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(204, 204, 204));
        panel2.setBounds(24, 40, 434, 263);
        panel.add(panel2);
 }
        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
                Boolean status = false;
  try {
                    Conn con = new Conn();
                    String sql = "select * from account where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, textField.getText());
                    st.setString(2, passwordField.getText());

                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        this.setVisible(false);
                        new Loading(textField.getText()).setVisible(true);
                    } else
   JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
                       
  } catch (Exception e2) {
                    e2.printStackTrace();
  }
            }
            if(ae.getSource() == b2){
                setVisible(false);
  Signup su = new Signup();
  su.setVisible(true);
            }   
            if(ae.getSource() == b3){
                setVisible(false);
  ForgotPassword forgot = new ForgotPassword();
  forgot.setVisible(true);
            }
        }
        
   public static void main(String[] args) {
                new Login().setVisible(true);
 }

}