import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
				"Do you want to change to the first class ticket?");
		
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}
// if user choose cancel then the message show "You've chosen No"
// to customize the options to user, we use showOptionDialog instead
/*
import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		Object[] options = {"Yes, I do!","No way!"};
		int n = JOptionPane.showOptionDialog(
				null, "Do you want to change to the first class ticket?",
				"An important question",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[0]);
		JOptionPane.showMessageDialog(null, "You've chosen: "
				+ (n == JOptionPane.YES_OPTION?"Yes, I do!":"No way!"));
		System.exit(0);
	}
}
 */
