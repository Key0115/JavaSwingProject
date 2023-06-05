import java.sql.*;
import java.util.ArrayList;


public class studentModel {
    public ArrayList<student> findElement() {
        Connection con = null;
        Statement st = null;

        int rowsCount = 0;
        ArrayList<student> studentList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = ConnectDB.connectSQL()
                    .prepareStatement("select * from student");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                student Student = new student();
                Student.setStudent_id(rs.getInt("student_id"));
                Student.setFirst_name(rs.getString("first_name"));
                Student.setLast_name(rs.getString("last_name"));
                Student.setSubject_title(rs.getString("subject_title"));
                Student.setSubject_id(rs.getInt("subject_title"));
                Student.setCamp_name(rs.getString("camp_name"));
                studentList.add(Student);
            }

        } catch (SQLException e) {
            System.out.println("Error!");
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignore) {
                }
            }

            return studentList;
        }
    }
}
