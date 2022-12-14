package Chap09;

//--- 円クラス ---//
public class Circle {
	private Point2D center;			// 中心の座標

	private int radius = 0;			// 半径

	public Circle() { center = new Point2D(); }

	public Circle(Point2D c, int radius) {
		center = new Point2D(c);  this.radius = radius;
	}

	public Point2D getCenter() { return new Point2D(center); }
	public int getRadius() { return radius; }

	public void setCenter(Point2D c) {
		center.set(c.getX(), c.getY());
	}
	public void setRadius(int radius) { this.radius = radius; }

	public String toString() {
		return "中心座標：" + center.toString() + " 半径：" + radius; 
	}
}
