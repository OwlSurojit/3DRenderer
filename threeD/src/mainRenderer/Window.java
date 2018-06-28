package mainRenderer;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Window extends JFrame implements MouseListener {
	
	private static final long serialVersionUID = -3997719432606609394L;
	
	boolean mousePressed, mouseInside;
	
	public Window() {
		

		super("3D Renderer");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(320, 180));
		
		// Add Contents and pack them to the screen (so they resize properly)
		
		// TODO Put this into a separate function that actually adds some content, in case that is needed.
		
		//this.frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		//this.frame.pack();
		
		getContentPane().setBackground(Color.WHITE);
		
		setLocationRelativeTo(null);
		addMouseListener(this);
		//this.fillEllipse(50, 50, 50, 50);
		setVisible(true);
	}
	
	public void toggleVisible() {
		setVisible(!isVisible());
	}
	
	/*public void drawCircle(int x, int y) {
		this.frame.
	}*/
	
	private class Ellipse extends Window{
		
		private static final long serialVersionUID = 1L;
		int x, y, w, h;
		
		private Ellipse (int x, int y, int w, int h) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
		}
	
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.BLACK);
			g.fillOval(this.x,this.y,this.w,this.h);
		}
	}
	
	public void fillEllipse(int x, int y, int w, int h) {
		/*Graphics g = getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(x, y, w, h);
		paint(g);*/
		Ellipse e = new Ellipse(x, y, w, h);
		e.repaint();
		System.out.println("gettin' somewhere:\nx = " + x + "; y = " + y + "; w = " + w + "; h = " + h);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO In case something is supposed to happen when one clicks in the window...
		repaint();
		System.out.println("draw!");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.mouseInside = true;		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.mouseInside = false;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.mousePressed = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.mousePressed = false;		
	}
	
	public int getMouseX() {
		return getMousePosition().x;
	}
	
	public int getMouseY() {
		return getMousePosition().y;
	}
}
