package VoidQuest;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Game extends Frame implements MouseListener {
	private Button playButton = new Button();
	private Button closeButton = new Button();
	private Label l = new Label();
	private Color c = new Color(50,50,50);
	
	public Game() {
	}
	
	private void initMenu() {
		// Initializing container
        setVisible(true);
        setTitle("Game");
	    setLayout(null);
	    setSize(1920,1080); 
	    setBackground(c);
	    
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
	
		
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == playButton) {
			playButton.setLabel("pressed");
		} else if(e.getSource() == closeButton) {
			closeButton.setLabel("Goodbye!");
			if(closeButton.getLabel() == "Goodbye!") {
				dispose();
			}
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

