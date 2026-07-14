public class ftest {

    // Circle Area
    public static float max(float r) {
        return 3.14f * r * r;
    }

    // Rectangle Area
    public static int max(int length, int width) {
        return length * width;
    }

    // Square Area
    public static int max(int side) {
        return side * side;
    }

    public static void main(String[] args) {

        System.out.println("........................................");

        int square = max(5);
        System.out.println("The area of the square is " + square);

        System.out.println("........................................");

        int rectangle = max(5, 7);
        System.out.println("The area of the rectangle is " + rectangle);

        System.out.println("........................................");

        float circle = max(2.5f);
        System.out.println("The area of the circle is " + circle);
    }
}