package tugasKeempat;

import tugasKeempat.services.LearningPLan;

public class Student implements LearningPLan {
    private String courseName, room;
    private int sks, totalSks, newSks;
    
    //constructor
    public Student(String courseName, String room, int sks) {
        this.courseName = courseName;
        this.room = room;
        this.sks = sks;
    }
    public  Student() {}


    //method
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public void courseName() {
        // TODO Auto-generated method stub
    }

    @Override
    public void room() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public int totalSks() {
        // TODO Auto-generated method stub
        
        totalSks = totalSks + getSks();
        return  totalSks;
    }

    // public void dataLP() {
    //     List<Object> student = new ArrayList<>();
    //     student.add(getSks());
    //     student.add(getCourseName());
    //     student.add(getRoom());
    //     student.add(getTotalSks());
    //     System.out.println(student);
    // }
    
}
