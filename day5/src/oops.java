public class oops   {
    String color;
    int speed;
    void start(){
        System.out.println("the caris start ............. ");
    }
    void stop(){
        System.out.println("the car is at stop............ ");
    }

    public static void main(String[] args) {
        oops mycar = new oops();
        mycar.color="black";
        mycar.speed=1120;
        mycar.start();
        mycar.stop();
        System.out.println("color of this car is : "+mycar.color);
        System.out.println("speed of this car is : "+mycar.speed+"KM/p/hr");
        System.out.println("the car is at");
    }



}
