
package perulangan;
import java.util.Scanner;
public class Nilai {
    public static void main(String[] args){
    Scanner masuk = new Scanner(System.in);
    int jml;
    double nilai, total = 0, rerata;
    System.out.print("berapa nilai : ");
    jml = masuk.nextInt();
    for(int i = 1; i <= jml; i++){
        System.out.print("nilai ke-"+i+" = ");
        nilai = masuk.nextDouble();
        total += nilai;
    }
    rerata = total / jml;
    System.out.println("total     = "+total);
    System.out.println("rerata     = "+rerata);
    }
    
    
}
