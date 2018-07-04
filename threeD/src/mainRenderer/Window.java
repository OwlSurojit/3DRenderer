package mainRenderer;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Window extends JFrame implements MouseListener {
	
	private static final long serialVersionUID = -3997719432606609394L;
	
	boolean mousePressed, mouseInside;
	Image content;
	static final int minWidth = 640,
					 minHeight = 360,
					 maxWidth = 960,
					 maxHeight = 540;
	
	public Window() {
		
		super("3D Renderer");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(minWidth, minHeight));
		setMaximumSize(new Dimension(maxWidth, maxHeight));
		setSize(new Dimension(maxWidth, maxHeight));
		
		// Add Contents and pack them to the screen (so they resize properly)
		
		// TODO Put this into a separate function that actually adds some content, in case that is needed.
		
		//this.frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		//this.frame.pack();
		
		getContentPane().setBackground(Color.WHITE);
				
		setLocationRelativeTo(null);
		
		addMouseListener(this);
		setVisible(true);
		
		this.content = new BufferedImage(maxWidth, maxHeight, BufferedImage.TYPE_INT_ARGB);
	}

	public void toggleVisible() {
		this.setVisible(!this.isVisible());
	}
	
	
	/************************************ PAINTING **************************************/
		
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(content, 0, 0, this);		
	}
	
	public void fillEllipse(int x, int y, int w, int h) {
		Graphics g = this.content.getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(x - w/2, y - h/2, w, h);
		g.dispose();
		repaint();
	}
	
	public void line(int x0, int y0, int x1, int y1) {
		Graphics2D g = (Graphics2D) this.content.getGraphics();
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(2));
		g.drawLine(x0, y0, x1, y1);
		g.dispose();
		repaint();
	}
	
	
	/******************************* MOUSE INTERACTION *********************************/

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
