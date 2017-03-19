package semester2.interfaces;

public class Square implements Polygone {
	
	private double side;
	
	public Square(double side){
		this.side = side;
	}
	
	public void displaySide(){
		System.out.println("side = " + this.side);
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getPerimetter(){
		return this.side * 4;
	}
	
	public double getArea(){
		return this.side * this.side;
	}
}
