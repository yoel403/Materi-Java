package tugasKeempatV2.services;

import java.util.List;

public interface Services {
    public void getFullName(String firstName, String lastName);
    public int getTotalSks();
    public void getProfile(String fullName, int cardId, String courseName, String room, int sks, String domisili,List dataSt);
}
