
package polimorfis_Dinamis;

public class segitiga extends Bangundatar{
    int alas;
    int tinggi;
    
    @Override
    public float luas(){
        return (1/2*this.alas) * this.tinggi;
    }
    
}
