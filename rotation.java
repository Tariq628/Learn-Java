


class Rotate{
    public void rotate(int [] num,int n){
        for(int j=0;j<n;j++){
            int first=num[0];
            for(int i=0;i<n;i++){
                num[i]=num[(i+1)];
            }
            num[num.length-1]=first;

            for(int val:num){
                System.out.print(val);
            }
            System.out.println("");
        }
    }
}

public class rotation {
    public static void main(String[] args) {
        int [] myArr={1,2,3,4,5};
        int no_of_rotations=4;
        Rotate rotate = new Rotate();
        rotate.rotate(myArr, no_of_rotations);
    }
}
