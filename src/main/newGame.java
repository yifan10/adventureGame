package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import input.KeyInput;
import objects.Player;


public class newGame extends JPanel implements ActionListener { //Jpanel allows us to draw 
	
	private static final long serialVersionUID = 1L;
	
	private String background = "/images/background.png";
	
	Timer gamelooptimer;
	Player p;
	
	
	
	public newGame() { //avoid bugs by adding input
		//build the constructor
		setFocusable(true);//control the game without need to click on it
		gamelooptimer = new Timer(40, this);
		gamelooptimer.start(); //to start the gameloop
		
		p = new Player(100, 100);
		
		addKeyListener(new KeyInput(p)); //create a new key input
		
	}
	public void paint(Graphics g) {
		super.paint(g); //call t he super class to do the thing,
		
		Graphics2D g2d = (Graphics2D) g; //transfer the graphic to a 2d, can use g2d to draw rectangles
		
		p.draw(g2d);
		
		g2d.drawImage(getBackgroundImage(), 0, 0, null);
		
	}
	
	public Image getBackgroundImage() {
		ImageIcon i = new ImageIcon(getClass().getResource(background));
		return i.getImage();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		p.update();
		repaint();
	}
}
