
public class Pet {

	private String name;
	final private String species;
	private Client owner;
	private Facility facility;
	private boolean deceased;
	private CareProfile careProfile;
	
	public Pet(String name, String species, Client owner, Facility facility, boolean deceased, CareProfile careProfile) {
		this.name = name;
		this.species = species;
		this.owner = owner;
		this.facility = facility;
		this.deceased = deceased;
		this.careProfile = careProfile;
		owner.addPet(this);
		facility.addPet(this);
		careProfile.setPet(this);
	}
	
	// getters and setters
	
	public CareProfile getCareProfile() {
		return careProfile;
	}

	public void setCareProfile(CareProfile careProfile) {
		this.careProfile = careProfile;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public Client getOwner() {
		return owner;
	}
	public void setOwner(Client owner) {
		this.owner = owner;
	}
	public Facility getFacility() {
		return facility;
	}
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	public boolean isDeceased() {
		return deceased;
	}
	public void setDeceased(boolean deceased) {
		this.deceased = deceased;
	}

}
