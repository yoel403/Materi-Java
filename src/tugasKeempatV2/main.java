package tugasKeempatV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tugasKeempatV2.model.Person;
import tugasKeempatV2.model.Student;
import tugasKeempatV2.services.Services;
import tugasKeempatV2.services.ServicesImpl;


public class main {
    static Scanner scan = new Scanner(System.in);
    static String opsi, domisili, firstName,lastName, next, matkul, room,remmove;
    static int cardId, sks;
    static Person person = new Person();
    static Student stu = new Student();
    static Services ser = new ServicesImpl();
    static List<Student>dataSt = new ArrayList<>();

    public static void main(String[] args) {
        
        do {
            menuProgram();
            switch (main.opsi) {
                case "1":
                    System.out.println("\n===== Masukan data dengan sesuai =====");
                    System.out.print("Masukan tempat domisili : ");
                    domisili = scan.next();
                    System.out.print("Masukan nama Depan : ");
                    firstName = scan.next();
                    System.out.print("Masukan nama Belakang : ");
                    lastName = scan.next();
                    System.out.print("Masukan cardId : ");
                    cardId = scan.nextInt();
                    
                    person.setFirstName(firstName);
                    person.setLastName(lastName);
                    person.setCardId(cardId);
                    person.setDomisili(domisili);
                    break;
                    
                case "2":
                    System.out.println("Memasukan data student");
                    System.out.print("Matkul : ");
                    matkul = scan.next();
                    System.out.print("Masukan Ruangan : ");
                    room = scan.next();
                    System.out.print("Sks : ");
                    sks = scan.nextInt();
                    
                    stu = new Student(matkul, room, sks);
                    dataSt.add(stu);
                    stu.setDataSt(dataSt);
                    break;
                case "3":
                    System.out.println("\n===== Menunjukan Profile =====");
                    ser.getFullName(firstName, lastName);
                    ser.getProfile(lastName, cardId, firstName, room, sks, domisili, dataSt);
                    System.out.print("Ingin menghapus data : ");
                    main.remmove = main.scan.next();
                    if (main.remmove.equalsIgnoreCase("y")) {
                        main.dataSt.clear();
                    }
                    break;

                default:
                System.out.println("Tidak ada dalam pilihan silahkan turu");
                    break;
            }
            System.out.print("Ingin melanjutkan Program? y/n : ");
            main.next = main.scan.next();
        } while (main.next.equalsIgnoreCase("y"));
    }

    public static void menuProgram() {
        System.out.println("\nPilihlah Pilihan berikut ini");
        System.out.println("1. Masukan Data Student");
        System.out.println("2. Masukan Data Learning Plan");
        System.out.println("3. Munculkan Profile");
        System.out.print("Masukan Pilihan Anda : ");
        opsi = scan.next();
    }
}
