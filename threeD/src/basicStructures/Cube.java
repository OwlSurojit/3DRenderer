package basicStructures;

import mainRenderer.Structure;

public class Cube extends Structure {
	
	Point[] vertices = new Point[8];
	
	private void initVertices(int x, int y, int z, int length) {
		
		this.vertices[0] = this.new Point(x, 			y, 			z);
		this.vertices[1] = this.new Point(x + length, 	y, 			z);
		this.vertices[2] = this.new Point(x + length, 	y + length, z);
		this.vertices[3] = this.new Point(x, 			y + length, z);
		this.vertices[4] = this.new Point(x, 			y, 			z + length);
		this.vertices[5] = this.new Point(x + length, 	y, 			z + length);
		this.vertices[6] = this.new Point(x + length,	y + length, z + length);
		this.vertices[7] = this.new Point(x, 			y + length, z + length);
		
	}
	
	public Cube (int x, int y, int z, int length) {
		
		this.initVertices(x, y, z, length);
		
	}
	
	public Cube (Point corner, int length) {
				
		this.initVertices(corner.x, corner.y, corner.z, length);
		
	}
	
	public void displayVertices() {
		for(Point p : this.vertices) {
			p.display();
		}
	}
	
	public void displayEdges() {
		displayLine(this.vertices[0], this.vertices[1]);
		displayLine(this.vertices[0], this.vertices[3]);
		displayLine(this.vertices[0], this.vertices[4]);
		displayLine(this.vertices[2], this.vertices[1]);
		displayLine(this.vertices[2], this.vertices[3]);
		displayLine(this.vertices[2], this.vertices[6]);
		displayLine(this.vertices[5], this.vertices[1]);
		displayLine(this.vertices[5], this.vertices[4]);
		displayLine(this.vertices[5], this.vertices[6]);
		displayLine(this.vertices[7], this.vertices[3]);
		displayLine(this.vertices[7], this.vertices[4]);
		displayLine(this.vertices[7], this.vertices[6]);

	}
	
	
	public static void main(String[] args) {
		Cube c = new Cube(10,10,10,200);
		c.displayVertices();
		c.displayEdges();
	}
	
}
