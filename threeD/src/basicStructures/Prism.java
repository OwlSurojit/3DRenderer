package basicStructures;

import mainRenderer.Structure;

public class Prism extends Structure {
	
	public Prism(int baseCentreX, int baseCentreY, int baseCentreZ, int baseVertices, int radius, int height) {
		/*
		 * Defines a Prism with an equilateral base of int baseVertices (2nd arg) vertices.
		 * Its centre is the Point baseCentre (1st arg).
		 * Its radius is int radius (3rd arg).
		 * The height of the prism is defined with int height (4th arg).
		 */
		this.vertices = new Point[2*baseVertices];
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
		
	}
	
	public static void main(String[] args) {
		Prism p = new Prism(300, 50, 0, 10, 50, 100);
		p.display();
	}
}
