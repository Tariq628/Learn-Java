//Tariq
//EB20102138



import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6};
        int [] newarr  = new int [arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newarr[4-i] = arr[i];

        }
        System.out.println(Arrays.toString(newarr));
    }
}
