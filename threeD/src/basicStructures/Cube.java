package basicStructures;

import mainRenderer.Structure;

public class Cube extends Structure {
		
	private void initVertices(int x, int y, int z, int length) {
		this.vertices = new Point[] {
			this.new Point(x, 			y, 			z),
			this.new Point(x + length, 	y, 			z),
			this.new Point(x + length, 	y + length, z),
			this.new Point(x, 			y + length, z),
			this.new Point(x, 			y, 			z + length),
			this.new Point(x + length, 	y, 			z + length),
			this.new Point(x + length,	y + length, z + length),
			this.new Point(x, 			y + length, z + length)
		};
	}
	
	public Cube (int x, int y, int z, int length) {
		this.initVertices(x, y, z, length);
	}
	
	public Cube (Point corner, int length) {
		this.initVertices(corner.x, corner.y, corner.z, length);
	}
	
	@Override
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
	
}
