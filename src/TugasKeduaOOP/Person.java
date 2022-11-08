package TugasKeduaOOP;

public class Person {
    private String firstName;
    private String lastName;
    private String domisili;
    private int tahunLahir;


    //Constructur
    public Person(String firstName, String lastName, String domisili, int tahunLahir) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.domisili = domisili;
        this.tahunLahir = tahunLahir;
    }

    public Person(){

    }

    //method class person
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDomisili() {
        return domisili;
    }
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }
    public int getTahunLahir() {
        return tahunLahir;
    }
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public void getProfile() {
        int usia = 2022 - getTahunLahir();
        System.out.println("Profile diri");
        System.out.println("Nama Lengkap : " + getFirstName() + " " + getLastName());
        System.out.println("Domisili : " + getDomisili());
        System.out.println("Tahun Lahir : " + getTahunLahir());
        System.out.println("Usia : " + usia);
    }

}
