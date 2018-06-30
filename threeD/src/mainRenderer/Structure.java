package mainRenderer;

public class Structure{
	
	static Window win = new Window();
	
	public class Point{
		
		public int x, y, z;
		
		public Point(int x, int y, int z) {
			this.x = x;
			this.y = win.getHeight() - y - 10;
			this.z = z;			
		}
		
		int[] calc2DPosition() {
			int v = (int) (this.z * Math.sqrt(2) / 4);
			return new int[] {this.x + v, this.y - v};
		}
		
		public void display() {
			int[] pos = this.calc2DPosition();
			win.fillEllipse(pos[0], pos[1], 6, 6);
		}
		
	}
	
	public static void displayLine(Point a, Point b) {
		int[] posA = a.calc2DPosition();
		int[] posB = b.calc2DPosition();
		win.line(posA[0], posA[1], posB[0], posB[1]);
	}

}