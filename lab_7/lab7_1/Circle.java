class Circle extends GeometricObject{
	private double diameter;
	private double perimeter,area;

	public Circle(){
		super("Black",false);
		this.diameter = 1;
	}

	public Circle(double diameter,String color,boolean filled){
		super(color,filled);
		this.diameter = diameter;
	}

	@Override
	public double getArea(){
        return Math.PI*(diameter/2)*(diameter/2);
	}

	@Override
	public double getPerimeter(){
		return 2*Math.PI*(diameter/2);
	}

	public String toString(){
		return "\nCircle: diameter = " + diameter + 
		"\nPerimeter: " + String.format("%.2f",getPerimeter())+
		"\nArea: "+String.format("%.2f",getArea()) +
		super.toString();
	}
}
