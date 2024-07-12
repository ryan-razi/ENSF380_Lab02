import java.util.ArrayList;

public class CareProfile {
	
	private Pet pet;
	private String careInstructions;
	private ArrayList<Medication> medicineList = new ArrayList<Medication>();
	
	public CareProfile(String careInstructions) {
		this.careInstructions = careInstructions;
	}
	
	// getters and setters
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public String getCareInstructions() {
		return careInstructions;
	}
	public void setCareInstructions(String careInstructions) {
		this.careInstructions = careInstructions;
	}
	public ArrayList<Medication> getMedicineList() {
		return medicineList;
	}
	public void setMedicineList(ArrayList<Medication> medicineList) {
		this.medicineList = medicineList;
	}
	
	
	// method to add medication 
	public void addMedication(Medication medication) {
        this.medicineList.add(medication);
    }
	
	// print details for CareProfile
	public void printDetails() {
        System.out.println("Care Instructions: " + this.careInstructions);
        printMedications();
    }
	
	 // method to get single medication by its name
	 public Medication getMedication(String name) {
	        for (Medication med : this.medicineList) {
	            if (med.getName().equals(name)) {
	                return med;
	            }
	        }
	        return null; 
	    }
	 
	 // method to remove medication from the arraylist
	 public void removeMedication(Medication medicine) {

	      this.medicineList.remove(medicine);

	    }
	 
	 // method to print all the medications in the array list
	 public void printMedications() {
	        System.out.println("Medications: ");
	        for (Medication med : this.medicineList) {
	            System.out.println(med.getName() + " (Dosage: " + med.getDosage() + "): " + med.getInstructions());
	        }
	    }
	
}
