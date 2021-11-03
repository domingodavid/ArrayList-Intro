import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
	//instance variables
	private ArrayList<Cell> cells2 = new ArrayList<Cell>();
	private Player player = new Player(400,300);
	
	//Food ArrayList
	//ArrayList<TYPE> name = new ArrayList<TYPE>();
	private ArrayList<Cell> food = new ArrayList<Cell>();
	

	public void paint(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 1000);

	
		for(Cell thisCell : food) {
			thisCell.paint(g);
		}

		
		player.paint(g);
	//	g.drawLine(player.getX()+player.getWidth()/2, player.getY()+player.getWidth()/2, mx-5, my-20);
	//	double a = Math.tan(Math.abs(player.getY()-my) / Math.abs(player.getX()-mx)) * 180 / Math.PI;
	//	g.drawString(""+a, mx, my);
		
	}
	//tan t = 
	
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
			
			//connect the mouseListener
			frame.addMouseListener(this);
			frame.addMouseMotionListener(this);
			//the 1d array is an instance variable
			//job of the constructor is to setup the instance
			//variables
			for(int i =0; i < 50; i++) {
				
				int x = (int)(Math.random()*800);
				int y = (int)(Math.random()*600);
				Cell temp = new Cell(x, y);
				// add it to the ArrayList
			    cells2.add(temp); //call the add method of an ArrayList
				
			}
			
			//Create 100 cells that represent a "food"
			//add them to the new arraylist to store food
			for(int i =0; i < 100; i++) {
				
				//create a Cell Object (unit 2 and unit 5)
				Cell c = new Cell();
				
				//example setting a property of the object
				c.setX((int)(Math.random()*(1600))-800);
				
				//should be green and smaller than the others
				//create a new constructor OR use setters
				
				
				//add it to the list (unit 7)
				
				
			}
			
			//then in paint() you have to "traverse" the list
			//and ask the objects to paint
//
			player.setColor(Color.green);
			player.setWidth(40);
			player.setVx(0);
			player.setVy(0);
		//	cells2.add(player);
			
			t.start();
			//make the frame show up
			frame.setVisible(true);
					
		}
		
	Timer t = new Timer(16, this);
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
	
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	int mx  =0, my = 0;
	@Override
	public void mouseDragged(MouseEvent m) {
		// TODO Auto-generated method stub
		// create a new Cell on a click
		// TODO Auto-generated method stub
		
		//try one direction
		if(m.getX()<player.getX()) {
			player.setVx(-2);
		}else {
			player.setVx(2);
		}
		
		
		//can you get it to go up or down
		//based on relative position of mouse and player?
		
		
		
	}


	@Override
	public void mouseMoved(MouseEvent arg0) {

		
		
	}
}



