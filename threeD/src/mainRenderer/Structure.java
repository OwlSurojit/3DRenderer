package mainRenderer;

public class Structure{
	
	Window win = new Window();
	
	public class Point{
		
		public int x, y, z;
		
		public Point(int x, int y, int z) {
			this.x = x;
			this.y = win.getHeight() - y - 10;
			this.z = z;			
		}
		
		public void display() {
			int v = (int) (this.z / Math.sqrt(2));
			win.fillEllipse(this.x + v, this.y - v, 5, 5);
		}
		
	}

}