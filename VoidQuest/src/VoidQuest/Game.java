package VoidQuest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game extends Frame implements MouseListener {
	private Button menuButton = new Button();
	private Window window;
	private boolean isOn = false;
	
	public Game(Window x) {
		window = x;
		setBackground(new Color(50,50,50));
		menuButton.setBounds(40,40,300,80);
		menuButton.setLabel("Main Menu");
		menuButton.addMouseListener(this);
		x.add(menuButton);
		off();
	}
	
	public void on() {
		menuButton.setEnabled(true);
		menuButton.setVisible(true);
		isOn = true;
	}
	
	public void off() {
		menuButton.setEnabled(false);
		menuButton.setVisible(false);	
		isOn = false;
	}
	
	public boolean getActive() {
		return isOn;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == menuButton) {
			off();
			window.toggleInput();
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
