package TugasPertama;

public class Sort {
    public static void main(String[] args) throws Exception {
         //Nomor 3
         System.out.println("Nomor 3");
         int[] arrayAngka3 = {3,2,4,1,5};
         App.printarray(arrayAngka3, "");
         sort(arrayAngka3);
         App.printarray(arrayAngka3, "Tersortir");
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
}
