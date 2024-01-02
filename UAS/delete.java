 
package UAS;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class delete {
   
    koneksi konek = new koneksi();
  
    public void delete(int ID) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              String sql = "delete from datasantri where ID ='"+ID+"'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}
