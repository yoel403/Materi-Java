package TugasKeduaOOP;

public class Kubus extends Persegi{
    public void volumeKubus() {
        int hasil = super.getSisi() * super.getSisi() * super.getSisi();
        System.out.println("Hasil volume kubus adalah : " + hasil);
    }
}
