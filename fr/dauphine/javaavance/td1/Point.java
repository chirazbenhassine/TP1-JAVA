package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;
	//Exercice2 Qst1
	//Point p=new Point();
	//System.out.println(p.x+" "+p.y);
	
	//Qst4
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//constructeur par défaut
	public Point() {
	}
	//Qst5 et 6
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//Qst8
	public Point(int x) {
		this.x = x;
	}
	//Exercice3
	//Qst2
	private boolean isSameAs(Point obj) {
		 return (obj instanceof Point) && 
				  ((Point)obj).getX()==(this.x) && 
				  ((Point)obj).getY()==(this.y);
	}
	public static void main(String[] args) {
		
		 Point p1=new Point(1,2);
		 //Point p2=p1;
		 Point p2=new Point(1,2);
		 Point p3=new Point(1,2);
		 //System.out.println(p1==p2);
		 //System.out.println(p1==p3);
		 System.out.println(p1.isSameAs(p2));
		 System.out.println(p1.isSameAs(p3));
	//Qst3
		 ArrayList<Point> list = new ArrayList<>();
		 list.add(p1);
		 list.add(p3);
		 list.add(p2);
		 System.out.println(list.indexOf(p2));
		 System.out.println(list.indexOf(p3));
		 System.out.println(list.indexOf(p1));
	}
	
	
	
	}
	
	
	


