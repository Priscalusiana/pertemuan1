
package UAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    
    Connection con=null;
    
    String statuskoneksi = null;
    public void koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost:3306/tugas_gui";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
           //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            
           statuskoneksi = "BERHASIL";
                   
        } catch(Exception e)
            
        {
             statuskoneksi = "GAGAL";
        //JOptionPane.showMessageDialog(null, e);
        System.exit(0);
        }
}
    public static void main(String[] args) {
        koneksi koneksi = new koneksi();
        koneksi.koneksi();
    }
}



