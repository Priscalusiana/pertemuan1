
package konsepEnkapsulasi;

public class user {
    private String Username; 
    private String Password;

public void SetUsername(String Username){
    this.Username = Username ;
}
public void SetPassword(String Password){
    this.Password = Password;
}
public String GetUsername(){
   return this.Username;
}
public String GetPassword(){
    return this.Password;
}
}


