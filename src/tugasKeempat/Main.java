package tugasKeempat;

import java.util.*;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String opsi, next, domisili, room, course, firstName ,lastName, cardId, remmove;
    int sks, total;
    Person person = new Person();
    Student student = new Student();
    List<Student> dataSt = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        
        do {
            main.menuProgram();
            switch (main.opsi) {
                case "1":
                    System.out.println("\n===== Masukan data dengan sesuai =====");
                    System.out.print("Masukan tempat domisili : ");
                    main.domisili = main.scanner.next();
                    System.out.print("Masukan nama Depan : ");
                    main.firstName = main.scanner.next();
                    System.out.print("Masukan nama Belakang : ");
                    main.lastName = main.scanner.next();
                    System.out.println("Masukan cardId : ");
                    main.cardId = main.scanner.next();
                    
                    main.person.setDomisili(main.domisili);
                    main.person.setFirstName(main.firstName);
                    main.person.setLastName(main.lastName);
                    main.person.setCardId(main.cardId);
                    break;
                    
                case "2":
                    Student student1 = main.name();
                    main.dataSt.add(student1);
                    
                    break;

                case "3":
                    System.out.println("\n===== Menunjukan Profile =====");
                    main.person.tampilkanProfile();
                    for (Student student : main.dataSt) {
                        System.out.println("Nama Matkul : " + student.getCourseName() + " || kode ruangan : " + student.getRoom() +" || Total sks : "+ student.getSks());
                    }
                    System.out.print("Ingin menghapus data : ");
                    main.remmove = main.scanner.next();
                    if (main.remmove.equalsIgnoreCase("y")) {
                        main.dataSt.clear();
                    }
                    break;
                
                default:
                System.out.println("Tidak ada dalam pilihan silahkan turu");
                    break;
            }
            System.out.print("Ingin melanjutkan Program? y/n : ");
            main.next = main.scanner.next();
        } while (main.next.equalsIgnoreCase("y"));
    }

    public void menuProgram() {
        System.out.println("\nPilihlah Pilihan berikut ini");
        System.out.println("1. Masukan Data Student");
        System.out.println("2. Masukan Data Learning Plan");
        System.out.println("3. Munculkan Profile");
        System.out.print("Masukan Pilihan Anda : ");
        opsi = scanner.next();
    }

    public Student name() {
        System.out.println("\n===== Masukan data dengan sesuai =====");
        System.out.print("Masukan pelajaran yang dipilih : ");
        course = scanner.next();
        System.out.print("Masukan ruangan : ");
        room = scanner.next();
        System.out.print("Masukan sks yang dipilih : ");
        sks = scanner.nextInt();

        student.setCourseName(course);
        student.setRoom(room);
        student.setSks(sks);
        Student newStudent = new Student(course,room,sks);
        return newStudent;
    }
}
