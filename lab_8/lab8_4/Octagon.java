class Octagon extends GeometricObject implements Comparable,Cloneable{
	private double side;

	public Octagon(){
		super("Black",false);
		this.side = 1;
	}

	public Octagon(double side){
		super("Black",false);
		this.side = side;
	}

	public Octagon(double side,String color,boolean filled){
		super(color,filled);
		this.side = side;
	}

	public void setSide(double side){
		this.side = side;
	}

	public double getSide(){
		return side;
	}

	public double getArea(){
		return (2 + 4/22) * side * side;
	}

	public double getPerimeter(){
		return side * 8;
	}

	@Override
	public String toString(){
		return super.toString() + "\nSide: " + side +
		"\nPerimeter: " + String.format("%.2f",getPerimeter()) +
		"\nArea: " + String.format("%.2f",getArea());
	}

	@Override
	public int compareTo(Octagon o){
		if(getArea()>o.getArea()) return 1;
		else if(getArea()==o.getArea()) return 0;
		else return -1;
	}

	@Override
	public void clone(Octagon o){
		this.side = o.getSide();
		setColor(o.getColor());
		setFilled(o.isFilled());
	}
}
