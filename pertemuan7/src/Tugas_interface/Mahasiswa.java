
package Tugas_interface;

public class Mahasiswa implements TugasMahasiswa {
    public Mahasiswa(){
        System.out.println("Tugas Mahasiswa adalah sebagai berikut:");
    }

    @Override
    public void Kuliah() {
        System.out.println("1. Kuliah tepat waktu");
    }

    @Override
    public void belajarMandiri() {
        System.out.println("2. belajar mandiri, Rajin membaca");
    }

    @Override
    public void MengembangkanDiri() {
        System.out.println("3. Dan mengembangkan diri melalui pelatihan dan komunitas");
    }
    
}
