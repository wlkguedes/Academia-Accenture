package sef.module6.activity;

 public abstract class Shape {

	public String color;
	public double base;
	public double altura;
	
	public Shape() {
	}
	
	// Complete the code and Add abstract method calculateArea() and calculatePerimeter() with return type as double
	public abstract double calculaterArea();
	public abstract double calculaterPerimeter();
	
	public Shape(double base, double altura ){
		
		this.base = base;
		this.altura = altura;
		
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	public String getColor() {
		return color;
	}
	public void setBase(double base){
		this.base = base;
	}
	public double getBase(){
		return base;
	}
	public void setAltura(double altura){
		this.altura=altura;
	}
	public double setAltura(){
		return altura;
	}
	
	

}
