import java.util.Scanner;

public class square {
    public static float max(float a, float b,float c ){
        return a+b+c;
    }

    public static int max(int a, int b){
        return (a<b)?b:a;

    }
    public static int max(int a, int b,int c ){
        return a+b+c;
    }
    public static int square(int num) {
        return num * num;
    }

    public static void OE(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(".......................................");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = square(num);
        System.out.println("........................................");
        System.out.println("Square = " + result);
        System.out.println("........................................");
         OE(num);
        System.out.println("........................................");
        int ree =max(25,27);
        System.out.println("the maximum value from these two are "+ree);
        System.out.println("........................................");
        int xx =max(25,27,1);
        System.out.println("the maximum value from these two are "+xx);
        System.out.println("........................................");
        float xxw = max(25.4f,27.2f,1.4f);
        System.out.println("the maximum value from these two are "+xxw);









    }
}