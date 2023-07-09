public class BankAccount {
    protected int id;
    private double balance = 0;
    private static double interestRate = 0.15;
    private static int count = 0;

    public BankAccount() {
        this.id = ++count;
    }

    public static void setInterestRate(double rate){
        BankAccount.interestRate = rate;
    }

    public void deposit(double x) {
        this.balance += x;
    }

    public double calcInterest(int months) {
        return this.balance * BankAccount.interestRate * months / 12;
    }

    @Override
    public String toString() {
        return "BankAccount" +
                "id = " + id +
                ", balance = " + balance;
    }
}
