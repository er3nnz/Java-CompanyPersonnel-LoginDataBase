
public class Çalışanlar {
    
    private String Calışan;
    private double Maaş;
    private double çalışmaSüresi;
    private String ÇalışanAd;
    private String Şifre;
    
    public Çalışanlar(String Çalışan, double Maaş, double çalışmaSüresi,String ÇalışanAd,String Şifre){
        
        this.Calışan=Çalışan;
        this.Maaş=Maaş;
        this.çalışmaSüresi=çalışmaSüresi;
        this.ÇalışanAd=ÇalışanAd;
        this.Şifre=Şifre;
        
    }

    /**
     * @return the Calışan
     */
    public String getCalışan() {
        return Calışan;
    }

    /**
     * @param Calışan the Calışan to set
     */
    public void setCalışan(String Calışan) {
        this.Calışan = Calışan;
    }

    /**
     * @return the Maaş
     */
    public double getMaaş() {
        return Maaş;
    }

    /**
     * @param Maaş the Maaş to set
     */
    public void setMaaş(double Maaş) {
        this.Maaş = Maaş;
    }

    /**
     * @return the çalışmaSüresi
     */
    public double getÇalışmaSüresi() {
        return çalışmaSüresi;
    }

    /**
     * @param çalışmaSüresi the çalışmaSüresi to set
     */
    public void setÇalışmaSüresi(double çalışmaSüresi) {
        this.çalışmaSüresi = çalışmaSüresi;
    }

    /**
     * @return the ÇalışanAd
     */
    public String getÇalışanAd() {
        return ÇalışanAd;
    }

    /**
     * @param ÇalışanAd the ÇalışanAd to set
     */
    public void setÇalışanAd(String ÇalışanAd) {
        this.ÇalışanAd = ÇalışanAd;
    }

    /**
     * @return the Şifre
     */
    public String getŞifre() {
        return Şifre;
    }

    /**
     * @param Şifre the Şifre to set
     */
    public void setŞifre(String Şifre) {
        this.Şifre = Şifre;
    }
}
