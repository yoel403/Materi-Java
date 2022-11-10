package tugasKeempat;

import java.util.*;

import tugasKeempat.services.StudentRegristation;

public class Person implements StudentRegristation {
    private String domisili , firstName, lastName, cardId;

    //Constructor
    public Person(String domisili, String firstName, String lastName, String cardId) {
        this.domisili = domisili;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardId = cardId;
    }
    public Person() {
    }
    

    //Method
    public String getDomisili() {
        return "Domisili : " + domisili;
    }
    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }
    public String getFullName() {
        return "Nama lengkap : " + firstName +" "+ lastName;
    }
    public String getCardId() {
        return "card ID : " + cardId;
    }
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
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }


    @Override
    public void fullName() {
        // TODO Auto-generated method stub
        System.out.println("Selamat Datang " + getFullName());
    }
    @Override
    public void cardId() {
        // TODO Auto-generated method stub
        System.out.println(getCardId());
    }

    public void tampilkanProfile() {
        List<String> mahasiswa = new ArrayList<>();
        String[] jav = {getDomisili(),getCardId(),getFullName()};
        mahasiswa.addAll(Arrays.asList(jav));
        System.out.println(mahasiswa);
    }
    
}
