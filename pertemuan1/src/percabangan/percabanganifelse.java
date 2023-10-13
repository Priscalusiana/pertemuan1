
package percabangan;
import java.util.Scanner;
public class percabanganifelse {
    public static void main(String[]args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("total = ");
        double total = masuk.nextDouble();
        System.out.println("Belanja = Rp. "+total);
        if(total >= 600000){
            System.out.println("Dapat diskon 20%");
            double diskon = 20 * total / 100;
            total -= diskon;
            
        }else if(total >= 250000){
            System.out.println("Dapatkan diskon 15%");
            double diskon = 15 * total / 100;
            total -= diskon;
        }else if(total >= 100000){
            System.out.println("Dapatkan diskon 10%");
            double diskon = 10 * total / 100;
            total -= diskon;
    }
   
       
}
}