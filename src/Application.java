import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	
	private ArrayList<Client> clients = new ArrayList<Client>();
	private ArrayList<Pet> pets = new ArrayList<Pet>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private ArrayList<Facility> facilities = new ArrayList<Facility>();
	
	public static void main(String[] args) {
		
		// Create our application
		Application app = new Application();
		
		// Instantiate our application with random data I made
		Client client1 = new Client("Ryan Razi", "123-456-7890", "123 House Dr.");
        Client client2 = new Client("John Cena", "403-777-5555", "456 WWE St.");
        
        Facility facility1 = new Facility("123 PetLand Ave.");
        Facility facility2 = new Facility("456 PetLand Bv.");
        
        facility1.addSupply("Cat treats");
        
        Medication medicine1 = new Medication("Insulin", "50mg", "Inject with needle via bottom");
        
        CareProfile careProfile1 = new CareProfile("Two baths daily, and lots of treats!");
        careProfile1.addMedication(medicine1);
        CareProfile careProfile2 = new CareProfile("Take on a walk");
        
        Pet pet1 = new Pet("Burger", "Cat", client1, facility1, false, careProfile1);
        Pet pet2 = new Pet("Fries", "Dog", client2, facility2, false, careProfile2);
        
        Employee employee1 = new Employee("Harold", facility1, "Caretaker");
        Employee employee2 = new Employee("Janice", facility2, "Janitor");
		
        app.addClient(client1);
        app.addClient(client2);
        app.addFacility(facility1);
        app.addFacility(facility2);
        app.addPet(pet1);
        app.addPet(pet2);
        app.addEmployee(employee1);
        app.addEmployee(employee2);
        
        // bring out the menu
        System.out.println("Welcome to PetLand Application!");
        app.menu();
	}
	
	
	
	// getters and setters
	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Facility> getFacilities() {
		return facilities;
	}

	public void setFacilities(ArrayList<Facility> facilities) {
		this.facilities = facilities;
	}
	
	
	
	
	 // methods to print everything in our ArrayLists
    public void printClients() {
        System.out.println("List of our Clients:");
        for (Client client : clients) {
            System.out.println(client.getName());
        }
    }

    public void printPets() {
        System.out.println("List of our Pets:");
        for (Pet pet : pets) {
            System.out.println(pet.getName());
        }
    }

    public void printEmployees() {
        System.out.println("List of our Employees:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public void printFacilities() {
        System.out.println("List of our Facilities:");
        for (Facility facility : facilities) {
            System.out.println(facility.getAddress());
        }
    }

    
    
    // methods to find individual elements from the ArrayLists
    
    public Client findClient(String name) {
        for (Client client : clients) {
            if (client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }

    public Pet findPet(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                return pet;
            }
        }
        return null;
    }

    public Employee findEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public Facility findFacility(String address) {
        for (Facility facility : facilities) {
            if (facility.getAddress().equals(address)) {
                return facility;
            }
        }
        return null;
    }
	
    
    // methods to add to the ArrayLists
    
    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addFacility(Facility facility) {
        this.facilities.add(facility);
    }
	
    
    
    // method for printing the menu 
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        
        // switch case to repeatedly print menu to do stuff until user wants to leave
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Modify client information");
            System.out.println("2. Modify pet information");
            System.out.println("3. Booking and reservations");
            System.out.println("4. Billing and payments");
            System.out.println("5. Add supply to facility");
            System.out.println("6. Print care profile");
            System.out.println("7. Manage employee information");
            System.out.println("8. Add client");
            System.out.println("9. Add employee");
            System.out.println("10. Report deceased pet");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            // switch statement to do the use cases
            switch (choice) {
                case 1:
                    modifyClientInformation();
                    break;
                case 2:
                    modifyPetInformation();
                    break;
                case 3:
                    bookingAndReservations();
                    break;
                case 4:
                    billingAndPayments();
                    break;
                case 5:
                	addSupplyToFacility();
                    break;
                case 6:
                    printCareProfile();
                    break;
                case 7:
                    manageEmployeeInformation();
                    break;
                case 8:
                    addClient();
                    break;
                case 9:
                    addEmployee();
                    break;
                case 10:
                    reportDeceasedPet();
                    break;
                case 0:
                    System.out.println("Have a great day!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
    
    // method to modify the clients information
    private void modifyClientInformation() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	// print clients and ask what they would like to modify about them
    	printClients();
        System.out.println("Which client would you like to modify?");
        String choice = scanner.nextLine();
        
        // check if client is in system or not
        if (findClient(choice) == null) {
        	System.out.println("Client is not in system.");
        	return;
        }
        
        System.out.println("What would you like to modify about them?");
        
        System.out.println("1. Address");
        System.out.println("2. Phone number");
        System.out.println("3. Add pet");
        System.out.print("Enter your choice: ");
        int choice2 = scanner.nextInt();
        scanner.nextLine();
        
        // another case statement to modify what the user wants
        switch (choice2) {
            case 1:
                System.out.println("Enter new address:");
                String address = scanner.nextLine();
                findClient(choice).setAddress(address);
                System.out.println("Address updated successfully.");
                break;
            case 2:
                System.out.println("Enter new phone number:");
                String phoneNumber = scanner.nextLine();
                findClient(choice).setPhoneNumber(phoneNumber);
                System.out.println("Phone number updated successfully.");
                break;
            case 3:
                System.out.print("Name of pet: ");
                String name = scanner.nextLine();
                System.out.print("Species: ");
                String species = scanner.nextLine();
                
                System.out.print("Which facility would you like your pet to stay at? ");
                printFacilities();
                String facility = scanner.nextLine();
                
                if (findFacility(facility) == null) {
                	System.out.println("Facility does not exist.");
                	return;
                } 
                
                System.out.print("Care Information: ");
                String careInfo = scanner.nextLine();
                
                CareProfile careProfile = new CareProfile(careInfo);
                
                // loop until user does not want to add any more medicine to the pet
              
                int loop = 0;
                
                System.out.print("Does the pet have any medications? (Y for yes, anything else for no)");
                String question = scanner.nextLine();
                if (question.equals("Y")) {
                	loop = 1;
                }
                
                while (loop == 1) {
                    System.out.print("Name of medication: ");
                    String medicineName = scanner.nextLine();
                    System.out.print("Dosage: ");
                    String dosage = scanner.nextLine();
                    System.out.print("Instructions: ");
                    String instructions = scanner.nextLine();

                    Medication medication = new Medication(medicineName, dosage, instructions);
                    careProfile.addMedication(medication);

                    System.out.print("Do you want to add another medication? (Y for yes, anything else for no): ");
                    String response = scanner.nextLine();
                    if (!response.equals("Y")) {
                    	loop = 0;
                    }
                }
                
                // create pet and it auto adds to the client because of constructor
                Pet newPet = new Pet(name, species, findClient(choice), findFacility(facility), false, careProfile);
                // add it to our overall system
                pets.add(newPet); 
                System.out.println("New pet added successfully.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        
    }
    
    // method to modify the information of the pet
    private void modifyPetInformation() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	// print all the pets and ask the user which they would like to get the care profile for
    	printPets();
        System.out.println("Which pet would you like to modify?");
        String choice = scanner.next();
        
        // check if the pet is in the system
        if (findPet(choice) == null) {
        	System.out.println("Pet is not in system.");
        	return;
        }
        
        // case statement to modify pet information
        System.out.println("What would you like to modify?");
        System.out.println("1. Modify care profile instructions");
        System.out.println("2. Add medication");
        System.out.println("3. Remove medication");
        System.out.print("Enter your choice: ");
        int choice2 = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (choice2) {
            case 1:
                System.out.println("Enter care instructions:");
                String careInstructions = scanner.nextLine();
                findPet(choice).getCareProfile().setCareInstructions(careInstructions);
                System.out.println("Care instructions updated successfully.");
                break;
            case 2:
                System.out.print("Name of medication: ");
                String name = scanner.nextLine();
                System.out.print("Dosage: ");
                String dosage = scanner.nextLine();
                System.out.print("Instructions: ");
                String instructions = scanner.nextLine();
                Medication medication = new Medication(name, dosage, instructions);
                findPet(choice).getCareProfile().addMedication(medication);
                System.out.println("Medication added successfully.");
                break;
            case 3:
            	
            	// gets the medicine of the pet that we want to remove and makes sure it exists
            	findPet(choice).getCareProfile().printMedications();
                System.out.println("Enter the name of the medication to remove:");
                String medicineName = scanner.nextLine();
                
                if (findPet(choice).getCareProfile().getMedication(medicineName) == null) {
                	System.out.println("Medication of that name does not exist");
                	return;
                }
                
                // removes the medication from the pet
                findPet(choice).getCareProfile().removeMedication(findPet(choice).getCareProfile().getMedication(medicineName));
                System.out.println("Medication removed successfully.");
                
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
    	
    }
    
    // method to make a booking for a client
    private void bookingAndReservations() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	// print the clients to book a reservation for
    	printClients();
        System.out.println("Which client would you book a reservation for?");
        String choice = scanner.nextLine();
        
        // check if client is in system or not
        if (findClient(choice) == null) {
        	System.out.println("Client is not in system.");
        	return;
        }
        
        // print the clients pets
        findClient(choice).printPets();
        
        // get the name of the pet we are booking for and making sure if they exist or not
        System.out.println("Which pet are you booking for?.");
        String petName = scanner.nextLine();
        
        if (findClient(choice).getPet(petName) == null) {
        	System.out.println("Client does not own a pet named that. ");
        	return;
        }
        
        System.out.println("Enter check-in date: ");
        String checkIn = scanner.nextLine();

        System.out.println("Enter check-out date: ");
        String checkOut = scanner.nextLine();

        System.out.println("Enter total cost of the appointment: ");
        double price = scanner.nextDouble();

        System.out.println("Enter amount paid so far: ");
        double amountPaid = scanner.nextDouble();
        
        // create the booking for the client
        Booking booking = new Booking(findClient(choice).getPet(petName), checkIn, checkOut, price, amountPaid);
        
        findClient(choice).addBooking(booking);
        
        System.out.println("Booking successfully created!");
        
    }
    
    // method for checking the billings of clients
    private void billingAndPayments() {
    	Scanner scanner = new Scanner(System.in);
    	
    	// print the clients to look at their bills
    	printClients();
        System.out.println("Which client would you like to see their bill?");
        String choice = scanner.nextLine();
        
        // check if client is in system or not
        if (findClient(choice) == null) {
        	System.out.println("Client is not in system.");
        	return;
        }
        
        // print the clients bookings
        findClient(choice).printBookings();
        
        // get the date of the billing so we can see if it exists or not
        System.out.println("What is the start date of the booking for the bill you want to see");
        String startDate = scanner.nextLine();
        
        if (findClient(choice).getBilling(startDate) == null) {
        	System.out.println("Booking for this date does not exist");
        	return;
        }
        
        // print the billing details
        findClient(choice).getBilling(startDate).printBillingDetails();
        
        // see if client has paid bill or not, and then if not ask to add payment
        if (findClient(choice).getBilling(startDate).isPaid() == true) {
        	System.out.println("This bill is paid already.");
        } else {
        	System.out.println("This bill is not paid, would you like to add a payment to it? (Y for yes, anything else for no)");
        	String choice2 = scanner.nextLine();
        	
        	if (choice2.equals("Y")) {
        		System.out.println("How much are you adding to the payment?");
        		double money = scanner.nextDouble();
        		findClient(choice).getBilling(startDate).addPayment(money);
        		System.out.println("Money added to payment.");
        	}
        }
        
        return;
        
    }
    
    
    // method to add supply to a facility
    private void addSupplyToFacility() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	// select a facility to add a supply to, making sure it exists
    	printFacilities();
        System.out.println("Which facility would you like to modify?");
        String choice = scanner.nextLine();
        

        if (findFacility(choice) == null) {
        	System.out.println("Facility does not exist.");
        	return;
        }
        
        findFacility(choice).printSupplies();
        // add the supply to the facility
        System.out.println("Please enter the supply you would like to add:");
        String supply = scanner.nextLine();
        
        findFacility(choice).addSupply(supply);
        System.out.println("Supply added");
        
    }
    
    // method to print the Care Profile of a pet
    private void printCareProfile() {
    	Scanner scanner = new Scanner(System.in);
    	
    	// print all the pets and ask the user which they would like the care profile for
    	printPets();
        System.out.println("Which pet would you like to get the Care Profile for?");
        String choice = scanner.next();
        
        // check if the pet is in the system
        if (findPet(choice) == null) {
        	System.out.println("Pet is not in system.");
        	return;
        }
        
        // print the details of the pets care profile
        findPet(choice).getCareProfile().printDetails();
        
    }
    
    // method for managing the information of the employee
    private void manageEmployeeInformation() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	// print all employees and ask what information you'd like to modify
    	printEmployees();
        System.out.println("Which employee information would you like to modify");
        String employee = scanner.next();
        
        // check if the employee is in the system
        if (findEmployee(employee) == null) {
        	System.out.println("Employee is not in system.");
        	return;
        }
        
        // case statement to ask user what they want to modify about the employee
        System.out.println("Employees current location: " + findEmployee(employee).getLocation().getAddress());
        System.out.println("What would you like to modify about them?");
        System.out.println("1. Change facility location");
        System.out.println("2. Change role");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
            	// check if the new facility is real or not
            	printFacilities();
                System.out.println("Enter new facility address:");
                String address = scanner.nextLine();
                
                if (findFacility(address) == null) {
                	System.out.println("Facility does not exist.");
                	return;
                }
                
                // remove employee from previous location
                findEmployee(employee).getLocation().removeEmployee(findEmployee(employee));
                
                // set employee location to new place
                findEmployee(employee).setLocation(findFacility(address));
                // add employee to facilities list of employees 
                findFacility(address).addEmployee(findEmployee(employee));
                System.out.println("Employee location updated successfully.");
                break;

            case 2:
                System.out.println("Enter new role for employee:");
                String role = scanner.nextLine();
                findEmployee(employee).setRole(role);
                System.out.println("Employee role updated successfully.");
                break;
                
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    // method to add client
    private void addClient() {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter client's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter client's phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter client's address: ");
        String address = scanner.nextLine();
        
        // add client to system
        Client client = new Client(name, phoneNumber, address);
        
        clients.add(client);
        System.out.println("Client added!");
    }
    
    // method to add employee
    private void addEmployee() {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("What is the name of this employee?");
    	String name = scanner.nextLine();
    	
    	// make sure the facility the employee works at exists
    	printFacilities();
    	System.out.println("Which location do they work at?");
    	String location = scanner.nextLine();
    	
    	if (findFacility(location) == null) {
        	System.out.println("Facility does not exist.");
        	return;
        } 
    	
    	System.out.println("What is the role of this employee?");
    	String role = scanner.nextLine();
    	
    	// add employee to system
    	Employee employee = new Employee(name, findFacility(location), role);
    	employees.add(employee);
    	
    	System.out.println("Employee added!");
    }
    
    // method to report a deceased pet
    private void reportDeceasedPet() {
    	Scanner scanner = new Scanner(System.in);
    	
    	// print out the list of pets and ask user which one has passed away
    	printPets();
        System.out.println("Which pet has passed away?");
        String choice = scanner.next();
        
        // checks if pet is in system or not
        if (findPet(choice) == null) {
        	System.out.println("Pet is not in system.");
        	return;
        }
        
        // set the pet to deceased
        findPet(choice).setDeceased(true);
        
        System.out.println("Pet is now set as deceased");
        
    }
    
}
