import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame myframe = new JFrame();
    JButton login = new JButton("Login");
    JButton logout = new JButton("Reset");
    JTextField userInput = new JTextField();
    JPasswordField userPassword = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserID: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();
    HashMap<String,String>logininfo = new HashMap<String,String>();
    public LoginPage(HashMap<String,String> originalinfo){
        logininfo = originalinfo;

        userIDLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font("IBM Plex Sans",Font.ITALIC,25));
        userInput.setBounds(125,100,200,25);
        userPassword.setBounds(125,150,200,25);

        login.setBounds(125,200,100,25);
        login.setFocusable(false);
        login.addActionListener(this);

        logout.setBounds(225,200,100,25);
        logout.setFocusable(false);
        logout.addActionListener(this);


        myframe.add(userIDLabel);
        myframe.add(passwordLabel);
        myframe.add(messageLabel);
        myframe.add(userInput);
        myframe.add(userPassword);
        myframe.add(login);
        myframe.add(logout);

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setSize(420,420);
        myframe.setLayout(null);
        myframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == logout){
            userInput.setText("");
            userPassword.setText("");
        }
        if(e.getSource() == login){
            String userID = userInput.getText();
            String password = String.valueOf(userPassword.getPassword());
            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login Successful!");
                    myframe.dispose();
                    Secondpage secondpage = new Secondpage(userID);
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Invalid password");
                }
            }
            else{
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Invalid username");
            }
        }

    }
}
