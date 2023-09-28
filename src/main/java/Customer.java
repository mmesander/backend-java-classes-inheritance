public class Customer {
    public String firstName;
    public String lastName;
    public int customerNumber;

    public Customer(String firstName, String lastName, int customerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void printName() {
        System.out.println("Customer " + firstName);
    }






}
