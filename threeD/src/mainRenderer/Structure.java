package mainRenderer;

public class Structure{
	Window win = new Window();
	
	public class Point{
		
		int x, y, z;
		
		public Point(int x, int y, int z) {
			this.x = x;
			this.y = win.getHeight() - y;
			this.z = z;			
		}
		
		public void display() {
			int v = (int) (this.z / Math.sqrt(2));
			win.fillEllipse(this.x + v, this.y - v, 5, 5);
		}
		
	}

	public static void main(String[] args) {
		Structure str = new Structure();
		Point p = str.new Point(50,50,50);
		p.display();
	}

}