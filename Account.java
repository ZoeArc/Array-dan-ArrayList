import java.util.ArrayList;

public class Account {
    protected double balance;
    private ArrayList<String> history;

    public Account(double bal) {
        balance = bal;
        history = new ArrayList<>();
        history.add("Akun dibuat dengan saldo awal : Rp" + bal);
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            history.add("Setor tunai (Deposit) = Rp" + amount);
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            history.add("Tarik tunai sebesar : Rp" + amount);
            return true;
        } else {
            history.add("Gagal tarik tunai (Saldo tidak cukup): Rp" + amount);
            return false;
        }
    }

    public void printHistory() {
        System.out.println("----Riwayat Transaksi----");

        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + "." + history.get(i));
        }
        System.out.println("------------------");
    }
}