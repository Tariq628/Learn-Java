
import java.util.Scanner;
class Search{
    public int binarySearch(int []arr, int search, int low, int high){
        while (low <= high){
            int median = low+ (high-low)/2;
            if(arr[median] == search){
                return median;
            }
            else if (search > arr[median]){
                low = median + 1;
            }
            else {
                high = median - 1;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the search: ");
        int searchNumber = sc.nextInt();
        int [] arr = {1,2,3,4,5,6,7,8,9,22,33};
        int high = arr.length;
        Search search = new Search();
        int result = search.binarySearch(arr, searchNumber, 0, high-1);
        if (result != -1){
            System.out.println("Element is prrsent at "+ result);
        }
        else {
            System.out.println("Not found");
        }

    }
}
