package hust.soict.globalict.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import hust.soict.globalict.aims.Store;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;


public class addItemToStoreScreen extends JFrame{
	protected static Store store;
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		JMenuItem addBook = new JMenuItem("Add Book");
		JMenuItem addCD = new JMenuItem("Add CD");
		JMenuItem addDVD = new JMenuItem("Add DVD");
		
		addBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == addBook) {
					addBookToStoreScreen newWindow = new addBookToStoreScreen(addItemToStoreScreen.store);
				}
			}
		});
		addCD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == addCD) {
					addCompactDiscToStoreScreen newWindow = new addCompactDiscToStoreScreen(addItemToStoreScreen.store);
				}
			}
		});
		addDVD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == addDVD) {
					addDigitalVideoDiscToStoreScreen newWindow = new addDigitalVideoDiscToStoreScreen(addItemToStoreScreen.store);
				}
			}
		});
		
		smUpdateStore.add(addBook);
		smUpdateStore.add(addCD);
		smUpdateStore.add(addDVD);
		
		menu.add(smUpdateStore);
		JMenuItem viewStore = new JMenuItem("View Store");
		JMenuItem viewCart = new JMenuItem("View Cart");
		menu.add(viewStore);
		menu.add(viewCart);
		
		viewStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == viewStore) {
					dispose();
					StoreScreen newWindow = new StoreScreen(StoreScreen.store);
				}
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		return menuBar;
	}
	JPanel createHeader() {
		
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("Aims");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100, 50));
		cart.setMaximumSize(new Dimension(100, 50));
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		
		return header;
	}
	public class MediaStore extends JPanel{
		public MediaStore(Media media) {
			
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			
			JLabel title = new JLabel(media.getTitle());
			title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
			title.setAlignmentX(CENTER_ALIGNMENT);
			
			JLabel cost = new JLabel("" + media.getCost() + " $");
			cost.setAlignmentX(CENTER_ALIGNMENT);
			
			JPanel container = new JPanel();
			container.setLayout(new FlowLayout(FlowLayout.CENTER));
			
			JButton addToCart = new JButton("Add to cart");
			addToCart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == addToCart) {
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame,
						    media.getTitle() + " is added successfully",
						    "Add media",
						    JOptionPane.INFORMATION_MESSAGE
						);
					}
				}
			});
			container.add(addToCart);
			if(media instanceof Playable) {
				JButton play = new JButton("Play");
				play.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == play) {
							JFrame frame = new JFrame();
							JOptionPane.showMessageDialog(frame,
							    media.getTitle() + " is playing",
							    "Play media",
							    JOptionPane.INFORMATION_MESSAGE
							);
						}
					}
				});
				container.add(play);
			}
			
			this.add(Box.createVerticalGlue());
			this.add(title);
			this.add(cost);
			this.add(Box.createVerticalGlue());
			this.add(container);
			
			this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
	}
	public addItemToStoreScreen(Store store) {
		StoreScreen.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
}
