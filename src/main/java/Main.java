public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Mark", "Mesander", new MasterCard(100));
        Customer customer2 = new Customer("Emeraude", "Mesander", new VisaCard(100));

        customer.printName();
        customer2.printName();

        customer.getCreditCard().pay(10);
        customer2.getCreditCard().pay(10);
        System.out.println(customer.getCreditCard().getDebt());
        System.out.println(customer2.getCreditCard().getDebt());
    }
}
