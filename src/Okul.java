public class Okul {
    private String adi;
    private  String adresi;
    private int numarasi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getAdresi() {
        return adresi;
    }

    public void setAdresi(String adresi) {
        this.adresi = adresi;
    }

    public int getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }

    public Okul(String adi, String adresi, int numarasi) {
        this.adi = adi;
        this.adresi = adresi;
        this.numarasi = numarasi;


    }
}
