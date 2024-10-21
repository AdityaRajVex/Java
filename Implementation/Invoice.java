package C.Implementation;

public class Invoice implements Payable {
    private final String partNumber;
    private final double pricePerUnit;
    private final int quantity;
    
    //constructor
    public Invoice(String partNumber, double pricePerUnit, int quantity) {
        this.partNumber = partNumber;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public String getPartNumber() {
        return partNumber;
    }
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
    @Override
    public double getPaymentAmount(){
        return this.pricePerUnit * this.quantity;
    }

    @Override
    public String toString() {
        return "";
    }
}
