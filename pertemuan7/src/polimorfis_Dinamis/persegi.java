
package polimorfis_Dinamis;

public class persegi extends Bangundatar {
    int sisi;
    
    @Override
    public float luas(){
        return this.sisi * this.sisi;
        
    }

    @Override
    public float keliling(){
        return this.sisi;
    }
}
