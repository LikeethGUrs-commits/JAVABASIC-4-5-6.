public class car {
    String brand;
    double price;

    car() {
        brand = "BMW";
        price = 1000000 ;
    }


    car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }


    public void display() {
        System.out.println(".................................");
        System.out.println("the brand of the car is : "+brand);
        System.out.println("the price of the car is : "+price);
        System.out.println(".....................................");
    }

    public static void main(String[] args) {

        car e1 = new car("benze", 500000.56);
        car e2 = new car("Suzuke", 6500062.45);
        car e3=new car();


        e1.display();
        System.out.println();
        e2.display();
        System.out.println();
        e3.display();
    }
}