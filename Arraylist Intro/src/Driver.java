import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener{
	
	

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 1000);
		
		
		
		System.out.println("paint");
	}
	
	
	public void rings(int x, int y, int width, Graphics g) {
		
		
		
	}	
	
	public static void main(String[] arg) {
		
		//find a way to run the constructor of the Driver class
		Driver d  = new Driver(); //will this invoke a constructor?
		

	}	
	
	//1) add a Driver constructor
		public Driver() {
			JFrame frame = new JFrame("ArrayList stuff");
			frame.setSize(800,600);
			frame.add(this);
			
			//this part makes sure the x button closes the program
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			t.start();
			//make the frame show up
			frame.setVisible(true);
					
		}
	Timer t = new Timer(100, this);
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
}



