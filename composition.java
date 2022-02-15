
class CarEngine{
    public void startEngine(){
        System.out.println("Engine has started");
    }
    public void stopEngine(){
        System.out.println("Engine has stopped");
    }
}
class Car{
    private String color;
    private int model;
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setModel(int model){
        this.model = model;
    }
    public int getModel(){
        return this.model;
    }
}
class BMW extends Car{
    public void BMWEngine(){
        CarEngine bmwcar = new CarEngine();
        bmwcar.startEngine();
        bmwcar.startEngine();
    }
}

public class composition {
    public static void main(String[] args) {
        BMW myCar = new BMW();
        myCar.setColor("Black");
        myCar.setModel(44);
        System.out.println(myCar.getColor());
        System.out.println(myCar.getModel());
        myCar.BMWEngine();
    }
}
