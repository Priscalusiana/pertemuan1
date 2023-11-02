
package method_prosedur;

import java.util.Scanner;

public class siswa {
    
public static void siswa (String nama, int umur){
   System.out.println( nama+" berumur "+umur+" tahun");
}
    public static void main(String[] args) {
      String NAMA;
      int UMUR;
      Scanner masuk = new Scanner(System.in);
      System.out.print(" Nama :    ");
      NAMA= masuk.nextLine();
      System.out.print(" Umur :    ");
      UMUR= masuk.nextInt();
      System.out.print(" output :  ");
     siswa(NAMA,UMUR);
    }
    
}


