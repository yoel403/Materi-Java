import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userFirst, userLast, userPlace, userDate, userFav;
        System.err.println("Nomor 1");

        //Nomor 1
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

        // Nomor 2
        System.out.println("Nomor 2");
        int[] arrayAngka1 = {2,3,4,5};
        int[] arrayAngka2 = {1,3,5,7};
        printarray(arrayAngka1, "");
        printarray(arrayAngka2, "");
        same(arrayAngka1, arrayAngka2);
        System.out.println("\n");


        //Nomor 3
        System.out.println("Nomor 3");
        int[] arrayAngka3 = {3,2,4,1,5};
        printarray(arrayAngka3, "");
        sort(arrayAngka3);
        printarray(arrayAngka3, "Tersortir");

    }

    //Nomor 3
    public static void sort(int[] arrayData) {
        for (int i = 0; i < arrayData.length; i++) {
            for (int j = 0; j < arrayData.length-1; j++) {
                if(arrayData[j] > arrayData[j+1]){
                    int sort = arrayData[j];
                    arrayData[j] = arrayData[j+1];
                    arrayData[j+1]= sort;
                }
            }
        }
    }

    //Nomor 2
    public static void same(int[] arrayData1, int[] arrayData2) {
        for (int i = 0 ; i < arrayData1.length ; i++ ){
            for (int j = 0 ; j < arrayData2.length ; j++){
                if (arrayData1[i] == arrayData2[j]){
                    System.out.print(arrayData1[i] + ", ");
                }
            }
        }
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

    private static void printarray(int[] arraydata,String message){
        System.out.println(message + Arrays.toString(arraydata));
    }
}
