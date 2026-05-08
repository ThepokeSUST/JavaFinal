
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Main {
    // jdbc:mysql://localhost:3306/testbd

    private  static  final String url="jdbc:mysql://localhost:3306/testbd";
    private static final String user="root";
    private static final String password="12341";

       public static void main(String[] args) {
           
          
         try{
         Connection connection=DriverManager.getConnection(url, user, password);

        Statement statement= connection.createStatement();
        String query="SELECT * FROM student";
        ResultSet executeQuery = statement.executeQuery(query);
        

        while(executeQuery.next()){
            int id=executeQuery.getInt("id");
            String name= executeQuery.getString("name");
            System.out.println(id+" "+name);
        }



         }
         catch(SQLException se){
            System.out.println(se);
         }
           
       }
}
