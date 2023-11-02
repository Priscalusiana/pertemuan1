
package konsepEnkapsulasi;

public class main {

    public static void main(String[] args) {
      user user = new user();
       user.SetUsername("Prisca");
       user.SetPassword("anjaii");
       
       System.out.println("Username : " + user.GetUsername());
       System.out.println("Password : " + user.GetPassword());
    }
    }
    

