package VoidQuest;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Game extends Frame implements MouseListener {
	private Button playButton = new Button();
	private Button closeButton = new Button();
	private Button menuButton = new Button();

	private Label l = new Label();
	private Color menuBackground = new Color(50,50,50);
	private Color gameBackground = new Color(10, 10, 10);
	public Game() {
	}
	
	private void initMenu() {
		// Initializing container
        setVisible(true);
        setTitle("Game");
	    setLayout(null);
	    setSize(1920,1080); 
	    setBackground(menuBackground);
	    
	    // Closes application upon clicking X
        addWindowListener(new WindowAdapter(){  
        	public void windowClosing(WindowEvent e) {  
        		dispose();  
            }  
        });
        
        // Adds Play Button
		playButton.setBounds(100,100,300,80);
		playButton.setLabel("Play Void Quest");
		playButton.addMouseListener(this);
		add(playButton);
		
		// Adds close button
		closeButton.setBounds(100,200, 300, 80);
		closeButton.setLabel("Quit");
		closeButton.addMouseListener(this);
		add(closeButton);
		
		// Adds Menu Button
		menuButton.setBounds(40,40,300,80);
		menuButton.setLabel("Main Menu");
		menuButton.addMouseListener(this);
		menuButton.setEnabled(false);
		menuButton.setVisible(false);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == playButton) {
			playButton.setLabel("pressed");
			setBackground(gameBackground);
			
			playButton.setEnabled(false);
			closeButton.setEnabled(false);
			playButton.setVisible(false);
			closeButton.setVisible(false);
			
			add(menuButton);
			menuButton.setEnabled(true);
			menuButton.setVisible(true);
			
		} else if(e.getSource() == closeButton) {
			closeButton.setLabel("Goodbye!");
			
			if(closeButton.getLabel() == "Goodbye!") {
				dispose();
			}
		}
			else if(e.getSource() == menuButton) {
				playButton.setLabel("Play Void Quest");
				setBackground(menuBackground);
				playButton.setEnabled(true);
				closeButton.setEnabled(true);
				menuButton.setEnabled(false);

				playButton.setVisible(true);
				closeButton.setVisible(true);
				menuButton.setVisible(false);
			
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.initMenu();
	}
	
}
