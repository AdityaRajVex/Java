package H.Customer_Info;

public class CreditCard {
    // attributes
    private String cardType;
    private String cardNumber;
    private Date expiryDate;
    private double creditLimit;
    private double initialBalance; // Now used as current balance

    //constructor
    public CreditCard(String cardType, String cardNumber, double creditLimit, double initialBalance) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.initialBalance = initialBalance;
    }


    // Setters and Getters
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int month, int day, int year) {
        this.expiryDate = new Date(month, day, year);
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    // calculation for limit check
    public boolean isOverLimit() {
        return initialBalance > creditLimit;
    }
}
