
public class Medication {
	
	private String name;
	private String dosage;
	private String instructions;
	
	public Medication(String name, String dosage, String instructions) {
		this.name = name;
		this.dosage = dosage;
		this.instructions = instructions;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
}
