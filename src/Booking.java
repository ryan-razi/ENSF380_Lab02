
public class Booking {
	
	private Pet pet;
	private String checkIn;
	private String checkOut;
	private Billing billing;
	
	
	public Booking(Pet pet, String checkIn, String checkOut, double price, double amountPaid) {
		this.pet = pet;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.billing = new Billing(price, amountPaid);
	}
	
	// getters and setters
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	
}
