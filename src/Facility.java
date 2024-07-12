import java.util.ArrayList;

public class Facility {
	
	private String address;
	private ArrayList<Pet> pets = new ArrayList<Pet>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private ArrayList<String> supplies = new ArrayList<String>();
	
	public Facility(String address) {
		this.address = address;
	}
	
	// getters and setters
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
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	public ArrayList<String> getSupplies() {
		return supplies;
	}
	public void setSupplies(ArrayList<String> supplies) {
		this.supplies = supplies;
	}
	
	
	// methods to add things to the ArrayList
	public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addSupply(String supply) {
        this.supplies.add(supply);
    }
    
    // method to remove an employee
    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }
	
    // method to print the supplies in the facility
    public void printSupplies() {
        System.out.println("Supplies currently in the facility:");
        for (String supply : supplies) {
            System.out.println(supply);
        }
    }
    
}
