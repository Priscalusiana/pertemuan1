
package tugas.polimorfisme_statis;

public class main {
    public static void main(String[]args) {
    double hasil;
    
    Aritmatika objl = new Aritmatika();
    
    objl.penjumblahan(5);
    objl.penjumblahan(5, 10);
    hasil = objl.penjumblahan(4.5d);
    System.out.println("Nilai hasil : " + hasil);
}
}
