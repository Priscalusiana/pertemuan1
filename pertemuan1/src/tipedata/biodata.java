 
package tipedata;

import java.util.Scanner;

public class biodata {

      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String nama, alamat;
      int umur;
      System.out.print("Nama   :   ");
      nama = input.nextLine();
      System.out.print("alamat :   ");
      alamat = input.nextLine();
      System.out.print("umur   :   ");
      umur = input.nextInt();
      System.out.println("===========================");
      System.out.println(nama + " lahir di" + alamat);
      System.out.println("Berumur " + umur + "tahun");
        }

   }
    

