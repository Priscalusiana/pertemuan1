
package Polimorfisme_statis;

public class Lingkaran {
    float luas(float jarijari){
        return (float) (Math.PI * jarijari * jarijari);
        
    }
    double luas(double diameter){
        return (double)(Math.PI * diameter * 1/4);
    }
    public static void main(String[] args) {
        
        Lingkaran L = new Lingkaran();
        
        float jari2 = 10;
        double d = 20;
        System.out.println("Luas lingkaran dengan jari-jari = " + L.luas(jari2));
        System.out.println("Luas lingkaran dengan Diameter = " + L.luas(d));

    }
}
