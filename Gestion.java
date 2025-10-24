import java.util.LinkedList;
 class Gestion {
    LinkedList<Admin> admen=new LinkedList<Admin>();
   
    LinkedList<NormalUser> Normaluser=new LinkedList<NormalUser>();
    public Gestion(){
         /*Admin admine=new Admin( "hassan", 50, "ahssan@123");
      admen.add(admine);
         NormalUser user=new NormalUser( "hassan", 50, "ahssan@123");
         NormalUser.add(user);*/
    };
    public void addlogin(String name,int id,String email,int type){
       if (type==1) {
       //  Admin admin1=new Admin(name, id, email);
        //admen.add(admin1);
         for ( Admin i : admen) {
             if (i.getid()==id) {
                System.out.println("welcom to your compt:"+i.getName());
             }else{
                System.out.println("your informations are incorrect");
             }
            
        }
       }else if(type==2){
            // NormalUser user1=new NormalUser(name, id, email);
            // Normaluser.add(user1);
           for ( NormalUser i : Normaluser) {
             if (i.getid()==id) {
                System.out.println("welcom to your compt:"+i.getName());
             }else{
                System.out.println("your informations are incorrect");
             }
            
        }
       }
      
       
     
     
    }

    public  void creat_acompt(String name,int id,String email,int type){
            if (type==1) {
                Admin admine=new Admin(name ,id ,email ); 
                admen.add(admine);
                if(admen.contains(admine)){
                    System.out.println("your compt created successufly");
                }else{
                  System.out.println("error ");
                }
            }else if(type==2){
                 NormalUser user=new NormalUser(name ,id ,email ); 
                Normaluser.add(user);
                if(Normaluser.contains(user)==true){
                    System.out.println("your compt created successufly");
                }else{
                   System.out.println("error ");
                }
            }
    }
}
