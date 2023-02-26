class Circle extends GeometricObject implements Comparable{
	private double radius;
	private String color;
	private boolean filled;

	public Circle(){
		super("Black",false);
		this.radius = 1;
	}

	public Circle(double radius){
		super("Black",false);
		this.radius = radius;
	}

	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public double getHeight(){
		return 0;
	}

	public double getWidth(){
		return 0;
	}

	public double getArea(){
		return Math.PI * radius * radius;
	}

	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	@Override
	public int compareTo(Rectangle o){
		if(getArea()>o.getArea()) return 1;
		else if(getArea()==o.getArea()) return 0;
		else return -1;
	}

	@Override
	public String toString(){
		return super.toString() + "\nRadius: " + String.format("%.2f",radius) +
	
		"\nPerimeter: " + String.format("%.2f",getPerimeter()) +
		"\nArea: " + String.format("%.2f",getArea());
	}
}
