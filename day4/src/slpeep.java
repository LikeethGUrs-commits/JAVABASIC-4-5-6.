public class slpeep extends Thread {

    public void run() {

        for (int i = 0; i <= 9; i++) {

            System.out.println("theyyyyyyyyyyyyyyy");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}