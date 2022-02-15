
class myArray{
    int [][] myArr;
    myArray(int [][] myArr){
        this.myArr = myArr;
    }
    public void printArray(){
        for(int i=0; i<myArr.length; i++){
            for(int j=0; j < myArr.length; j++){
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public void setPrintArray(){
//        int middle = (int)(myArr.length-1)/2;
        int [] middleRow = new int [myArr.length];
        int [] middleCol = new int [myArr.length];
        int sumOfMiddleRow = 0;
        int sumOfMiddleCol = 0;
        int middle = (int) Math.ceil(myArr.length/2);
        for(int i = 0; i < myArr.length; i ++ ){
            middleRow[i] = myArr[middle][i];
            middleCol[i] = myArr[i][middle];
            sumOfMiddleRow += myArr[middle][i];
            sumOfMiddleCol += myArr[i][middle];
        }
        System.out.println("Middle Row: ");
        for(int item: middleRow){
            System.out.print(item + " ");
        }
        System.out.println("");
        System.out.println("Middle Column: ");
        for(int item: middleCol){
            System.out.print(item + " ");
        }
        System.out.println("");
        System.out.println("Sum of Middle Row");
        System.out.println(sumOfMiddleRow);
        System.out.println("Sum of Middle Column");
        System.out.println(sumOfMiddleCol);
    }
}
public class sumOfRowsColumns{
    public static void main(String[] args) {
        int [][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        myArray myarray = new myArray(arr);
        myarray.printArray();
        myarray.setPrintArray();
    }
}
