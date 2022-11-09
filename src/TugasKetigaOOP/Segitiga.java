package TugasKetigaOOP;

import TugasKetigaOOP.Services.BangunDatar;

public class Segitiga extends BangunDatar {
    private int tinggi, keliling;
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
    public int getKeliling(){
        int hasilKeliling = getSisi1() + getSisi2() + getSisi3();
        System.out.println("Hasil dari keliling segitiga : " + hasilKeliling);
        return hasilKeliling;
    }
    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }

    @Override
    public void gambarBangun() {
        // TODO Auto-generated method stub
        System.out.println("Gambar Segitiga");
        for (int a = 0 ; a<5; a++){
            for (int b = 0 ; b<5; b++){
                System.out.print("* ");
                if ((a+b)==4){
                    break;
                }
            }
           System.out.print("\n");
        }
        System.out.print("\n");
        
        for (int a = 0 ; a<5; a++){
            for (int b = 0 ; b<5; b++){
                System.out.print("* ");
                if (a==b){
                    break;
                }
            }
           System.out.print("\n");
        }
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Memiliki tiga sudut yang sama besarnya, yakni 60 derajat. Memiliki tiga sumbu simetri lipat. Memiliki tiga sumbu simetri putar.");
    }

    @Override
    public void luas() {
        // TODO Auto-generated method stub
        int hasil = getAlas() * getTinggi() / 2;
        System.out.println("Hasil dari Luas Segitiga : " + hasil);
    }

    @Override
    public void keliling() {
        // TODO Auto-generated method stub
        getKeliling();
    }
    
}
