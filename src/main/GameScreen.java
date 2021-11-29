package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GameScreen extends JPanel implements ActionListener { //Jpanel allows us to draw 
	
	private Random random; //use random to create random colors
	private BufferedImage img;
	private ArrayList<BufferedImage> sprites = new ArrayList<>();
	Timer gamelooptimer;
	
	public GameScreen(BufferedImage img) { //avoid bugs by adding input
		//build the constructor
		this.img = img;
		loadSprites();
		gamelooptimer = new Timer(10, this);
		setFocusable(true); //control the game without need to click on it
		random = new Random();
	}
	
	private void loadSprites() {
		for (int y = 0; y < 10; y++) {
			for (int x = 0; x < 10; x++) {
				img.getSubimage(32*x, 32*y, 32, 32);
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); //call the super class to do the thing,
		
		Graphics2D g2d = (Graphics2D) g; //transfer the graphic to a 2d, can use g2d to draw rectangles
		//g.drawImage(img, 0, 0, null); //draw the image to the window
		BufferedImage orc = img.getSubimage(32*9, 32, 32, 32);
		g.drawImage(orc, 0, 0, null); //just use the orc
		/*
		for (int x = 0; x<20; x++) {
			//g.setColor(new Color(100,10,50)); , (new Color(100,20,20));
			for (int y = 0; y<20; y++) { //for y loop as well
				//g.setColor(new Color(100,10,50)); //create random colors , (new Color(100,20,20));
				g.setColor(getRndColor());
				g.fillRect(x*32, y*32, 32, 32);
			}
		}*/
		
		
	}
	
	private Color getRndColor() {
		int r = random.nextInt(256);
		int g = random.nextInt(256);
		int b = random.nextInt(256);
		
		return new Color(r,g,b);
		
	}
}
