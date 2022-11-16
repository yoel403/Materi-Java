package tugasKeempatV2.services;

import java.util.List;

import tugasKeempatV2.main;
import tugasKeempatV2.model.Person;
import tugasKeempatV2.model.Student;

public class ServicesImpl implements Services {
    private Person person = new Person();
    Student stu = new Student();
    main main = new main();
    @Override
    public void getFullName(String firstName, String lastName) {
        // TODO Auto-generated method stub
        person.setFirstName(firstName);
        person.setLastName(lastName);
        if (getTotalSks() > 144) {
            System.out.println("Nama lengkap : P.S." + person.getFirstName()+" "+ person.getLastName());
        }else{
            System.out.println("Nama lengkap : " + person.getFirstName()+" "+ person.getLastName());
        }
    }

    @Override
    public int getTotalSks() {
        int total = 0;
        for (int i = 0; i < stu.getSks(); i++) {
            total += stu.getSks();
          }
          System.out.println("Total sks : " + total);
          return total;
    }

    @Override
    public void getProfile(String fullName, int cardId, String courseName, String room, int sks, String domisili, List dataSt) {
        person.setCardId(cardId);
        person.setDomisili(domisili);
        stu.setCourseName(courseName);
        stu.setDataSt(dataSt);
        stu.setRoom(room);
        stu.setSks(sks);
        // TODO Auto-generated method stub
        System.out.println("Domisili : " + person.getDomisili()); 
        System.out.println("Id : " + person.getCardId());
        for (Student student : stu.getDataSt()) {
            System.out.println("Nama Matkul : " + student.getCourseName() + " || kode ruangan : " + student.getRoom() +" || sks : "+ student.getSks());
        }
        
    }
    
}
