package userinterface;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainWindow extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Declare
		Label lblTitle,lblSid,lblName,lblCourse,lblLevel,lblSection,lblSub1,lblSub2,lblTotal,lblAverage,lblResult;
		TextField txtSid,txtName,txtCourse,txtLevel,txtSection,txtSub1,txtSub2,txtTotal,txtAverage,txtResult;
		Button btnSearch,btnCalculate,btnNew,btnSave,btnEdit,btnDelete,btnExportAll;
		
		
		
		
		lblTitle= new Label("Student Result Processing");
		lblTitle.relocate(80, 5);
		Font font1=new Font("Arial",25);
		lblTitle.setFont(font1);
		
		lblSid= new Label("SID");
		lblSid.relocate(50, 35);
		Font font2=new Font("Arial",14);
		lblSid.setFont(font2);
		
		txtSid=new TextField();
		txtSid.relocate(100,35);
		
		btnSearch=new Button("Search");
		btnSearch.relocate(300,35);	
		
		lblName= new Label("NAME");
		lblName.relocate(40, 75);
		lblName.setFont(font2);
		
		txtName=new TextField();
		txtName.relocate(100,75);
		
		lblCourse= new Label("COURSE");
		lblCourse.relocate(40, 115);
		lblCourse.setFont(font2);
		
		txtCourse=new TextField();
		txtCourse.relocate(100,115);
		
		lblLevel= new Label("LEVEL");
		lblLevel.relocate(40, 155);
		lblLevel.setFont(font2);
		
		txtLevel=new TextField();
		txtLevel.relocate(100,155);
		
		
		lblSection= new Label("SECTION");
		lblSection.relocate(40, 195);
		lblSection.setFont(font2);
		
		txtSection=new TextField();
		txtSection.relocate(100,195);
		
		
		lblSub1= new Label("SUB1");
		lblSub1.relocate(40, 235);
		lblSub1.setFont(font2);
		
		txtSub1=new TextField();
		txtSub1.relocate(100,235);
		
		lblSub2= new Label("SUB2");
		lblSub2.relocate(40, 275);
		lblSub2.setFont(font2);
		
		txtSub2=new TextField();
		txtSub2.relocate(100,275);
		
		btnCalculate=new Button("Calculate");
		btnCalculate.relocate(300,275);	
		
		lblTotal= new Label("TOTAL");
		lblTotal.relocate(40, 305);
		lblTotal.setFont(font2);
		
		txtTotal=new TextField();
		txtTotal.relocate(100,305);
		
		
		lblAverage= new Label("AVERAGE");
		lblAverage.relocate(20, 345);
		lblAverage.setFont(font2);
		
		txtAverage=new TextField();
		txtAverage.relocate(100,345);
		
		lblResult= new Label("SUB2");
		lblResult.relocate(40, 385);
		lblResult.setFont(font2);
		
		txtResult=new TextField();
		txtResult.relocate(100,385);
		
		btnNew=new Button("NEW");
		btnNew.relocate(75,425);	
		
		btnSave=new Button("SAVE");
		btnSave.relocate(130,425);	
		
		btnEdit=new Button("EDIT");
		btnEdit.relocate(190,425);	
		
		btnDelete=new Button("DELETE");
		btnDelete.relocate(250,425);	
		
		btnExportAll=new Button("EXPORT ALL");
		btnExportAll.relocate(325,425);	
		
		
		Pane pane=new Pane();
		Scene scene=new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setWidth(450);
		primaryStage.setHeight(700);
		
		//TableView tblUsers;
		
		//add
		pane.getChildren().addAll(lblTitle,lblSid,lblName,lblCourse,lblLevel,lblSection,lblSub1,lblSub2,lblTotal,lblAverage,lblResult);
		pane.getChildren().addAll(txtSid,txtName,txtCourse,txtLevel,txtSection,txtSub1,txtSub2,txtTotal,txtAverage,txtResult);
		pane.getChildren().addAll(btnSearch,btnCalculate,btnNew,btnSave,btnEdit,btnDelete,btnExportAll);
		
		//display window
		primaryStage.show();
		
	}
	public static void main(String[]args) {
		launch(args);
	}

}