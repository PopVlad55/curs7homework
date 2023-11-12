package Bank;

class BT implements Bank {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("BT:deposited" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("BT:Got" + amount);
        } else {
            System.out.println("BT:Not enough balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
