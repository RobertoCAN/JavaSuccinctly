package circle;

public class Circle {

	private float radius;
	private String name;
	private float lineWidth;
	private static int circleCount;

	public Circle() {
		this.radius = 0.0f;
		this.name = "Sem nome";
		this.lineWidth = 0.0f;
		circleCount++;
	}

	// segundo argumento do construtor
	public Circle(String name, float radius) {
		this.radius = radius;
		this.name = name;
		this.lineWidth = 0.0f;
		circleCount++;
	}

	// Methods

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void print() {
		System.out.println("Circle: " + name + "Rad: " + radius);
	}

	protected void setLineWidth(float lineWidth) {
		this.lineWidth = lineWidth;
	}

	public static void zeroCount() {
		circleCount = 0;
	}
	
	public static int getCount() {
		return circleCount;
	}
}
