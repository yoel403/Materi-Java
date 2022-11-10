package tugasKeduaOOP;

public class Persegi {
    private int sisi;

    //constructor
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public Persegi(){
    }

    //method
    public int getSisi() {
        return sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void luasPersegi(){
        int hasil = getSisi() * getSisi();
        System.out.println("Hasil luas Persegi : " + hasil);
    }
    public void kelilingPersegi() {
        int hasil = getSisi() * 4;
        System.out.println("Hasil keliling persegi : " + hasil);
    }

}
