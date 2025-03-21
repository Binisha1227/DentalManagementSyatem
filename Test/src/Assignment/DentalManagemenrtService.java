package Assignment;


	import java.sql.*;

	public class DentalManagementService {

	    // Database connection URL
	    private static final String URL = "jdbc:mysql://localhost:3306/dental_management";
	    private static final String USER = "root";
	    private static final String PASSWORD = "password";

	    // Method to add a new patient
	    public void addPatient(Patient patient) {
	        String query = "INSERT INTO patients (patient_id, full_name, address, phone) VALUES (?, ?, ?, ?)";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement stmt = conn.prepareStatement(query)) {

	            stmt.setInt(1, patient.getPatientId());
	            stmt.setString(2, patient.getFirstName());
	            stmt.setString(3, patient.getAddress());
	            stmt.setString(4, patient.getPhone());

	            stmt.executeUpdate();
	            System.out.println("Patient added successfully!");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Method to view all patients
	    public void viewAllPatients() {
	        String query = "SELECT * FROM patients";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {

	            while (rs.next()) {
	                System.out.println("Patient ID: " + rs.getInt("patient_id"));
	                System.out.println("Full Name: " + rs.getString("full_name"));
	                System.out.println("Address: " + rs.getString("address"));
	                System.out.println("Phone: " + rs.getString("phone"));
	                System.out.println("---------------");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


