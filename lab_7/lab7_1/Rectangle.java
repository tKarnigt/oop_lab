class Rectangle extends GeometricObject{
	private double sideA,sideB;
	private double perimeter,area;

	public Rectangle(){
		super("Black",false);
		this.sideA = 1;
		this.sideB = 1;
	}

	public Rectangle(double sideA,double sideB,String color,boolean filled){
		super(color,filled);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double getArea(){
        return sideA*sideB;
	}

	@Override
	public double getPerimeter(){
		return (sideA + sideB)*2;
	}

	public String toString(){
		return "Rectangle: side1 = " + sideA + 
		" side2 = " + sideB + "\nPerimeter: " + String.format("%.2f",getPerimeter())+
		"\nArea: "+String.format("%.2f",getArea()) +
		super.toString();
	}
}
