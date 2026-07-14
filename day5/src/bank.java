public class bank {
    private int balance=0;
    public void setBalance(int amount) {
        if (amount == 0) {
            System.out.println("the balance in invalid");
        } else {
            balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }

}
/////constructor///////////
