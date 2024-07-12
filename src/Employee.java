
public class Employee {
	
	private String name;
	private Facility location;
	private String role;
	
	public Employee(String name, Facility location, String role) {
		this.name = name;
		this.location = location;
		this.role = role;
		location.addEmployee(this);
	}
	
	// setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Facility getLocation() {
		return location;
	}
	public void setLocation(Facility location) {
		this.location = location;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
