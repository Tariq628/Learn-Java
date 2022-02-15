
//interface Shape{
//    public void sides();
//}
//class Square implements Shape{
//    public void sides(){
//        System.out.println("I have 4 siedes");
//    }
//}
//class Triangle1 implements Shape{
//    public void sides(){
//        System.out.println("I have 3 sides");
//    }
//}
//
//
//public class interfracess{
//    public static void main(String[] args) {
//        Square mysqr = new Square();
//        Triangle1 mytri = new Triangle1();
//        mysqr.sides();
//        mytri.sides();
//
//    }
//}


//Second code
//interface Mammals{
//    public void land();
//}
//interface SeaMammals{
//    public void water();
//}
//class Crocodile implements Mammals, SeaMammals{
//    public void land(){
//        System.out.println("I can live on land");
//    }
//    public void water(){
//        System.out.println("I can live in water");
//    }
//}
//class interfracess{
//    public static void main(String[] args) {
//        Crocodile myMammals = new Crocodile();
//        myMammals.land();
//        myMammals.water();
//    }
//}

class interfracess{
    public static void main(String[] args) {
        int [] marks = {22,33,445};
        for(int i = marks.length-1; i >=0;i--){
            System.out.println(marks[i]);
        }
    }
}