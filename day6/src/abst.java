abstract class Abst {

    int a = 12;
    int b = 5;

    abstract void area();
    abstract void parameter();
}

class Rectangle extends Abst {

    @Override
    void area() {
        int theArea = a * b;
        System.out.println("Area = " + theArea);
    }

    @Override
    void parameter() {
        int thePerimeter = 2 * (a + b);
        System.out.println("Perimeter = " + thePerimeter);
    }
}
 class ttt {

    public static void main(String[] args) {

        Rectangle obj = new Rectangle();

        obj.area();
        obj.parameter();

    }
}