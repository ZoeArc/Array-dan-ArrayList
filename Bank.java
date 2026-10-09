public class Bank {
    private Customer[] customers = new Customer[5];
    private int numberOfCustomers;

    public Bank() {
        numberOfCustomers = 0;
    }

    public void addCustomers(String f, String l) {
        if (numberOfCustomers < 5) {
            customers[numberOfCustomers++] = new Customer(f, l);
        } else {
            System.out.println("Bank sudah penuh");
        }
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }
}
