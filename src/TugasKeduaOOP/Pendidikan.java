package TugasKeduaOOP;

public class Pendidikan {
    private String nik;
    private String pendidikanTerakhir;
    private int tahun;
    Person person = new Person();

    //constructor
    public Pendidikan(String nik, String pendidikanTerakhir, int tahun) {
        this.nik = nik;
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.tahun = tahun;
    }

    public Pendidikan() {
        
    }


    //method
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }
    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void getSudent() {
        System.out.println("Data Student");
        System.out.println("Nama : " + person.getFirstName() + " " + person.getLastName());
        System.out.println("NIK : " + getNik());
        System.out.println("Pendidikan Terakhir : " + getPendidikanTerakhir() + " Pada tahun " + getTahun());
    }
    
}
