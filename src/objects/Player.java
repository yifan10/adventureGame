package objects;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import main.GlobalPosition;

public class Player extends GlobalPosition {
	
	private String playerimage = "/images/player copy.png";
	int velX = 1;
	int velY = 1;
	
	public Player(int x, int y) {
		super(x, y);
	}
	
	public void update() {
		x+=velX;
		y+=velY;
	}
	
	public void keyPressed(KeyEvent e) { //change velX values
		int key = e.getKeyCode();
		System.out.println(key==KeyEvent.VK_RIGHT);
		
		if (key == KeyEvent.VK_D) {
			velX = 5;
		}
		else if (key==KeyEvent.VK_A) {
			velX = -5;
		}
		else if (key==KeyEvent.VK_S) {
			velY = 5;
		}
		else if (key == KeyEvent.VK_W) {
			velY = -5;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_D) {
			velX = 0;
		}
		else if (key==KeyEvent.VK_A) {
			velX = 0;
		}
		else if (key==KeyEvent.VK_S) {
			velY = 0;
		}
		else if (key == KeyEvent.VK_W) {
			velY = 0;
		}
	}
	
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), x, y, null);
	}
	
	public Image getPlayerImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
		return i.getImage();
	}
}
