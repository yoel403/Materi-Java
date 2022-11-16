package tugasKelimaOOP.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tugasKelimaOOP.model.Foods;
import tugasKelimaOOP.model.Order;

public class OrderServiceImpl implements Services<Order , Integer> {
    List<Order> orders = new ArrayList<>();
    Order order;
    Scanner scan = new Scanner(System.in);
    int totalJ , nambah , totalA;
    FoodServiceImpl ser = new FoodServiceImpl();
    

    public int getTotalJ(Order order) {
        totalJ = 0;
        return totalJ += (order.getFoods().getHarga() * order.getTotal());
    }

    public void setTotalJ(int totalJ) {
        this.totalJ = totalJ;
    }

    public void menampilkanPesanan() {
        totalA = 0;
        System.out.println("\nPesanan ANDA : ");
        if (this.findAll().isEmpty()) {
            System.out.println("Data kosong");
        }else{
            int y = 0;
            for (Order order : this.findAll() ) {
                y++;
                totalA += getTotalJ(order);
                System.out.println(y+". "+order);
                System.out.println("Harga : Rp." + order.getFoods().getHarga() * order.getTotal());
            }
        }
    }

    public void getTotalHarga() {
        int pay, totalS;
        do {
            int ppn = totalA * 11/100;
            totalS = ppn + totalA;
            System.out.println("\n=== Pembayaran ===");
            System.out.println("harga (sudah termasuk ppn): Rp." + totalS );
            System.out.print("Silahkan Dibayar : ");
            pay = scan.nextInt();
            if (pay < totalS ) {
                System.out.println("Uang Kurang");
            } else {
                int kembalian = pay - totalS;
                System.out.println("\n==== Pembayaran berhasil Terimakasih ====");
                menampilkanPesanan();
                System.out.println("\nHarga (sudah termasuk ppn): Rp." + totalS );
                System.out.println("Uang yang di beri : Rp." + pay);
                System.out.println("Kembalian = Rp." + kembalian);
                System.out.println();
                LocalDateTime now = LocalDateTime.now();  
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
                String formatDateTime = now.format(format);  
                System.out.println(formatDateTime);  
            }
        } while (pay < totalS);
    }

    public void orderRemove() {
        boolean rem = true;
        while (rem) {
            System.out.print("\nAda yang ingin di hapus? y/n : " );
            String remove = scan.next();
            if (remove.equalsIgnoreCase("y")) {
                System.out.print("pilih nomor yang ingin di hapus : ");
                int rmv = scan.nextInt();
                this.delete(rmv);
                menampilkanPesanan();
            }else{
                rem = false;
            }
        }
    }

    public void inputOrder(Services<Foods, Integer> data) {
        String opsi;
        do {
            order = new Order();
            nambah = 0;
            System.out.print("Masukan nomor makanan yang ingin dipilih : ");
            int food = scan.nextInt();
            System.out.print("jumlah : ");
            nambah = scan.nextInt();
            order.setTotal(nambah);
            order.setFoods(data.findById(food));
            this.save(order);
            System.out.print("ingin menambah pilihan? y/n : ");
            opsi = scan.next();
        } while (opsi.equalsIgnoreCase("y"));
    }

    public void memesan(Services<Foods, Integer> mix, Services<Foods, Integer> makanan , Services<Foods, Integer> minuman) {
        String opsi1, opsi;
        do {
            System.out.println("\nSilahkan Di Pilih");
            System.out.println("1. Makanan\n2. Minuman\n3. Paket");
            System.out.print("Memesan : ");
            opsi1 = scan.next();
            switch (opsi1) {
                case "1":
                ser.menuMakanan(makanan, "\n=== MAKANAN ===");
                inputOrder(makanan);
                    break;
                case "2":
                ser.menuMakanan(minuman, "\n=== MINUMAN ===");
                inputOrder(minuman);
                    break;
                case "3":
                ser.menuMakanan(mix, "\n=== PAKET ===");
                inputOrder(mix);
                    break;
            
                default:
                System.out.println("Pilihan tidak ada");
                    break;
            }
            System.out.print("Ingin memesan yang lain? y/n : ");
            opsi = scan.next();
        } while (opsi.equalsIgnoreCase("y"));
    }

    @Override
    public List<Order> findAll() {
        // TODO Auto-generated method stub
        return orders;
    }

    @Override
    public Order findById(Integer id) {
        // TODO Auto-generated method stub
        return orders.get(id-1);
    }

    @Override
    public void save(Order data) {
        // TODO Auto-generated method stub
        orders.add(data);
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        orders.remove(id-1);
    }
    
}
