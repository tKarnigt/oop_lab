class Triangle extends GeometricObject{
	private double sideA,sideB,sideC;
	private double perimeter,area;

	public Triangle(){
		super("Black",false);
		this.sideA = 1;
		this.sideB = 1;
		this.sideC = 1;
	}

	public Triangle(double sideA,double sideB,double sideC,String color,boolean filled){
		super(color,filled);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double getArea(){
		double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}

	@Override
	public double getPerimeter(){
		return sideA + sideB + sideC;
	}

	public String toString(){
		return "Triangle: side1 = " + sideA + 
		" side2 = " + sideB + " side3 = " + sideC + "\nPerimeter: " + String.format("%.2f",getPerimeter())+
		"\nArea: "+String.format("%.2f",getArea()) +
		super.toString();
	}
}
