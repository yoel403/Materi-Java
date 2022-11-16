package tugasKeempatV2.model;


public class Person  {

    private String firstName, lastName, domisili;
    private int cardId;

    //constructur
    public Person() {}
    public Person(String firstName, String lastName, String domisili, int cardId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.domisili = domisili;
        this.cardId = cardId;
    }

    //method
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
    public int getCardId() {
        return cardId;
    }
    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
    
}
