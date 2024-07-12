
public class Billing {

	private double price;
	private double amountPaid;
	private boolean paid;
	
	public Billing(double price, double amountPaid) {
		this.price = price;
		this.amountPaid = amountPaid;
		
		// if amount paid is more than or equal to price consider it paid
		if (amountPaid >= price) {
			this.paid = true;
		} else {
			this.paid = false;
		}
		
	}
	
	// getters and setters
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
	// method for printing the details of the billing
	public void printBillingDetails() {
        System.out.println("Billing Details:");
        System.out.println("Price: $" + price);
        System.out.println("Amount Paid: $" + amountPaid);
    }
	
	// method for adding payment
	public void addPayment(double paymentAmount) {
        this.amountPaid += paymentAmount;
        
        // if amount paid is more than or equal to price consider it paid
        if (this.amountPaid >= this.price) {
            this.paid = true; 
        }
    }
	
}
