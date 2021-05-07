package entities;

public class Ball {

	private Float x;
	private Float y;
	private Integer radius;
	private Float xDelta;
	private Float yDelta;
	
	public Ball(Float x, Float y, Integer radius, Float xDelta, Float yDelta) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xDelta = xDelta;
		this.yDelta = yDelta;
	}
	
	public Float getX() {
		return x;
	}
	public void setX(Float x) {
		this.x = x;
	}
	
	public Float getY() {
		return y;
	}
	public void setY(Float y) {
		this.y = y;
	}
	
	public Integer getRadius() {
		return radius;
	}
	public void setRadius(Integer radius) {
		this.radius = radius;
	}
	
	public Float getXDelta() {
		return xDelta;
	}
	public void setXDelta(Float xDelta) {
		this.xDelta = xDelta;
	}
	
	public Float getYDelta() {
		return yDelta;
	}
	public void setYDelta(Float yDelta) {
		this.yDelta = yDelta;
	}
	
	public void move() {
		x += xDelta;
		y += yDelta;
	}
	
	public void reflectHorizontal() {
		xDelta = -xDelta;
	}
	
	public void reflextVertical() {
		yDelta = -yDelta;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ball[(");
		sb.append(x + "," + y);
		sb.append("),speed=(");
		sb.append(xDelta + "," + yDelta);
		sb.append(")]");
		return sb.toString();
	}
}
