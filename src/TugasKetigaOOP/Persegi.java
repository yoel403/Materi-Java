package TugasKetigaOOP;

import TugasKetigaOOP.Services.BangunDatar;

public class Persegi extends BangunDatar{
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

    @Override
    public void gambarBangun() {
        // TODO Auto-generated method stub
        System.out.println("Gambar Persegi");
        System.out.print("\n");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Memiliki sisi-sisi yang sama panjang. Memiliki dua diagonal yang sama panjang (keduanya saling berpotongan dan membentuk tegak lurus serta membaginya menjadi dua bagian sama panjang). Memiliki empat sudut siku-siku yang sama besar, yakni 90 derajat.");
        
    }

    @Override
    public void luas() {
        // TODO Auto-generated method stub
        int hasil = getSisi() * getSisi();
        System.out.println("Hasil luas Persegi : " + hasil);
    }

    @Override
    public void keliling() {
        // TODO Auto-generated method stub
        int hasil = getSisi() * 4;
        System.out.println("Hasil keliling persegi : " + hasil);
    }
    
}
