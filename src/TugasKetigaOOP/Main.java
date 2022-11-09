package TugasKetigaOOP;

import java.util.Scanner;

public class Main {
    //object
    Scanner scanner = new Scanner(System.in);
    Segitiga segitiga = new Segitiga();
    Persegi persegi = new Persegi();
    Lingkaran lingkaran = new Lingkaran();
    Prisma prisma = new Prisma();
    Bola bola = new Bola();
    Kubus kubus = new Kubus();

    //atribut
    String opsi,next, nextOpsi;
    int tinggi , panjang , alas , sisi1, sisi2, sisi3 , lebar, tinggiPrisma, keliling;
    float r;
    public static void main(String[] args) {
        Main main = new Main();
        do {
            main.menuProgram();
            switch (main.opsi) {
                case "1":
                    System.out.println("\n===== Menghitung Lingkaran =====");
                    main.menuPerhitungan();
                    main.opsiLingkaran();
                    break;
                
                case "2":
                    System.out.println("\n===== Menghitung Persegi =====");
                    main.menuPerhitungan();
                    main.opsiPersegi();
                    break;

                case "3":
                    System.out.println("\n===== Menghitung Segitiga =====");
                    main.menuPerhitungan();
                    main.opsiSegitiga();
                    break;

                default:
                System.err.println("Pilihan yang dimasukan invalid silahkan turu");
                    break;
            }
            System.out.print("Ingin melanjutkan Program? y/n : ");
            main.next = main.scanner.next();
        } while (main.next.equalsIgnoreCase("y"));
    }

    public void menuProgram() {
        System.out.println("\nPilihlah Pilihan berikut ini");
        System.out.println("1. Menghitung Lingkaran");
        System.out.println("2. Menghitung Persegi");
        System.out.println("3. Menghitung Segitiga");
        System.out.print("Masukan Pilihan Anda : ");
        opsi = scanner.next();
    }

    public void menuPerhitungan(){
        System.out.println("Menghitung");
        System.out.println("1. Luas");
        System.out.println("2. keliling");
        System.out.println("3. Volume");
        System.out.println("4. Gambar");
        System.out.println("5. Karakteristik");
        System.out.println("6. Luas Permukaan");
        System.out.print("Masukan Pilihan : ");
        nextOpsi = scanner.next();
    }

    public void opsiSegitiga(){
        do {
            switch (nextOpsi) {
                case "1":
                    System.out.println("\nmenghitung luas");
                    System.out.print("Masukan Tinggi : ");
                    tinggi = scanner.nextInt();
                    System.out.print("Masukan Alas : ");
                    alas = scanner.nextInt();
    
                    segitiga.setTinggi(tinggi);
                    segitiga.setAlas(alas);
                    segitiga.luas();
                    break;
    
                case "2":
                    System.out.println("\nmenghitung Keliling");
                    System.out.print("Masukan sisi1 : ");
                    sisi1 = scanner.nextInt();
                    System.out.print("Masukan sisi2 : ");
                    sisi2 = scanner.nextInt();
                    System.out.print("Masukan sisi3 : ");
                    sisi3 = scanner.nextInt();
    
                    segitiga.setSisi1(sisi1);
                    segitiga.setSisi2(sisi2);
                    segitiga.setSisi3(sisi3);
                    segitiga.keliling();
                    break;
    
                case "3":
                    System.out.println("\nmenghitung Volume");
                    System.out.print("Masukan tinggi : ");
                    tinggi = scanner.nextInt();
                    System.out.print("Masukan alas : ");
                    alas = scanner.nextInt();
                    System.out.print("Masukan tinggi prisma : ");
                    tinggiPrisma = scanner.nextInt();

                    prisma.setAlas(alas);
                    prisma.setTinggi(tinggi);
                    prisma.setTinggiPrisma(tinggiPrisma);
                    prisma.volume();
                    break;

                case "4":
                    segitiga.gambarBangun();
                    break;

                case "5":
                    segitiga.karakteristikBangun();
                    break;

                case "6":
                    System.out.println("\nmenghitung LP");
                    System.out.print("Masukan tinggi : ");
                    tinggi = scanner.nextInt();
                    System.out.print("Masukan alas : ");
                    alas = scanner.nextInt();
                    System.out.print("Masukan tinggi prisma : ");
                    tinggiPrisma = scanner.nextInt();
                    System.out.print("Masukan keliling prisma : ");
                    tinggiPrisma = scanner.nextInt();

                    prisma.setAlas(alas);
                    prisma.setTinggi(tinggi);
                    prisma.setTinggiPrisma(tinggiPrisma);
                    prisma.setKeliling(keliling);
                    prisma.volume();
                    break;

                default:
                System.out.println("\nPilihan tidak ada");
                    break;
            }
            System.out.print("Ingin mengulangi? y/n : ");
            next = scanner.next();
        } while (next.equalsIgnoreCase("y"));
        
    }

    public void opsiPersegi(){
        do {
            switch (nextOpsi) {
                case "1":
                    System.out.println("\nmenghitung luas");
                    System.out.print("Masukan sisinya : ");
                    sisi1 = scanner.nextInt();

                    persegi.setSisi(sisi1);
                    persegi.luas();
                    break;
    
                case "2":
                    System.out.println("\nmenghitung Keliling");
                    System.out.print("Masukan sisi : ");
                    sisi1 = scanner.nextInt();
    
                    persegi.setSisi(sisi1);
                    persegi.keliling();
                    break;
    
                case "3":
                    System.out.println("\nmenghitung Volume");
                    System.out.print("Masukan sisi : ");
                    sisi1 = scanner.nextInt();

                    kubus.setSisi(sisi1);
                    kubus.volume();
                    break;

                case "4":
                    persegi.gambarBangun();
                    break;

                case "5":
                    persegi.karakteristikBangun();
                    break;

                case "6":
                    System.out.println("\nmenghitung LP");
                    System.out.print("Masukan sisi : ");
                    sisi1 = scanner.nextInt();

                    kubus.setSisi(sisi1);
                    kubus.luasPermukaan();
                    break;


                default:
                System.out.println("\nPilihan tidak ada");
                    break;
            }
            System.out.print("Ingin mengulangi? y/n : ");
            next = scanner.next();
        } while (next.equalsIgnoreCase("y"));
        
    }

    public void opsiLingkaran(){
        do {
            switch (nextOpsi) {
                case "1":
                    System.out.println("\nmenghitung luas");
                    System.out.print("Masukan jari-jari : ");
                    r = scanner.nextFloat();

                    lingkaran.setR(r);
                    lingkaran.luas();
                    break;
    
                case "2":
                    System.out.println("\nmenghitung Keliling");
                    System.out.print("Masukan jari-jari : ");
                    r = scanner.nextFloat();

                    lingkaran.setR(r);
                    lingkaran.keliling();
                    break;
    
                case "3":
                    System.out.println("\nmenghitung Volume");
                    System.out.print("Masukan jari-jari : ");
                    r = scanner.nextFloat();

                    bola.setR(r);
                    bola.volume();
                    break;

                case "4":
                    lingkaran.gambarBangun();
                    break;

                case "5":
                    lingkaran.karakteristikBangun();
                    break;

                case "6":
                    System.out.println("\nMenghitung LP");
                    System.out.println("Masukan jari jari");
                    r = scanner.nextFloat();

                    bola.setR(r);
                    bola.luasPermukaan();
                    break;
    
                default:
                System.out.println("\nPilihan tidak ada");
                    break;
            }
            System.out.print("Ingin mengulangi? y/n : ");
            next = scanner.next();
        } while (next.equalsIgnoreCase("y"));
        
    }


}