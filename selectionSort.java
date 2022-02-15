

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int initial;
        for (int i = 0; i < arr.length - 1; i++) {
            initial = i;
            for (int j = i+1; j < (arr.length); j++) {
                if(arr[j] < arr[initial]){
                    initial =j;
                }}
                int smallerNumber = arr[initial];
                arr[initial] = arr[i];
                arr[i] =  smallerNumber;


        }
        for (int i=0; i< arr.length;i++){
            System.out.printf(arr[i] + " ");
        }
    }
}
