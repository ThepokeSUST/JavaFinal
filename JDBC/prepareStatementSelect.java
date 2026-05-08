import  java.sql.*;

public class prepareStatementSelect {
       private final static  String url="jdbc:mysql://localhost:3306/testbd"  ;
    private final static String user="root";
    private static final String password="12341";

    public static void main(String[] args) {
          
           try{
              Connection connection= DriverManager.getConnection(url,user,password);
            //   Statement statement= connection.createStatement();
            
              String query="Select * from student";
              PreparedStatement preparestatement = connection.prepareStatement(query);

              ResultSet executeQuery = preparestatement.executeQuery();

              while(executeQuery.next()){
                System.out.println(executeQuery.getInt("id")+" "+executeQuery.getString("name"));
              }

           
           }
           catch(SQLException se){
            System.out.println(se);
           }
    }
}
