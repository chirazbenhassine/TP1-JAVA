package fr.dauphine.javaavance.td1;


public class Circle  {
	
	private double radius;
	private Point center;
	
	public Circle(Point center,double radius) {
		this.center = center;
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	 public double area() {
		 return radius*radius*Math.PI;
		 }

	 public void translate(int dx, int dy) {
	     this.center.translate(dx, dy);
		 
	 }
	
	public boolean contains(Point p) {
		 return Math.sqrt((p.getX()-center.getX())*(p.getX()-center.getX())+(center.getY()-p.getY())-(center.getY()-p.getY()))<=radius; 
	}
	
	public boolean contains(Point p, Circle ...circles) {
		 for(Circle c : circles) {
			 if (c.contains(p)) return true;
		 }
		 return false;
	 }
	@Override
	public String toString() {
		return "Center est ("+this.center.getX()+","+this.center.getY()+") radius est "+ this.radius + " Area est "+ this.area(); 
	}
	public static void main(String[] args) {
		Circle C =new Circle(new Point(1,2), 1);
		C.translate(1, 1);
		System.out.println(C.toString());
	}
	
	

}
