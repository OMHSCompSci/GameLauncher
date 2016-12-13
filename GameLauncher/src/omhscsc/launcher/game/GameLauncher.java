package omhscsc.launcher.game;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

/**
 * This class is going to be a mostly unchanged class when finished. The point of this is to launch the game. Whenever we update the game, the launcher
 * will check to see available updates, and update when necessary. The update will work by downloading the .class files from some server (Probably firebase storage)
 * and replace the updated files. This shouldn't be extremely difficult I don't think. There is no rush to complete this.
 * 
 * @author OMHSCSC
 *
 */
public class GameLauncher extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8854378923830762941L;

	private JPanel panel;
	private JScrollPane notesPane;
	private JTextArea updateNotes;
	private JButton playButton;
	
	
	public static void main(String[] args) {
		GameLauncher gm = new GameLauncher();
	}
	
	
	public GameLauncher() {
		panel = new JPanel(new SpringLayout());
		updateNotes = new JTextArea();
		notesPane = new JScrollPane(updateNotes);
		playButton = new JButton("PLAY");
		setTitle("Deceit Launcher");
		SpringLayout sl = (SpringLayout)panel.getLayout();
		sl.putConstraint(SpringLayout.WEST, notesPane, 10, SpringLayout.WEST, panel);
		sl.putConstraint(SpringLayout.NORTH, notesPane, 10, SpringLayout.NORTH, panel);
		sl.putConstraint(SpringLayout.EAST, notesPane, -10, SpringLayout.EAST, panel);
		sl.putConstraint(SpringLayout.SOUTH, notesPane, 25, SpringLayout.NORTH, playButton);
		sl.putConstraint(SpringLayout.WEST, playButton, 10, SpringLayout.WEST, panel);
		//sl.putConstraint(SpringLayout.NORTH, playButton, -25, SpringLayout.SOUTH, notesPane);
		sl.putConstraint(SpringLayout.EAST, playButton, -10, SpringLayout.EAST, panel);
		sl.putConstraint(SpringLayout.SOUTH, playButton, -10, SpringLayout.SOUTH, panel);
		
		panel.add(notesPane);
		panel.add(playButton);
		this.add(panel);
		this.setSize(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
