package TugasKetigaOOP;

import TugasKetigaOOP.Services.BangunRuang;

public class Prisma extends Segitiga implements BangunRuang{
    private int tinggiPrisma;

    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(int tinggi) {
        this.tinggiPrisma = tinggi;
    }

    @Override
    public void gambarBangun() {
        // TODO Auto-generated method stub
        System.out.println("Gambar bangun prisma");
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ((i+j) < 8){
                    System.out.print("  ");
                } else if (i>j) {
                    System.out.print("  ");
                } else
                    System.out.print("* ");
            }
            System.out.print('\n');
        }
    }

    @Override
    public void karakteristikBangun() {
        // TODO Auto-generated method stub
        System.out.println("Prisma segitiga mempunyai 5 sisi, 3 sisi di samping yang bentuknya persegi panjang dan 2 sisi alas dan atap yang bentuknya segitiga. Prisma segitiga mempunyai 6 titik sudut. Prisma segitiga mempunyai 9 rusuk, 3 di antara rusuk tersebut adalah rusuk tegak.");
        
    }

    @Override
    public void luasPermukaan() {
        // TODO Auto-generated method stub
        int hasilLP = super.getAlas() * super.getTinggi() + super.getKeliling() * this.getTinggiPrisma(); 
        System.out.println("Hasil LP Prisma : " + hasilLP);
    }

    @Override
    public void volume() {
        // TODO Auto-generated method stub
        int hasilVolume = super.getAlas() * super.getTinggi() / 2 * this.getTinggiPrisma();
        System.out.println("Hasil dari volume Prisma : " + hasilVolume);
    }
    
}
