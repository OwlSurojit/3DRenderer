package mainRenderer;

public class Structure{
	
	Window win = new Window();
	
	public class Point{
		
		int x, y, z;
		
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

	public static void main(String[] args) {
		Structure str = new Structure();
		//Point[] p = new Point[8];
		Point[] p = {str.new Point(10,10,0),
					 str.new Point(110,10,0),
					 str.new Point(110,110,0),
					 str.new Point(10,110,0),
					 str.new Point(10,10,100),
					 str.new Point(110,10,100),
					 str.new Point(110,110,100),
					 str.new Point(10,110,100)};
		for(int i = 0; i < p.length; i++) {
			//p[i] = str.new Point(20*i, 20*i, 20*i);
			p[i].display();
		}
		//p.display();
	}

}