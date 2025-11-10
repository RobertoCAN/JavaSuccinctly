package sussinclyPart2.p39;

public class Point implements Comparable {

	public double x, y;

	public Point(double x, double y) {

		this.x = x;
		this.y = y;

		System.out.println(x + " " + y);
	}

	public void print() {
		System.out.println("X: " + x + " Y: " + y + " Mag: " + Math.sqrt(x * x + y * y));
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Point))
			return 0;

		Point otherPoint = (Point) o;

		Double thisAbsMag = Math.sqrt(x * x + y * y);
		double otherPointAbsmag = Math.sqrt(otherPoint.x * otherPoint.x + otherPoint.y * otherPoint.y);

		return thisAbsMag.compareTo(otherPointAbsmag);
	}

}
