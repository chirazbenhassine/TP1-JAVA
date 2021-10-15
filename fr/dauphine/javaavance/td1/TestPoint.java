package fr.dauphine.javaavance.td1;

public class TestPoint {

	public static void main(String[] args) {
		Point p=new Point();
		System.out.println("("+p.getX()+","+p.getY()+")"); //On change p.x par p.getX() et p.y par getY() 
		
		Point p1=new Point(3,2);
		System.out.println("("+p1.getX()+","+p1.getY()+")"); 
		
		//System.out.println(p1); Qst6
		//Qst8
		Point p2=new Point(5);
		System.out.println("("+p2.getX()+","+p2.getY()+")"); 
	}

}
