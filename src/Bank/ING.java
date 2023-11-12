package Bank;

class ING implements Bank {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("ING:deposited" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("ING:Got" + amount);
        } else {
            System.out.println("ING:Not enough balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
