
package uts;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       NamaHP a = new NamaHP(); 
       TipeHP b = new TipeHP();
       Harga c = new Harga();
       
       System.out.println("siapa nama kamu?");
       Scanner input = new Scanner(System.in);
       String inputNama = input.nextLine();
       b.texs(inputNama);
       
       System.out.println("                              ");
       System.out.println("                       ======PILIH HP KESAYANGANMU 💖 =======");
       System.out.println("                              ");
       
       
       System.out.print(" Nama HP : ");
       String Nama = input.nextLine();
       
       System.out.print(" Tipe HP : ");
       String Tipe = input.nextLine();
       
       System.out.print(" Harga HP : ");       
       int Harga = input.nextInt();
       
       System.out.print("                       ");
       System.out.println("===HANDPHONE KESAYANGAN KAMU ADALAH 💖===");
       System.out.println("Nama HP : "+Nama);
       System.out.println("Dengan Tipe HP : "+Tipe);
       System.out.println("Yang berharga : "+Harga);
       System.out.println("                              ");
       System.out.println("====TERIMA KASIH❤=====");

       
    }
    
}
