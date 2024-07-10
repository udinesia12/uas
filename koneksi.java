import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class koneksi {
    private static Connection mysqlconfig;
    
    public static Connection ConfigDB()throws SQLException{
        try {
            String url ="jdbc:mysql://localhost:3306/uas";
            String user= "root";
            String pasword= "";
            mysqlconfig = DriverManager.getConnection(url,user,pasword);
        
        }catch (Exception e){
            System.out.println("koneksi gagal"+e.getMessage());
    }
        return (Connection) mysqlconfig;
}
    
}
