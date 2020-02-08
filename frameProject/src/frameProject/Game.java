package frameProject;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Game extends Frame implements MouseListener {
	private Button btn = new Button();
	private Label l = new Label();
	private mouseListener m = new mouseListener();
	private Color c = new Color(50,50,50);
	private Button btnCloseWindow = new Button();
	
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
        
        // Adds Button
		btn.setBounds(100,100,100,50);
		btn.setLabel("click me");
		btn.addMouseListener(this);
		add(btn);
		
			
		btnCloseWindow.setBounds(100,650, 300, 80);
		btnCloseWindow.setLabel("Quit");
		btnCloseWindow.addMouseListener(this);
		add(btnCloseWindow);
	
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		btn.setLabel("pressed");
		btnCloseWindow.setLabel("Goodbye!");
		if(btnCloseWindow.getLabel() == "Goodbye!") {
			dispose();
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


