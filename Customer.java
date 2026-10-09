public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccount = 0;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account acct) {
        if (numberOfAccount < 5) {
            accounts[numberOfAccount] = acct;
        } else {
            System.out.println("Batas maksimal akun!");
        }
    }

    public Account getAccount(int accounts_index) {
        return accounts[accounts_index];
    }

    public int getNumberOfAccounts() {
        return numberOfAccount;
    }
}
