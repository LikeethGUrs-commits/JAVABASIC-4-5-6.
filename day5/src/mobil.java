public class mobil{

public static void main(String[] args) {

    mobile mynew3 = new mobile();
    mobile mynew5 = new mobile();

    mynew3.modele= "Pine=APPLE";
    mynew3.stroge = "120GB";
    mynew3.price = 88000;

    mynew5.modele = "AiAi-yapooo";
    mynew5.stroge = "180GB";
    mynew5.price = 85000;

    System.out.println(".................................");

    System.out.println("the barnd new phone ");
    System.out.println("-------------------");
    mynew3.displayDetails2();
    System.out.println("..................................");

    System.out.println("the barnd new phone ");
    System.out.println("-------------------");
    mynew5.displayDetails2();
}
}