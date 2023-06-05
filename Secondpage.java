import javax.swing.*;
import java.awt.*;

public class Secondpage {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hi");

    public Secondpage(String userID){
        label.setBounds(0,0,200,35);
        label.setFont(new Font("IBM Plex Sans",Font.ITALIC,25));
        label.setText("Hi " + userID);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
