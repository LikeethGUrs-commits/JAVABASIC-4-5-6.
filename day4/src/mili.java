public class mili extends Thread {

    @Override
    public void run() {

        for (int i = 0; i <= 9; i++) {

            System.out.println("theeeeeeeeeeeeeeeeeee");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}