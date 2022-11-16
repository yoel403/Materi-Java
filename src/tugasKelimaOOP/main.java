package tugasKelimaOOP;

import java.io.IOException;
import java.util.Scanner;

import tugasKelimaOOP.model.Foods;
import tugasKelimaOOP.services.OrderServiceImpl;
import tugasKelimaOOP.services.Services;
import tugasKelimaOOP.services.FoodServiceImpl;

public class main {
    //Atribut
    static String opsi, opsi1, opsi3;

    //instance object
    static Scanner scan = new Scanner(System.in);
    static OrderServiceImpl orderMenu = new OrderServiceImpl();
    static FoodServiceImpl ser = new FoodServiceImpl();
    private static Services <Foods , Integer> makanan;
    private static Services <Foods , Integer> minuman;
    private static Services <Foods , Integer> mix;
    public static void main(String[] args) throws IOException{
        do {
            System.out.println("\nSelamat datang \n1. Lihat Menu\n2. Memesan\n3. Membayar");
            System.out.print("Silahkan Pilih : ");
            opsi = scan.next();
            switch (opsi) {
                case "1":
                makanan = new FoodServiceImpl();
                minuman = new FoodServiceImpl();
                mix = new FoodServiceImpl();

                // makanan
                Foods foods = new Foods("Ayam" , 15000);
                makanan.save(foods);
                foods = new Foods("bebek" , 18000);
                makanan.save(foods);
                foods = new Foods("kedelai" , 12000);
                makanan.save(foods);
                foods = new Foods("tempe" , 2000);
                makanan.save(foods);
                foods = new Foods("tahu" , 1000);
                makanan.save(foods);
                foods = new Foods("lele" , 20000);
                makanan.save(foods);
                foods = new Foods("Nasi" , 15000);
                makanan.save(foods);

                // minuman
                foods = new Foods("Teh" , 3000);
                minuman.save(foods);
                foods = new Foods("Fanta" , 5000);
                minuman.save(foods);
                foods = new Foods("Kopi" , 5000);
                minuman.save(foods);
                foods = new Foods("Jus" , 10000);
                minuman.save(foods);
                foods = new Foods("Air putih" , 1500);
                minuman.save(foods);

                //paketan
                foods = new Foods("Ayam + Nasi + tempe + tahu + teh" , 25000);
                mix.save(foods);
                foods = new Foods("bebek + nasi + Fanta" , 20000);
                mix.save(foods);
                foods = new Foods("lele + Nasi + Jus + tempe" , 30000);
                mix.save(foods);

                System.out.println("\nMenampilkan menu");
                ser.menuMakanan(makanan, "\n=== MAKANAN ===");
                ser.menuMakanan(minuman, "\n=== MINUMAN ===");
                ser.menuMakanan(mix, "\n=== PAKET ===");
                    break;
                case "2":
                    orderMenu.memesan(mix, makanan, minuman);
                    break;

                case "3":
                    System.out.println("\n=== NOTA ===");
                    if (orderMenu.findAll().isEmpty()) {
                        System.out.println("Data tidak ada");
                    }else{
                        orderMenu.menampilkanPesanan();
                        orderMenu.orderRemove();
                        System.out.println("Ingin menambah pesanan? y/n : ");
                        opsi3 = scan.next();
                        if (opsi3.equalsIgnoreCase("y")) {
                            orderMenu.memesan(mix, makanan, minuman);
                        } 
                        orderMenu.menampilkanPesanan();
                        orderMenu.getTotalHarga();
                    }
                    break;
                    
                default:
                System.out.println("Pilihan tidak ada");
                    break;
            }
        System.out.print("Memesan/membayar? y/n :");
        opsi1 = scan.next();
        } while (opsi1.equalsIgnoreCase("y"));
    }
}
