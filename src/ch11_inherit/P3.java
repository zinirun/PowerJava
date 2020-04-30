package ch11_inherit;

class Shape{
	int x, y;
	double size;
	public Shape(int x, int y) { this.x = x; this.y = y; this.size = x*y; }
	public int getX() { return x; }
	public int getY() { return y; }
	public int getSize() { return x*y; }
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	public double calcSize() {
		size = x * y;
		return size;
	}
}

class Triangle extends Shape{
	public Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	public double calcSize() {
		size = super.calcSize() * 0.5;
		return size;
	}
}

public class P3 {

	public static void main(String[] args) {
		Triangle t = new Triangle(3, 4);
		System.out.println(t.calcSize());

	}

}
