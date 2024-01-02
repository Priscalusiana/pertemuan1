
package uas;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;

public class konfig {
    private static connection MySQLConfig;
    public static connection configDB()throws SQLException{
        {
            String url ="jdbc.mysql://localhost:3306/uas";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.());
            
        }
        return null;
    }
    
}
