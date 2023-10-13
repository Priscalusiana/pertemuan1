package array;
import java.util.Scanner;
public class praktik {
    public static void main(String[]args){
        int a[] = new int[3];
        Scanner masuk = new Scanner(System.in);
        System.out.print("index ke-0 : ");
        a[0] = masuk.nextInt();
        System.out.print("index ke-1 : ");
        a[1] = masuk.nextInt();
        System.out.print("index ke-2 : ");
        a[2] = masuk.nextInt();
        
        System.out.println("-----------");
        System.out.println("output");
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        
    }
    
}
 