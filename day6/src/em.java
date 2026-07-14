
public class em  {
    void te() {
        System.out.println("the worker's work");
    }
}

class employ extends em {
    @Override
    void te() {
        System.out.println("the work of the employee is .");
        System.out.println("the work of the manger is .");
    }
}

class manger extends em {
    @Override
    void te() {
        System.out.println("the work of the manger is ");
    }
}

class tetser extends em{
    @Override
    void te() {
        System.out.println("the work of the tester is ");
    }
}


class mai {
    public static void main(String[] args) {

        em f;

        f = new employ();
        f.te();

        f = new manger();
        f.te();

        f = new tetser();
        f.te();
    }
}