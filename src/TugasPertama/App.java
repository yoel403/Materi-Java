package TugasPertama;
import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String userFirst, userLast, userPlace, userDate, userFav;
        //Nomor 1
        System.err.println("Nomor 1");
        System.out.print("masukan nama depan : " );
        userFirst = scanner.nextLine();
        System.out.print("masukan nama belakang : " );
        userLast = scanner.nextLine();
        System.out.print("Masukan tempat lahir : ");
        userPlace = scanner.nextLine();
        System.out.print("Masukan tanggal Lahir : ");
        userDate = scanner.nextLine();
        System.out.print("Masukan FavProLang : ");
        userFav = scanner.nextLine();
        System.out.println("\n");
        Perkenalan(userFirst, userLast, userPlace, userDate, userFav);
        System.out.println();

    }

    //Nomor 1
    public static void Perkenalan(String firstName, String lastName, String birthPlace , String birthDate, String FavProLang) {
        System.out.println("Halo Nama Saya " + firstName + " " +lastName + " saya lahir di  " + birthPlace + " pada tanggal " + birthDate + " dan saya menyukai " + FavProLang);
        System.out.println("Nama depan : " + firstName);
        System.out.println("Nama belakang : " + lastName);
        System.out.println("Tempat Lahir : " + birthPlace);
        System.out.println("Tanggal Lahir : " + birthDate);
        System.out.println("Bahasa Pemrograman Fav : " + FavProLang);
    }

    public static void printarray(int[] arraydata,String message){
        System.out.println(message + Arrays.toString(arraydata));
    }
}
