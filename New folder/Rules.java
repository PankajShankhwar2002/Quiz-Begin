
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel h1=new JLabel("Welcome "+name+" to Simple Quiz");
        h1.setBounds(50,40,700,50);
        h1.setFont(new Font("Viner Hand LTC",Font.BOLD,40));
     h1.setForeground(new Color(30, 144, 254));
        add(h1);

        
        JLabel rules=new JLabel();
        rules.setBounds(20,20,700,500);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+
            "1. You are trained to be a programmer , answer point to point"+"<br><br>"+
            "2. You may have lot of option in life but here all the question are compulsory"+"<br><br>"+
            "3. Please choose one option out of given options"+"<br><br>"+
            "4.Read carefully questions and choose options"+"<br><br>"+
            "</html>"
        );
     rules.setForeground(new Color(30, 144, 254));
        add(rules);

        back= new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start= new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


        setSize(800,600);
        setLocation(350,100);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);

        }else{
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
      new Rules("User");  
    }
    
}