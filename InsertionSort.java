
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {12, 11, 13, 5, 6};
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        for (int item:
             arr) {
            System.out.printf(item + " ");
        };
    }
}
