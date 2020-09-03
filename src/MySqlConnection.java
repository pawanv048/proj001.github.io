import java.sql.*;   
public class MySqlConnection {
    public static void main(String args[])
    {
        Connection con;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mylibrary","root","pawan1997");
        System.out.println("Connection  established");
        
    }
    catch(ClassNotFoundException e)
    {
        System.out.println("Exception"+e.getMessage());
        
    }
        catch(SQLException e) {
            System.out.println("SQlException:"+e.getMessage());
        }
}
}

