import java.util.*;

public class Main {
  
   public static void main(String[] args) {
     Gestion admin=new Gestion();
     Scanner input=new Scanner(System.in);
        System.out.println("1 . login\n 2.creat compt");
          int pesp=input.nextInt();

          switch (pesp) {
            case 1:
                login();
                break;
             case 2:
             creat_acompt();
            default:
            System.out.println("error");
                break;
          }
   }
    public static void login(){
        System.out.println("are you a Admen or Normal user\n 1.admen\n 2.user ");
        Scanner input=new Scanner(System.in);
        int rep=input.nextInt();
        if (rep==1) {
             System.out.println(" Admen enter your name");
             String name=input.next();
             System.out.println(" Admen enter your email");
             String email=input.next();
             System.out.println(" Admen enter your id");
             int id=input.nextInt(); input.nextLine();
                Gestion admin=new Gestion();
              admin.addlogin(name,id,email,1);

        }else if(rep==2){
            System.out.println("  enter your name");
             String name=input.next();
             System.out.println("  enter your email");
             String email=input.next();
             System.out.println("  enter your id");
             int id=input.nextInt(); input.nextLine();
             Gestion user=new Gestion();
             user.addlogin(name,id,email,1);
        }
    }
    public static void creat_acompt(){
         System.out.println("are you a Admen or Normal user\n 1.admen\n 2.user ");
        Scanner input=new Scanner(System.in);
        int rep=input.nextInt();
        if (rep==1) {
            System.out.println("  enter your name");
             String name=input.next();
             System.out.println("  enter your email");
             String email=input.next();
             System.out.println("  enter your id");
             int id=input.nextInt(); input.nextLine();


            Gestion admin=new Gestion();
            admin.creat_acompt(name, id, email,1);
           }
           else if(rep==2){
             System.out.println("  enter your name");
             String name=input.next();
             System.out.println("  enter your email");
             String email=input.next();
             System.out.println("  enter your id");
             int id=input.nextInt(); input.nextLine();
            
             Gestion user=new Gestion();
            user.creat_acompt(name, id, email,2);
    }
    }
}