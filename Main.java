

class Fruit
{
   private double fprice;
   private String fname;
   //constructor to initialize roll number and name of the student
   Fruit(double fPrice, String fName)
   {
       this.fprice = fPrice;
       this.fname = fName;
   }
   //creating a copy constructor
   Fruit(Fruit fruit)
   {
       System.out.println("\nAfter invoking the Copy Constructor:\n");
       fprice = fruit.fprice;
       fname = fruit.fname;
   }
   //creating a method that returns the price of the fruit
   double showPrice()
   {
       return fprice;
   }
   //creating a method that returns the name of the fruit
   String showName()
   {
       return fname;
   }}

   class Main{
   public static void main(String args[])
   {
       Fruit f1 = new Fruit(399, "Ruby Roman Grapes");
       System.out.println("Name of the first fruit: "+ f1.showName());
       System.out.println("Price of the first fruit: "+ f1.showPrice());
//passing the parameters to the copy constructor
       Fruit f2 = new Fruit(f1);
       System.out.println("Name of the second fruit: "+ f2.showName());
       System.out.println("Price of the second fruit: "+ f2.showPrice());
   }
}






// class Fruit{
//    public String fName;
//    public int fPrice;
//    public Fruit(String fName, int fPrice){
//        this.fName = fName;
//        this.fPrice = fPrice;
//    }
//    public Fruit(Fruit fruit){
//        fName = fruit.fName;
//        fPrice = fruit.fPrice;
//    }
//    public int showPrice(){
//        return fPrice;
//    }
//    public String showFruit(){
//        return fName;
//    }
// }

// class Main{
//    public static void main(String[] args) {
//        Fruit f1 = new Fruit("Apple", 100);
//        System.out.println(f1.showFruit());
//        System.out.println(f1.showPrice());
//        Fruit f2 = new Fruit(f1);
//        System.out.println(f2.showFruit());
//        System.out.println(f2.showPrice());
//    }
// }
