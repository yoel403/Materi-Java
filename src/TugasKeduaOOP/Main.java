package TugasKeduaOOP;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String opsi,next,firstName,lastName,domisili,nik,pendidikanTerakhir;
    int tahunLahir,tahun;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Person person = new Person();
        Pendidikan pendidikan = new Pendidikan();
        
        do {
            main.menuApp();
            switch (main.opsi) {
                case "1":
                System.out.println("\n===== Memasukan Data Pribadi =====");
                System.out.print("Masukan Nama depan : ");
                main.firstName= main.scanner.next();
                System.out.print("Masukan Nama Belakang : ");
                main.lastName= main.scanner.next();
                System.out.print("Masukan tahun lahir : ");
                main.tahunLahir= main.scanner.nextInt();
                System.out.print("Masukan Nama domisili : ");
                main.domisili = main.scanner.next();
                System.out.println("data dimasukan");

                person.setFirstName(main.firstName);
                person.setLastName(main.lastName);
                person.setDomisili(main.domisili);
                person.setTahunLahir(main.tahunLahir);
                break;

                case "2":
                System.out.println("\n===== Memasukan Data Student =====");
                System.out.println("Masukan NIK : ");
                main.nik = main.scanner.next();
                System.out.println("Masukan Pendidikan Terakhir : ");
                main.pendidikanTerakhir = main.scanner.next();
                System.out.println("Pada Tahun : ");
                main.tahun = main.scanner.nextInt();
                System.out.println("Data Dimasukan");

                pendidikan.setNik(main.nik);
                pendidikan.setPendidikanTerakhir(main.pendidikanTerakhir);
                pendidikan.setTahun(main.tahun);
                break;

                case "3":
                System.out.println("\n===== Menampilkan Data Pribadi =====");
                person.getProfile();
                break;

                case "4":
                System.out.println("\n===== Menampilkan Data Student =====");
                pendidikan.getSudent();
                break;
            
                default:
                System.out.println("Pilihan tidak ada");
                break;
            }
            System.out.println("ingin melanjutkan? (y/n)");
            main.next= main.scanner.next();

        } while (main.next.equalsIgnoreCase("y"));
    }

    public void menuApp() {
        System.out.println("====== MENU ======");
        System.out.println("1. Input Data Pri1badi");
        System.out.println("2. Input data student");
        System.out.println("3. Tampilkan data pribadi");
        System.out.println("4. Tampilkan data student");
        System.out.print("Masukan Pilihan : ");
        opsi = scanner.next();
    }
}
