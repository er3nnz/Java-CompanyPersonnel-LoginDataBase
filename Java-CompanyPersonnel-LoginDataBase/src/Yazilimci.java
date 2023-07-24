
import java.util.Scanner;

public class Yazilimci extends Çalışanlar{
       
    public Yazilimci(String Calışan,double Maaş,double çalışmaSüresi,String ÇalışanAd,String Şifre){
        
        super(Calışan, Maaş, çalışmaSüresi, ÇalışanAd,Şifre);
        
    }
    
    public void çalışanBilgileri(){
        
        System.out.println("Lutfen Kullanicinin Adini Giriniz");
        Scanner scanner=new Scanner(System.in);
        String ad=scanner.nextLine();
        System.out.println("Lutfen Kullanicinin Sifresini Giriniz");
        String şifre=scanner.nextLine();
        
        int deneme=3;
       
        if(getŞifre().equals(şifre)&& getÇalışanAd().equals(ad)){
             
            System.out.println("Kullanici Girisi Dogrudur....\n"
                    + "Giris Yapiliyor....");
         
        System.out.println("\n****************************************\n");
        System.out.println("Calisanin Meslek Grubu: "+getCalışan());
        System.out.println("Calisanin Maasi: "+getMaaş());
        System.out.println("Calisanin Calisma Suresi: "+getÇalışmaSüresi());
        System.out.println("Calisanin Adi: "+getÇalışanAd());
        System.out.println("\n******************************************");
        }
        
       else if(getŞifre()!=şifre || getÇalışanAd()!=ad){
            System.out.println("Kullanici Bilgileriniz Tekrar Kontrol Ediniz....");
            deneme--;
            System.out.println(+deneme+"Hakkiniz Kaldi...");
    
       }
}
    }
                

    
    
    
    
 
