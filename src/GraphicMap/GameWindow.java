package GraphicMap;

import java.awt.Dimension;

import javax.swing.JFrame;



public class GameWindow {
	public static void main(String[] args){
	
	JFrame frame = new JFrame("TRON");
	frame.setContentPane(new Screen1());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	frame.pack();
	frame.setPreferredSize(new Dimension(Screen1.MALLASIZE, Screen1.MALLASIZE));
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	}
}
