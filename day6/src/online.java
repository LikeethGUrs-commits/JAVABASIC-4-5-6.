public class online {
    void discount() {
        System.out.println("General Discount: 5%");
    }
}

class electronics extends online {
    @Override
    void discount() {
        System.out.println("Amazon Discount: 20%");
    }
}

class furniturs extends online {
    @Override
    void discount() {
        System.out.println("Flipkart Discount: 15%");
    }
}
class cloths extends online {
    @Override
    void discount() {
        System.out.println("Flipkart Discount: 15%");
    }
}

    class mm {
        public static void main(String[] args) {
            online s;

            s = new electronics();
            s.discount();

            s = new furniturs();
            s.discount();

            s = new cloths();
            s.discount();
        }
    }
