package Assignment;


	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.TableView;
	import javafx.scene.control.cell.PropertyValueFactory;
	import javafx.scene.layout.VBox;
	import javafx.stage.Stage;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;

	public class DentalManagementApp extends Application {

	    private static final Statement DatabaseConnection = null;
		private TableView<Patient> table = new TableView<>();

	    public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Dental Management System");

	        // Table Columns
	        TableColumn<Patient, Integer> idColumn = new TableColumn<>("ID");
	        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

	        TableColumn<Patient, String> nameColumn = new TableColumn<>("Name");
	        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

	        TableColumn<Patient, Integer> ageColumn = new TableColumn<>("Age");
	        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

	        TableColumn<Patient, String> contactColumn = new TableColumn<>("Contact");
	        contactColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));

	        table.getColumns().addAll(idColumn, nameColumn, ageColumn, contactColumn);

	        // Load Data Button
	        Button loadButton = new Button("Load Patients");
	        loadButton.setOnAction(e -> loadPatients());

	        VBox vbox = new VBox();
	        vbox.getChildren().addAll(table, loadButton);

	        primaryStage.setScene(new Scene(vbox, 600, 400));
	        primaryStage.show();
	    }

	    private void loadPatients() {
	        ObservableList<Patient> patients = FXCollections.observableArrayList();
	        try (Connection conn = DatabaseConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM patients");
	             ResultSet rs = stmt.executeQuery()) {

	            while (rs.next()) {
	                patients.add(new Patient(rs.getInt("id"), rs.getString("name"),
	                        rs.getInt("age"), rs.getString("contact")));
	            }
	            table.setItems(patients);

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


