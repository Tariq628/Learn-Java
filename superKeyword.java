

//import java.awt.geom.Dimension2D;

class Add{
    public int sum(int a, int b, int c){
        return a + b + c;
    }
}
class Multiple extends Add{
    public int multiply(){
        return super.sum(4,4,4)*4;
    }
}
class Divide extends Multiple{
    public int divide(){
        return super.multiply()/4;
    }
}


public class Main4 {
    public static void main(String[] args) {
        Multiple multiple = new Multiple();
        System.out.println(multiple.multiply());
        Divide div = new Divide();
        System.out.println(div.divide());
    }}