package lab1;
 class Invoice {
     String partNumber;
     String partDescription;
     int quantity;
     double pricePerItem;
     Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity=quantity;
        this.pricePerItem=pricePerItem;
    }
     void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
     String getPartNumber() {
        return partNumber;
    }
     void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
     String getPartDescription() {
        return partDescription;
    }
     void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }
     int getQuantity() {
        return quantity;
    }
     void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }
     double getPricePerItem() {
        return pricePerItem;
    }
     double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice obj = new Invoice("N123", "Car", 2, 199);
        System.out.println("Part Number: " + obj.getPartNumber());
        System.out.println("Part Description: " + obj.getPartDescription());
        System.out.println("Quantity: " + obj.getQuantity());
        System.out.println("Price per Item: Rs. " + obj.getPricePerItem());
        System.out.println("Invoice Amount: Rs. " + obj.getInvoiceAmount());
        obj.setQuantity(-3);
        obj.setPricePerItem(-5.99);
        System.out.println("\nUpdated Invoice Information:");
        System.out.println("Quantity: " + obj.getQuantity());
        System.out.println("Price per Item: Rs. " + obj.getPricePerItem());
        System.out.println("Invoice Amount: Rs. " + obj.getInvoiceAmount());
    }
}
