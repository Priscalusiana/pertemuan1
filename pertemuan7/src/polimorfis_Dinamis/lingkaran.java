
package polimorfis_Dinamis;

public class lingkaran extends Bangundatar{
      int r;
      
      @Override
      public float luas(){
          return (float) Math.PI * r * r;   
      }
      
      @Override
      public float keliling(){
          return (float)(2* Math.PI * r);
 }
}
