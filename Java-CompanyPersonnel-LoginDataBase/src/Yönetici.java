
import java.util.Scanner;

public class Yönetici extends Çalışanlar {
   
    public Yönetici(String Çalışan,double Maaş,double calışmaSüresi,String CalisanAd,String Şifre){
        
        super(Çalışan, Maaş, calışmaSüresi, CalisanAd,Şifre);
        
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