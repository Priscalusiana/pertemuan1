
package UAS;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class insert {
    

    koneksi konek = new koneksi();
   

    public void insert(int ID, String NAMA, String TINGKAT, String JENIS_KELAMIN, String NAMA_AYAH, String ALAMAT) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              String sql = "insert into datasantri values('"+ID+"','"+NAMA+"','"+TINGKAT+"','"+JENIS_KELAMIN+"','"+NAMA_AYAH+"','"+ALAMAT+"')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }

}



