package Assignment;


public class Patient {
    // Attributes (fields)
    private int patientId;
    private String fullname;
    private String gender;
    private String dateOfBirth;
    private String contactNumber;
    private String address;
    private String email;

    // Constructor
    public Patient(int patientId, String firstName, String lastName, String gender, String dateOfBirth, String contactNumber, String address, String email) {
        this.patientId = patientId;
        this.fullname = fullname;
        this.contactNumber = contactNumber;
        this.address = address;
        this.email = email;
    }

    // Getters and Setters for each field
    public Patient(int int1, String string, int int2, String string2) {
		// TODO Auto-generated constructor stub
	}

	public int getPatientId() {
        return patientId; }
  

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return fullname;
    }

    public void setFirstName(String firstName) {
        this.fullname = firstName;
    }

    public String getLastName() {
        return fullname;
    }

    public void setLastName(String lastName) {
        this.fullname = lastName;
    }
    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    @Override
    public String toString() {
        return "Patient [ID=" + patientId + ", Name=" + "fullname" + 
               ", Date of Birth=" + dateOfBirth + ", Contact=" + contactNumber + ", Address=" + address + ", Email=" + email + "]";
    }

	public void setGender(String text) {
	
		
	}
}
