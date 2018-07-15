package basicStructures;

import mainRenderer.Structure;

public class Prism extends Structure {
	
	private int baseVertices;
	
	public Prism(int baseCentreX, int baseCentreY, int baseCentreZ, int baseVertices, int radius, int height) {
		/*
		 * Defines a Prism with an equilateral base of int baseVertices (2nd arg) vertices.
		 * Its base's centre is the Point baseCentre (1st to 3rd args).
		 * Its base's radius is int radius (4th arg).
		 * The prism's height is defined by int height (5th arg).
		 */
		this.vertices = new Point[2*baseVertices];
		this.baseVertices = baseVertices;
		float alpha = 360 / baseVertices;
		for (int i = 0; i < baseVertices; i++) {
			// X and Z Coordinates of the base's vertices relative to the Window screen
			int x = (int) (radius * Math.cos(Math.toRadians((i-0.5) * alpha - 90))) + baseCentreX;
			int z = (int) (radius * Math.sin(Math.toRadians((i-0.5) * alpha - 90))) + baseCentreZ;
			this.vertices[i] = new Point(x, baseCentreY, z);
			this.vertices[baseVertices + i] = new Point(x, baseCentreY + height, z);
		}
	}

	@Override
	public void displayEdges() {
		for(int i = 0; i < this.baseVertices-1; i++) {
			displayLine(this.vertices[i], this.vertices[i+1]);
			displayLine(this.vertices[this.baseVertices+i], this.vertices[this.baseVertices+i+1]);
			displayLine(this.vertices[i], this.vertices[baseVertices+i]);
		}
		displayLine(this.vertices[this.baseVertices-1], this.vertices[0]);
		displayLine(this.vertices[2*this.baseVertices-1], this.vertices[this.baseVertices]);
	}
	
	public static void main(String[] args) {
		Prism p = new Prism(300, 50, 0, 10, 50, 100);
		p.display();
	}
}
