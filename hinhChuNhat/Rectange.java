package hinhChuNhat;

public class Rectange {
	private double width, height;
	private String color;
	public Rectange() {
		this.width = 1;
		this.height = 1;
	}
	public Rectange(double width, double height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		StringBuilder temp = new StringBuilder();
		temp.append(Character.toUpperCase(color.charAt(0)));
		for (int i=1; i<color.length();i++) {
			temp.append(Character.toLowerCase(color.charAt(i)));
		}
		return temp.toString().trim();
	}
	public void setColor() {
		this.color = color;
	}
	public double findArea() {
		return getHeight() * getWidth();
	}
	public double findPerimeter() {
		return (getHeight() + getWidth()) * 2;
	}
	@Override
	public String toString() {
		return String.format("%d",Math.round(findPerimeter())) + " " + Math.round(findArea()) + " " +  getColor();
	}
}
