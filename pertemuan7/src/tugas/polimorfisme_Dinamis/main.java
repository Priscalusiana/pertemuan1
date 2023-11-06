
package tugas.polimorfisme_Dinamis;

public class main extends hewan {

    @Override
    public void suara(){
        System.out.println("mengikik....");
    }
    
    public static void main(String[] args){
        
        hewan kuda = new hewan();
        kuda.suara();
    }
}
