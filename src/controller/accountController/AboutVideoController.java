package controller.accountController;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AboutVideoController implements Initializable {

	@FXML
	private MediaView mediaView;
	private Media media;
	private MediaPlayer mediaPlayer;


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// Initialising path of the media file,
		File videoFile = new File("src/assets/About.mp4");
		String videoPath = videoFile.toURI().toString();
		// Instantiating Media class
		this.media = new Media(videoPath);
		// Instantiating MediaPlayer class
		this.mediaPlayer = new MediaPlayer(media);
		this.mediaView.setMediaPlayer(mediaPlayer);

		// Binding height and width with scene
		DoubleProperty width = mediaView.fitWidthProperty();
		DoubleProperty height = mediaView.fitHeightProperty();
		width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));

		// by setting this property to true, the Video will be played
		mediaPlayer.setAutoPlay(true);
//		thisStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//
//			@Override
//			public void handle(final WindowEvent arg0) {
//				mediaPlayer.pause();
//			}
//		});
	}
}
