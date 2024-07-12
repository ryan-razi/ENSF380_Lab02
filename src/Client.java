import java.util.ArrayList;

public class Client {
	
    private String name;
    private String phoneNumber;
    private String address;
    private ArrayList<Pet> pets = new ArrayList<Pet>();
    private ArrayList<Booking> bookings = new ArrayList<Booking>();

    public Client(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    // getters and setters
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}

	public ArrayList<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(ArrayList<Booking> bookings) {
		this.bookings = bookings;
	}

	
	// method to add pet
	public void addPet(Pet pet) {
        this.pets.add(pet);
    }
	
	// method to add booking
    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }
    
    // method to print pets of the client
    public void printPets() {

		System.out.println("Clients Pets:");
		for (Pet pet : pets) {
			System.out.println("Name: " + pet.getName());
		}
        
    }
    
    // method to get the pet by its name
    public Pet getPet(String petName) {
        for (Pet pet : pets) {
            if (pet.getName().equals(petName)) {
                return pet;
            }
        }
        return null; 
    }
    
    // method to print all the bookings of the client
    public void printBookings() {
    	System.out.println("Bookings for Client:");
        for (Booking booking : bookings) {
            System.out.println("Pet: " + booking.getPet().getName());
            System.out.println("Check-in Date: " + booking.getCheckIn());
            System.out.println("Check-out Date: " + booking.getCheckOut());
            booking.getBilling().printBillingDetails(); 
            System.out.println("");
        }
    }
    
    // method to get the billing based on the start date
    public Billing getBilling(String startDate) {
        for (Booking booking : bookings) {
            if (booking.getCheckIn().equals(startDate)) {
                return booking.getBilling();
            }
        }
        return null; 
    }
    
}
