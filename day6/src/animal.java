public class animal {

    void sounds() {
        System.out.println("the sounddddddddddd");
    }
}

class dogs extends animal {

    @Override
    void sounds() {
        System.out.println("the only sound");
    }
}

class msm {

    public static void main(String[] args) {

        animal t = new dogs();
        t.sounds();

    }
}