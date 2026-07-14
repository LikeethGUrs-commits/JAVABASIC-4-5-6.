abstract public class banka {
    abstract void ban();
    ;

    void nic() {

        System.out.println("the name of the bank is : ");
        System.out.println("the rate of in terst of this bank is : ");


    }
}

class sBi extends banka{
    @Override
    void ban() {
        System.out.println("the name of the bank is : SBI");
        System.out.println("the rate of in terst of this bank is : 12%");

    }
}

 class hdf extends banka{
    @Override
    void ban() {
        System.out.println("the name of the bank is : hdfc");
        System.out.println("the rate of in terst of this bank is : 16%");

    }
}

 class  tttt{
    public static void main(String[] args) {
        hdf on =new hdf();
        on.ban();
        sBi is =new sBi();
        is.ban();


    }
}
