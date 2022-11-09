package TugasKeduaOOP;

public class Bola extends Lingkara {

    public void volumeLingkaran() {
        float hasil = 4/3 * 22/7 * super.getR() * super.getR() * super.getR();
        System.out.println("Hasil Volume lingkaran : " + hasil );
    }

}