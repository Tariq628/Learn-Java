
abstract class Animal{
    abstract void Sound();
    public void eat(){
        System.out.println("I am eating");
    }
}
class Cat extends Animal{
    void Sound(){

    }

}
class Dog extends Animal{
    void Sound(){
        System.out.println("Woof");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        myCat.Sound();
        myDog.Sound();
    }
}
