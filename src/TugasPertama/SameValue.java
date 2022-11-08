package TugasPertama;
public class SameValue {
    public static void main(String[] args) throws Exception {
        // Nomor 2
        System.out.println("Nomor 2");
        int[] arrayAngka1 = {2,3,4,5};
        int[] arrayAngka2 = {1,3,5,7};
        App.printarray(arrayAngka1, "");
        App.printarray(arrayAngka2, "");
        same(arrayAngka1, arrayAngka2);
        System.out.println("\n");
    }
    
    //Nomor 2
    public static void same(int[] arrayData1, int[] arrayData2) {
        for (int i = 0 ; i < arrayData1.length ; i++ ){
            for (int j = 0 ; j < arrayData2.length ; j++){
                if (arrayData1[i] == arrayData2[j]){
                    System.out.print("[");
                    System.out.print(arrayData1[i]);
                    System.out.print("]");
                }
            }
        }
    }
}
