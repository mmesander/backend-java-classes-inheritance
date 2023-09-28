public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Mark", "Mesander", 1);
        Customer customer2 = new Customer("Emeraude", "Mesander");

        customer.printName();
        customer2.printName();
    }
}
