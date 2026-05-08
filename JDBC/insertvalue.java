
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class insertvalue {
    private final static  String url="jdbc:mysql://localhost:3306/testbd"  ;
    private final static String user="root";
    private static final String password="12341";

    public static void main(String[] args) {
          
           try{
              Connection connection= DriverManager.getConnection(url,user,password);
              Statement statement= connection.createStatement();
              String query=String.format("Insert into student(id,name) values(%o,%s)",12,"'Rifat'");

              int executeUpdate = statement.executeUpdate(query);

              System.out.println(executeUpdate);
           }
           catch(SQLException se){
            System.out.println(se);
           }
    }

}
