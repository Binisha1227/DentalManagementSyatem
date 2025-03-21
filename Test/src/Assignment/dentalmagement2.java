package Assignment;

public class dentalmanagement2 {
	import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

	public class DentalManagementSystem2extends Application {

	    @Override
	    public void start(Stage primaryStage) throws Exception {

	        // Create Labels and TextFields for Patient Information
	        Label lblTitle, lblPatientId, lblFullName, lblAddress, lblPhone;
	        TextField txtPatientId, txtFullName, txtAddress, txtPhone;
	        Button btnSearch, btnAddPatient, btnClear, btnViewAll, btnUpdate, btnDelete;

	        Font font1 = new Font("Arial", 25);
	        Font font2 = new Font("Arial", 16);

	        // Initialize labels and textfields
	        lblTitle = new Label("Dental Management System");
	        lblTitle.relocate(50, 0);
	        lblTitle.setFont(font1);

	        lblPatientId = new Label("Patient ID");
	        lblPatientId.relocate(50, 35);
	        lblPatientId.setFont(font2);

	        txtPatientId = new TextField();
	        txtPatientId.relocate(150, 35);

	        btnSearch = new Button("Search");
	        btnSearch.relocate(325, 35);

	        lblFullName = new Label("Full Name");
	        lblFullName.relocate(50, 70);

	        txtFullName = new TextField();
	        txtFullName.relocate(150, 70);

	        lblAddress = new Label("Address");
	        lblAddress.relocate(50, 105);

	        txtAddress = new TextField();
	        txtAddress.relocate(150, 105);

	        lblPhone = new Label("Phone Number");
	        lblPhone.relocate(50, 140);

	        txtPhone = new TextField();
	        txtPhone.relocate(150, 140);

	        btnAddPatient = new Button("Add Patient");
	        btnAddPatient.relocate(50, 175);

	        btnClear = new Button("Clear");
	        btnClear.relocate(150, 175);

	        btnViewAll = new Button("View All Patients");
	        btnViewAll.relocate(250, 175);

	        btnUpdate = new Button("Update Patient");
	        btnUpdate.relocate(400, 175);

	        btnDelete = new Button("Delete Patient");
	        btnDelete.relocate(550, 175);

	        // Add Patient Button Action
	        btnAddPatient.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent event) {
	                // Create a new patient and save it to the database
	                Patient patient = new Patient();
	                patient.setPatientId(Integer.parseInt(txtPatientId.getText()));
	                patient.setFirstName(txtFullName.getText());
	                patient.setAddress(txtAddress.getText());
	                patient.setPhone(txtPhone.getText());

	                // Call the service method to insert the patient into the database
	                new DentalManagementService().addPatient(patient);
	                
	                // Clear the form fields
	                txtPatientId.clear();
	                txtFullName.clear();
	                txtAddress.clear();
	                txtPhone.clear();
	            }
	        });

	        // Clear Button Action
	        btnClear.setOnAction(event -> {
	            // Clear all form fields
	            txtPatientId.clear();
	            txtFullName.clear();
	            txtAddress.clear();
	            txtPhone.clear();
	        });

	        // View All Patients Button Action
	        btnViewAll.setOnAction(event -> {
	            // Call the service method to retrieve and display all patients (for example, in a new window)
	            new DentalManagement().viewAllPatients();
	        });

	        // Initialize the layout and the stage
	        Pane pane = new Pane();
	        Scene scene = new Scene(pane);
	        primaryStage.setScene(scene);
	        primaryStage.setWidth(700);
	        primaryStage.setHeight(400);

	        // Add controls to the pane
	        pane.getChildren().addAll(lblTitle, lblPatientId, txtPatientId, btnSearch);
	        pane.getChildren().addAll(lblFullName, txtFullName);
	        pane.getChildren().addAll(lblAddress, txtAddress);
	        pane.getChildren().addAll(lblPhone, txtPhone);
	        pane.getChildren().addAll(btnAddPatient, btnClear, btnViewAll, btnUpdate, btnDelete);

	        // Display the window
	        primaryStage.setTitle("Dental Management System");
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }

	}}
