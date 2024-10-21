package H.Customer_Info;


public class Customer {
    private int customerNumber; // attributes
    private String firstName;
    private String lastName;
    private CreditCard creditCard;

    //constructor
    public Customer(int customerNumber, String firstName, String lastName, CreditCard creditCard) {
        this.customerNumber = customerNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }

    //Setters and Getters
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
