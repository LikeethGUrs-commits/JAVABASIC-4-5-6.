import java.sql.SQLOutput;

abstract class radio {
    abstract void areaq();
    abstract void parameterq();
}

class radi extends radio {

    @Override
    void areaq() {
        System.out.println();

        System.out.println("the radoio iis off");
        System.out.println("the radoio iis on");

        System.out.println();
        System.out.println(".............................");
        System.out.println();
    }

    @Override
    void parameterq() {

        System.out.println("the tv is on ");
        System.out.println("the tv is off ");
    }
}
class tttq {

    public static void main(String[] args) {

        radi obj = new radi();

        obj.areaq();
        obj.parameterq();

    }
}