package TugasKetigaOOP;

import TugasKetigaOOP.Services.BangunDatar;

public class Lingkaran extends BangunDatar {
    private float r;

    //constructur
    public Lingkaran(Float r) {
        this.r = r;
    }
    public  Lingkaran() {
        
    }

    //method
    public float getR() {
        return r;
    }

    public void setR(Float r) {
        this.r = r;
    }
    
    @Override
    public void gambarBangun() {
        // TODO Auto-generated method stub
        System.out.println("Gambar Bangun");
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){

                if ((i+j) < 4) {
                    System.out.print("  ");
                } else if ((i+j) > 12){
                    System.out.print("  ");
                } else if ((i-j) >= 5 ){
                    System.out.print("  ");
                } else if ((j-i) >= 5){
                    System.out.print("  ");
                }
                else
                    System.out.print("* ");
            }
            System.out.print('\n');      
       }
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Memiliki jumlah sudut 180 derajat. Memiliki diameter yang membagi lingkaran menjadi 2 sisi seimbang. Memiliki jari-jari yang menghubungkan titik pusat dengan titik busur lingkaran");
        
    }

    @Override
    public void luas() {
        // TODO Auto-generated method stub
        float hasil = 22/7 * getR() * getR();
        System.out.println("Hasil luas Lingkaran : " + hasil);
        
    }

    @Override
    public void keliling() {
        // TODO Auto-generated method stub
        float hasil = 2 * 22/7 * getR();
        System.out.println("Hasil keliling lingkaran : " + hasil);
        
    }
    
}
