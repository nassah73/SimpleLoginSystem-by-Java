import java.util.LinkedList;
public class Gestion {
    LinkedList<Admin> admen=new LinkedList<Admin>();
   
    LinkedList<NormalUser> NormalUser=new LinkedList<NormalUser>();
    public Gestion(){
         Admin admine=new Admin( "hassan", 50, "ahssan@123");
      admen.add(admine);
    };
    public void addlogin(String name,int id,String email){
        for ( Admin i : admen) {
             if (i.getid()==id) {
                System.out.println("welcom to you compt:"+i.getName());
             }else{
                System.out.println("your information is incorrect");
             }
            
        }
     
     
    }
}
