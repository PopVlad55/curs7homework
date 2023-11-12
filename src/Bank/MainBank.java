package Bank;

public class MainBank {
    public static void main(String[] args) {
        Bank ing = new ING();
        Bank bt = new BT();
        Bank brd = new BRD();

        ing.deposit(500);
        bt.deposit(100);

        ing.withdraw(500);
        brd.withdraw(200);

        System.out.println("ING Balance:" + ing.getBalance());
        System.out.println("Bt Balance:" + bt.getBalance());
        System.out.println("BRD Balance:" + brd.getBalance());
    }
}
