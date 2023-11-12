package Bank;

class BRD implements Bank {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("BRD:deposited" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("BRD:Got" + amount);
        } else {
            System.out.println("BRD:Not enough balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
