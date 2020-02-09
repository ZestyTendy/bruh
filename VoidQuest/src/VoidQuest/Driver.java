package VoidQuest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Driver extends Frame implements MouseListener {
	

	public static void main(String[] args) {
		Driver window = new Driver();
		Menu menu = new Menu(window);
		Game game = new Game(window);
		
		window.start();
		menu.on();
		game.off();
	}
	
	public void start() {
		// Initializes container
        setVisible(true);
        setTitle("Void Quest");
	    setLayout(null);
	    setSize(1920,1080); 
	    setBackground(new Color(50,50,50));
	    
	    // Closes window when X is pressed
        addWindowListener(new WindowAdapter(){  
        	public void windowClosing(WindowEvent e) {  
        		dispose();  
            }  
        });
        
	}
	
	public void toggleInput() {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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
}
