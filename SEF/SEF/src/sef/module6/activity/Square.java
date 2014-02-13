package sef.module6.activity;

public  class Square extends Shape {
	
	//se o shape for um quadrado
	
	public double base;
	
	public Square () {
		
	}
	
	public Square (double base) {
		this.base = base;
	}
	
	@Override
	public double calculaterArea() {
		return base * base;
	}
	
	@Override
	public double calculaterPerimeter() {
		return 4*base;
	}
	
	/*	public double cauculaterArea(double base, double altura){
	
		double area = base * altura;
			
		return area;
	}

	public double calculaterPerimeter(double base, double base1) {
		double perimetro = base * base1;
		return perimetro;
	}
*/
	

	
}
