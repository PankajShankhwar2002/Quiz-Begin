import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 1000, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("scr.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, 150, 300, 290);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " !! -> for playing Simple Minds");
        heading.setBounds(50, 40, 900, 50);
        heading.setForeground(new Color(40, 145, 255));
        
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 420, 50);
        lblscore.setFont(new Font("Arial", Font.ITALIC, 50));
        heading.setForeground(new Color(76, 0, 153));
        add(lblscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 200, 40);
        submit.setBackground(new Color(30, 144, 255));
        submit.setFont(new Font("Arial",Font.ITALIC,30));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
