
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class first {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testbd";
        String user = "root";
        String password = "12341";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                                   rs.getString("name"));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
