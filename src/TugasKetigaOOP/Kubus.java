package TugasKetigaOOP;

import TugasKetigaOOP.Services.BangunRuang;

public class Kubus extends Persegi implements BangunRuang{

    @Override
    public void gambarBangun() {
        // TODO Auto-generated method stub
        System.out.println("Gambar Kubus");
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
        System.out.println("Mempunyai 12 rusuk yang sama panjang. Semua sudutnya siku-siku. Mempunyai 12 diagonal sisi dengan ukuran yang sama panjang. Mempunyai 4 diagonal ruang dengan ukuran yang sama panjang.");
    }

    @Override
    public void luasPermukaan() {
        // TODO Auto-generated method stub
        int hasil = 6 * super.getSisi() * super.getSisi();
        System.out.println("Hasil LP kubus adalah : " + hasil);
    }

    @Override
    public void volume() {
        // TODO Auto-generated method stub
        int hasil = super.getSisi() * super.getSisi() * super.getSisi();
        System.out.println("Hasil volume kubus adalah : " + hasil);
    }
    
}
