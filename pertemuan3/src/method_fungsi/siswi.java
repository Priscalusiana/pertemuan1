
package method_fungsi;
import java.util.Scanner;
public class siswi {
public static String siswi (String nama, int umur){
   return nama+" berumur "+umur+" tahun";
}
    public static void main(String[] args) {
      String NAMA;
      int UMUR;
      Scanner masuk = new Scanner(System.in);
      System.out.print(" Nama :    ");
      NAMA= masuk.nextLine();
      System.out.print(" Umur :    ");
      UMUR= masuk.nextInt();
     System.out.println(siswi(NAMA, UMUR));
    }
    
}
