package hust.soict.globalict.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CartScreen extends JFrame{
	Stage window;
	Scene scene1, scene2;
	private Cart cart;
	
	public CartScreen(Cart cart) {
		super();
		
		this.cart = cart;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setSize(1024, 768);
		this.setTitle("Cart");
		this.setVisible(true);
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass()
							.getResource("/hust/soict/globalict/aims/screen/Cart.fxml"));
					CartScreenController controller = 
							new CartScreenController(cart);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		Media dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		Media dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		Media dvd3 = new DigitalVideoDisc("Hercules",
				"Animation", "Ron Clements", 10.99f);
		Cart openCart = new Cart();
		openCart.addMedia(dvd1);
		openCart.addMedia(dvd2);
		openCart.addMedia(dvd3);
		new CartScreen(openCart);
	}
}
