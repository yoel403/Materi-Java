package TugasKeduaOOP;

public class Prisma extends Segitiga {

    private int tinggiPrisma;

    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(int tinggi) {
        this.tinggiPrisma = tinggi;
    }

    public void hasilVolumee() {
        int hasilVolume = super.getAlas() * super.getTinggi() / 2 * this.getTinggiPrisma();
        System.out.println("Hasil dari volume : " + hasilVolume);
    }
}
