package g_triangle;

import java.lang.Math;


public class Point {
	
	private double m_x, m_y;
	
	public Point() {
		assign(0.0, 0.0);
	}

	public Point(double x, double y) {
		assign(x, y);
	}

	

	public double getX() {
		return m_x;
	}

	public void setX(double x) {
		this.m_x = x;
	}

	public double getY() {
		return m_y;
	}

	public void seY(double y) {
		this.m_y = y;
	}
	
	public void assign(double x, double y) {
		m_x = x;
		m_y = y;
	}
	
	public void Afficher() {
		System.out.println("("+getX()+", "+getY()+")");
	}
	
	public String str() {
		return "("+getX()+", "+getY()+")";
	}
	
	public double distance(Point p2) {
		double dx = (getX() - p2.getX());
		double dy = (getY() - p2.getY());
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public void translater(double dx, double dy) {
		m_x = dx;
		m_y = dy;
	}
}
