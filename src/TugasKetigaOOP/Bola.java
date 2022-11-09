package TugasKetigaOOP;

import TugasKetigaOOP.Services.BangunRuang;

public class Bola extends Lingkaran implements BangunRuang{
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
        System.out.println("Tidak memiliki rusuk dan titik sudut. Memiliki satu bidang sisi lengkung, yakni selimut bola. Terdapat jari-jari dan diameter.");
    }

    @Override
    public void luasPermukaan() {
        // TODO Auto-generated method stub
        if (super.getR() %7 == 0) {
            float hasil = 4 * 22/7 * super.getR() * super.getR();
            System.out.println("Hasil LP Bola : " + hasil);
        } else {
            double hasil = 4 * 3.14 * super.getR() * super.getR();
            System.out.println("Hasil LP Bola : " + hasil);
        }
    }

    @Override
    public void volume() {
        // TODO Auto-generated method stu
            if (super.getR() %7 == 0) {
                float hasil = 4/3 * 22/7 * super.getR() * super.getR() * super.getR();
                System.out.println("Hasil Volume Bola : " + hasil);
            } else {
                double hasil = 4/3 * 3.14 * super.getR() * super.getR() * super.getR();
                System.out.println("Hasil Volume Bola : " + hasil);
            }
    }
    
}
