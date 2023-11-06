
package Interface;

public class xiaomi implements phone {

    private int volume;
    private boolean ispoweron;
    
    public xiaomi(){
        this.volume= 50;
    }
    @Override
    public void poweron() {
       ispoweron = true;
       System.out.println("Hanphone menyala...");
       System.out.println("Selamat Datang Dixiaomi PHONE");
       System.out.println("Android version 100");
       
    }

    @Override
    public void poweroff() {
         ispoweron = false;
         System.out.println("Handphone Dimatikan");
    }

    @Override
    public void volumeup() {
        if(ispoweron){
            if(this.volume == MAX_VOLUME) {
                System.out.println("VOLUME FULL");
                System.out.println("Sudah "+ this.getvolume() + "%");
            }else{
                this.volume+= 10;
                System.out.println("Volume sekrang :  " + this.getvolume());
            }
        }else{
            System.out.println("nyalakan dulu HPnya broooww...");
        }
    }

    @Override
    public void volumedown() {
 if(ispoweron){
            if(this.volume == MIN_VOLUME) {
                System.out.println("VOLUME sudah mentok paling rendah");
                System.out.println("Sudah "+ this.getvolume() + "%");
            }else{
                this.volume-= 10;
                System.out.println("Volume sekrang :  " + this.getvolume());
            }
        }else{
            System.out.println("nyalakan duu HPnya broooww...");
        }
    }
    
    public int getvolume(){
       return this.volume;
    }
}

    

