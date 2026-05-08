import  java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class prepareStatementInsert {
      private final static  String url="jdbc:mysql://localhost:3306/testbd"  ;
    private final static String user="root";
    private static final String password="12341";

    public static void main(String[] args) {
          
           try{
              Connection connection= DriverManager.getConnection(url,user,password);
            //   Statement statement= connection.createStatement();
            
              String query="Insert into student(id,name) values(?,?)";
              PreparedStatement preparestatement = connection.prepareStatement(query);

              preparestatement.setInt(1, 20);
              preparestatement.setString(2, "thepoke");

              int n=preparestatement.executeUpdate();
              System.out.println(n);
           }
           catch(SQLException se){
            System.out.println(se);
           }
    }
}
