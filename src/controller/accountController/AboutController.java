package controller.accountController;
import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import controller.FramesController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class AboutController extends FramesController{


    @FXML
    private AnchorPane root;
    
	@FXML
	private JFXButton btnClose;

	@FXML
	private MediaView mediaView;
	
    @FXML
    private JFXButton btnHome;

	
	 @FXML
	    void processPlay(MouseEvent event) {
			try { // Linking the new mediaView Scene
				openFrame("accountView","AboutVideoUI","About");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	    }
	}
	 @FXML
		void processClose(ActionEvent event) {
			//mediaPlayer.pause();
		}
	}
