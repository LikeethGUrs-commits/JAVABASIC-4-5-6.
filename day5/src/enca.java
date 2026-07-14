public class enca {
    private int balance=1000;
    public void deposite(int amount){
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        enca acc=new enca();
        acc.deposite(5000);
        System.out.println(acc.getBalance());
    }
}
