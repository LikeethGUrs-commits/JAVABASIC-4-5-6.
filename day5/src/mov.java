public class mov{

    public static void main(String[] args) {

        mobile mynew3 = new mobile();
        mobile mynew5 = new mobile();

        mynew3.title= "I...T";
        mynew3.goner = "horror";
        mynew3.rating= 8.4f;

        mynew5.title = "Heraperi";
        mynew5.goner = "comedy";
        mynew5.rating= 8.45f;

        System.out.println(".................................");

        System.out.println("the barnd new movie ");
        System.out.println("-------------------");
        mynew3.displayDetails1();
        System.out.println("..................................");

        System.out.println("the barnd new movie ");
        System.out.println("-------------------");
        mynew5.displayDetails1();
    }
}