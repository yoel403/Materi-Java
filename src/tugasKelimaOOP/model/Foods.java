package tugasKelimaOOP.model;

public class Foods {
    //atribut
    private String makanan;
    private int harga;
    
    //constructor
    public Foods(){}
    public Foods(int harga) {
        this.harga = harga;
    }

    public Foods( String makanan, int harga) {
        this.harga = harga;
        this.makanan = makanan;
    }
    
    public int getHarga() {
        return harga;
    }

    //method
    public int getHarga(int i) {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }


    @Override
    public String toString() {
        return  makanan + " " + harga ;
    }

    public int getHarga(Foods findById) {
        return harga;
    }

    public void totalHarga(int i){
        getHarga(); 
    }

    public void ppn(){

    }
}
