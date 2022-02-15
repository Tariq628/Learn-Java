
class C{
    int value = 10;
    int value1 = 101;
    public void tariq(){
        System.out.println("I am tariq");
    }
    public void umair(){
        System.out.println("ok");
    }
}
class D extends C{
    int value = 100;
    int value1 = 102;
    public void tariq(){
        System.out.println("I am umair");
    }
}
public class upcasting {
    public static void main(String[] args) {
        C obj = new D();
        System.out.println(obj.value);
        obj.tariq();
        obj.umair();
        System.out.println(obj.value);
        System.out.println(obj.value1);

    }
}
//We can run only overridden methods in child class
//we can run parent method methods also
