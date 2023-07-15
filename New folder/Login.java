import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{//JFrame exist in swing lib
    JButton r,b;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//yhan pr library k layout ka use nhi krna apna layout use krna h
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("quiz.png"));
        JLabel image =new JLabel(i1);
        image.setBounds(-250,-100,1000,800);
        
        add(image);//as reference pass

        JLabel h1=new JLabel("Simple Quizes");
        h1.setBounds(500,50,1000,100);
        h1.setFont(new Font("Viner Hand LTC",Font.BOLD,50));
        h1.setForeground(new Color(30, 144, 254));
        add(h1);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(500,150,300,50);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
        name.setForeground(new Color(30,144, 254));
        add(name);

         tfname=new JTextField();
        tfname.setBounds(500,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

         r= new JButton("Rules");
        r.setBounds(500,250,100,25);
        r.setBackground(new Color(30, 144, 254));
        r.setForeground(Color.WHITE);
        r.addActionListener(this);
        add(r);

        // JButton b= new JButton("Back"); //define as locally due to login constructor
         b= new JButton("Back");
        b.setBounds(700,250,100,25);
        b.setBackground(new Color(30, 144, 254));
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        add(b);
        setSize(1000,700);
        setLocation(200,150);
        setVisible(true);//ise visible hoga frame 

        /*to be click event in rules and back */

    }
    public void actionPerformed(ActionEvent e){
if(e.getSource()==r){// on click on rules we need new class which we define out this file
    String name=tfname.getText();    
    setVisible(false);
        new Rules(name);
}else if(e.getSource()==b){
    setVisible(false);//on click on back whole frame will close
}
    }
    
    public static void main(String[] args) {
        new Login();
    }

}
