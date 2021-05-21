package hust.soict.globalict.aims.screen;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.beans.value.ChangeListener ;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController extends JFrame{
	@FXML
	private ToggleGroup filterCategory;
	private Cart cart;
	
	@FXML
	private MenuItem menuViewStore;
	@FXML
	private MenuItem menuViewCart;
	@FXML
	private TableView<Media> tblMedia;
	
	@FXML
	private TableColumn<Media, String> colMediaTitle;
	
	@FXML
	private TableColumn<Media, String> colMediaCategory;
	
	@FXML
	private TableColumn<Media, Float> colMediaCost;
	private Button btnPlay;
	private Button btnRemove;
	@FXML
	private Label lblTotalCost;
	public CartScreenController(Cart cart) {
		super();
		this.cart = cart;
	}
	@FXML
	public void initialize() {
	
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
		tblMedia.setItems(this.cart.getItemsOrdered());
		
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		
		tblMedia.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<Media>() {
					
					@Override
					public void changed(ObservableValue<? extends Media> observable, Media oldValue,
							Media newValue) {
						if(newValue != null) {
							updateButtonBar(newValue);
						}
					}
				});	
	}
	
	void updateButtonBar(Media media) {
		btnRemove.setVisible(true);
		if(media instanceof Playable) {
			btnPlay.setVisible(true);
		}else {
			btnPlay.setVisible(false);
		}
	}
	void updateLabel(Media media) {
		lblTotalCost.textProperty().bind(cart.getTotalCost().asString());
	}
	@FXML
	void btnPlaceOrderPressed(ActionEvent event) {
		JFrame frame = new JFrame();
		String[] options = new String[2];
		options[0] = new String("Yes I do!");
		options[1] = new String("No I don't");
		int m = JOptionPane.showOptionDialog(frame.getContentPane(), "Do you want to place order?", "Message!", 0, JOptionPane.INFORMATION_MESSAGE
				, null, options, null);
		switch(m) {
		case 0: 
			cart.clear();
			break;
		case 1:
			break;
		}
	}
	@FXML
	void btnRemovePressed(ActionEvent event) throws Exception {
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		cart.removeMedia(media);
	}
	@FXML
	void btnPlayPressed(ActionEvent event) throws PlayerException{
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		cart.play(media.getId());
	}
	
	void viewStorePressed(ActionEvent event) {

	}
	void viewCartPressed(ActionEvent event) {
		
	}
}
