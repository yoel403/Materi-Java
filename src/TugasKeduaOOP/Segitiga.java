package tugasKeduaOOP;

public class Segitiga {
    private int tinggi;
    private int alas ;
    private int sisi1; 
    private int sisi2; 
    private int sisi3;

    //constructor
    public Segitiga(int tinggi, int alas, int sisi1, int sisi2, int sisi3) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    public Segitiga() {}


    //method
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getSisi1() {
        return sisi1;
    }
    public void setSisi1(int sisi1) {
        this.sisi1 = sisi1;
    }
    public int getSisi2() {
        return sisi2;
    }
    public void setSisi2(int sisi2) {
        this.sisi2 = sisi2;
    }
    public int getSisi3() {
        return sisi3;
    }
    public void setSisi3(int sisi3) {
        this.sisi3 = sisi3;
    } 
    public int luasSegitiga() {
        int hasil = getAlas() * getTinggi() / 2;
        System.out.println("Hasil dari Luas Segitiga : " + hasil);
        return hasil;
    }
    public void kelilingSegitiga() {
        int hasilKeliling = getSisi1() + getSisi2() + getSisi3();
        System.out.println("Hasil dari keliling segitiga : " + hasilKeliling);
    }
}
