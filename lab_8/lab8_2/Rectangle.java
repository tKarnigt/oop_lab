class Rectangle extends GeometricObject implements Comparable{
	private double width,height;
	private String color;
	private boolean filled;

	public Rectangle(){
		super("Black",false);
		this.width = 1;
		this.height = 1;
	}

	public Rectangle(double width,double height){
		super("Black",false);
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width,double height,String color,boolean filled){
		super(color,filled);
		this.width = width;
		this.height = height;
	}

	public double getRadius(){
		return 0;
	}

	public double getWidth(){
		return width;
	}

	public double getHeight(){
		return height;
	}

	public double getArea(){
		return width * height;
	}

	public double getPerimeter(){
		return width * 2 + height * 2;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setHeight(double height){
		this.height = height;
	}

	@Override
	public int compareTo(Rectangle o){
		if(getArea()>o.getArea()) return 1;
		else if(getArea()==o.getArea()) return 0;
		else return -1;
	}

	@Override
	public String toString(){
		return super.toString() + "\nWidth: " + String.format("%.2f",width) +
		"\nHeight: " + String.format("%.2f",height) +
		"\nPerimeter: " + String.format("%.2f",getPerimeter()) +
		"\nArea: " + String.format("%.2f",getArea());
	}
}
