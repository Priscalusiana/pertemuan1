
package UAS;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class update {
    
    koneksi konek = new koneksi();
  
    public void ubah(int ID, String NAMA,String TINGKAT, String JENIS_KELAMIN, String NAMA_AYAH, String ALAMAT) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              
            String sql_NAMA = "UPDATE datasantri SET ID ='"+ID+"',NAMA='"+NAMA+"',TINGKAT='"+TINGKAT+"',JENIS_KELAMIN='"+JENIS_KELAMIN+"',NAMA_AYAH='"+NAMA_AYAH+"',ALAMAT='"+ALAMAT+"'WHERE ID ='"+ID+"'";
            statement.executeUpdate(sql_NAMA);
            
            
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Diedit");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
 
}

