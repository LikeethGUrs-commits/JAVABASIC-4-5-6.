public class bankcall {
    public static void main(String[] args) {

        bank b;

        b = new sbi();
        b.intrestrate();

        b = new hdfc();
        b.intrestrate();

        b = new icci();
        b.intrestrate();

    }
}
