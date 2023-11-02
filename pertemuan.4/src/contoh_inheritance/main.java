 
package contoh_inheritance;

public class main {
    public static void main(String[] args) {
    //Objek Bangun Datar
       Bangundatar BDI = new Bangundatar();
       
       persegi P = new persegi();
       P.sisi= 5;
       
       lingkaran L =new lingkaran();
       L.r= 22;
       
       persegipanjang PP = new persegipanjang();
       PP.lebar= 6;
       PP.panjang= 12;
       
       segitiga S = new segitiga();
       S.alas= 5;
       S.tinggi= 10;
       
       //Menunjukkan Inheritance
       BDI.luas();
       BDI.keliling();
       
       P.luas();
       P.keliling();
       
       L.luas();
       L.keliling();
       
       PP.luas();
       PP.keliling();
       
       S.luas();
       S.keliling();
    }
    
}


