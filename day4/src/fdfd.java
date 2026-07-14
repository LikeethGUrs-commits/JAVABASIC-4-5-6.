public class fdfd {
    public static void main(String[] args) {
        int a=8;
        int b=4;
        int f=a+b;
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        System.out.println("theeeeeeeeeeeeeeeee");
        System.out.println(f);
        t1.start();

    }
}
