public class Main {
    public static void main(String[] args) {
        Bank bankPbo = new Bank();

        bankPbo.addCustomers("Alfian", "Maulana");
        Customer nasabah1 = bankPbo.getCustomer(0);

        Account akunUtama = new Account(1000000);
        nasabah1.setAccount(akunUtama);

        System.out.println("Nasabah: " + nasabah1.getFirstName() + " " + nasabah1.getLastName());

        nasabah1.getAccount(0).withdraw(200000);
        nasabah1.getAccount(0).deposit(500000);
        nasabah1.getAccount(0).withdraw(3000000);
        nasabah1.getAccount(0).withdraw(100000);

        System.out.println("\nMenampilkan histori transaksi nasabah...");
        nasabah1.getAccount(0).printHistory();

        System.out.println("Saldo Akhir: Rp" + nasabah1.getAccount(0).getBalance());
    }
}
