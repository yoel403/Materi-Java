package TugasKeduaOOP;

public class Lingkara {
    private float r;

    //constructur
    public Lingkara(Float r) {
        this.r = r;
    }
    public  Lingkara() {
        
    }

    //method
    public float getR() {
        return r;
    }

    public void setR(Float r) {
        this.r = r;
    }
    
    public void luasLingkaran() {
        float hasil = 22/7 * getR() * getR();
        System.out.println("Hasil luas Lingkaran : " + hasil);
    }

    public void kelilingLingkaran(){
        float hasil = 2 * 22/7 * getR();
        System.out.println("Hasil keliling lingkaran : " + hasil);
    }
}
