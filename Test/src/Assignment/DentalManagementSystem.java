package Assignment;


	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.layout.GridPane;
	import javafx.scene.text.Font;
	
	import javafx.stage.Stage;

	public class DentalManagementSystem extends Application {
	    @Override
	    public void start(Stage primaryStage) {
	       
	        GridPane pane = new GridPane();
	        Scene scene = new Scene(pane, 500, 400); 
	        
	        
	        pane.setStyle("-fx-background-color: #f0f0f0;"); // Light gray background
	        pane.setHgap(10); 
	        pane.setVgap(10); 

	        
	        primaryStage.setTitle("Dental Management System");
	        primaryStage.setAlwaysOnTop(true);

	        
	        Label lblTitle;
	        Button btnRegister, btnSchedule, btnInvoice, btnExit;

	        
	        lblTitle = new Label("Dental Management System");
	        btnRegister = new Button("Patient Registration");
	        btnSchedule = new Button("Appointment Scheduling");
	        btnInvoice = new Button("Generate Invoice");
	        btnExit = new Button("Exit");

	        
	        lblTitle.setFont(new Font("Arial", 20));

	        
	        btnRegister.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;"); // Green
	        btnSchedule.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white;"); // Blue
	        btnInvoice.setStyle("-fx-background-color: #FFC107; -fx-text-fill: black;"); // Yellow
	        btnExit.setStyle("-fx-background-color: #f44336; -fx-text-fill: white;"); // Red

	        
	        pane.add(lblTitle, 0, 0, 2, 1); 
	        pane.add(btnRegister, 0, 1);
	        pane.add(btnSchedule, 0, 2);
	        pane.add(btnInvoice, 0, 3);
	        pane.add(btnExit, 0, 4);

	        
	        btnExit.setOnAction(e -> primaryStage.close());

	     
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }

		public void addPatient(Patient patient) {
			
			
		}
	}


