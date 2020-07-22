package uygulama3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(4.15);
		Circle circle2 = new Circle(5.55);
		
		Square square1 = new Square(5);
		Square square2 = new Square(4);
		
		alanVeCevreYazdir(circle1);
		alanVeCevreYazdir(circle2);
		alanVeCevreYazdir(square1);
		alanVeCevreYazdir(square2);
		
		ArrayList<Figure> Figures = new ArrayList<Figure>();
		Figures.add(circle1);
		Figures.add(circle2);
		Figures.add(square1);
		Figures.add(square2);
		
		sekilBilgileriYazdir(Figures);
		
	}
	
	public static void alanVeCevreYazdir(Figure sekil) {
		System.out.println("Alani : "+ sekil.getArea());
		System.out.println("Cevre : "+ sekil.getPerimeter());
	}
	
	public static void sekilBilgileriYazdir(ArrayList<Figure> sekiller){
		
		for (Figure sekil : sekiller) {
			//System.out.println(sekil);
			System.out.println("Alani : "+ sekil.getArea());
			System.out.println("Cevre : "+sekil.getPerimeter());
		}
		
	}
}
