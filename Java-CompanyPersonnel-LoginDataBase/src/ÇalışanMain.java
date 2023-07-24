
import java.util.Scanner;


public class ÇalışanMain {
    
    public static void main(String[] args) {
        
       Scanner scanner=new Scanner(System.in);
       
       
       
       //Sistemin veri tabani,kayitli kullanici bilgierinin saklandığı alan.....
       Yazilimci yazilimci = new Yazilimci("Yazilimci", 5000, 10, "", "");
       Yönetici yönetici= new Yönetici("Yönetici", 20000, 20, "","");
       
       
        System.out.println("Calisan Ozelliklerini Yazdirma Programina Hosgeldiniz...\n\n"
                + "Lutfen Ozelligini Yazdirmak Istediginiz Calisani Seciniz:\n"
                + "1:Yazilimci\n"
                + "2:Yonetici\n"
                + "3:Sistemden Cikis Yapmak Icin : q basiniz.....\n");
        
     String secenek=scanner.nextLine();
      
      if(secenek.equals("Yazilimci")){
          yazilimci.çalışanBilgileri();
      }
      else if(secenek.equals("Yönetici")){
          yönetici.çalışanBilgileri();
      }
      else if(secenek.equals("q")){
          System.out.println("Sistemden Cikis Yapiliyor.....");
      } 
    }
  }
