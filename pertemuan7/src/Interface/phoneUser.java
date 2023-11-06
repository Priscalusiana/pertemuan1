
package Interface;

public class phoneUser {
    private phone phone;
    
    public phoneUser(phone phone){
        this.phone = phone;
    }
    
    void turnonthephone(){
        this.phone.poweron();
    }
    
    void turnofthephone(){
        this.phone.poweroff();
}
    
    void makephonelouder(){
        this.phone.volumeup();
    }
    
    void makephonesilent(){
        this.phone.volumedown();
    }
}