 
package Interface;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
         phone redmi3pro = new xiaomi();
         phoneUser charis = new phoneUser(redmi3pro);
         
         charis.turnonthephone();
         
         Scanner input = new Scanner(System.in);
         String aksi = null;
         
         while (true){
            System.out.println("====== APLIKASI INTERFFACE ======");
            System.out.println("[1] Nyalakan HP ");
            System.out.println("[2] Matikan HP ");
            System.out.println("[3] Perbesar volume ");
            System.out.println("[4] Kcilkan volume ");
            System.out.println("[0] Keluar ");
            System.out.println(" Pilih aksi ");
            
            aksi= input.nextLine();
            if(aksi.equals("1")){
                charis.turnonthephone();
                
         }else if(aksi.equals("2")){
             charis.turnofthephone();
             
         }else if(aksi.equals("3")){
             charis.makephonelouder();
             
         }else if(aksi.equals("4")){
             charis.makephonesilent();
             
         }else if(aksi.equals("0")){
             System.exit(0);
         }else{
             System.out.println("SALAH WOOYYY...");
         }
    }
}
}