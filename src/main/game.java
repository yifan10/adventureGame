package main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.Timer;

public class game extends JFrame { //jframe is used to create graphics
	
	//private GameScreen gameScreen;
	
	//BufferedImage img; //extends image, manipulate specific pixels, display images.
	
	
	//constructor
	/*public game() {
		
		//importImg();
		
		
		setSize(640,640); // set the size of the game;
		setVisible(true); // create a window
		//setResizable(false); //do not allow the window to be resized
		setDefaultCloseOperation(EXIT_ON_CLOSE); //enable you to completely close the program when you close the window
		setLocationRelativeTo(null); //null means start the window in center
		
		//gameScreen = new GameScreen(img); // create a new gameScreen
		//add(gameScreen); //Jframe.add(Jpanel) adds the panel to the frame
	}
	
	private void importImg() {
		InputStream is = getClass().getResourceAsStream("/images/background.png");
		
		try {
			img = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} */
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//newGame hello= new newGame();
		JFrame frame = new JFrame();
		frame.pack();
		frame.setSize(1200,1200); // set the size of the game;
		frame.setVisible(true); // create a window
		//setResizable(false); //do not allow the window to be resized
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE); //enable you to completely close the program when you close the window
		frame.setLocationRelativeTo(null); 
		newGame hello = new newGame();
		frame.add(hello);
		
	}

}
