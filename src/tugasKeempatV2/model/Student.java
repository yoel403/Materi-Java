package tugasKeempatV2.model;

import java.util.*;

public class Student {
    private String courseName, room;
    private int sks;
    List<Student> dataSt = new ArrayList<>();
    
    public Student(String courseName, String room, int sks, List<Student> dataSt) {
        this.courseName = courseName;
        this.room = room;
        this.sks = sks;
        this.dataSt = dataSt;
    }
    public Student(){}
    public List<Student> getDataSt() {
        return dataSt;
    }
    public void setDataSt(List<Student> dataSt) {
        this.dataSt = dataSt;
    }
    public Student(String courseName, String room, int sks) {
        this.courseName = courseName;
        this.room = room;
        this.sks = sks;
    }
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

    
}
