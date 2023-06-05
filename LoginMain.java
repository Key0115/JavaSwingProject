import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoginMain {
    public static void main(String[] args) {
        IDandPassword id = new IDandPassword();
        LoginPage login = new LoginPage(id.getId());




        /*JFrame frame = new JFrame("student");
        frame.setContentPane(new studentPage().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);*/

    }
}
