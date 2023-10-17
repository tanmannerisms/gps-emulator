package math;

public class Trilateration {
	// Lightspeed constant measured in meters per second.
	private static final int LIGHTSPEED = 299792458;
	public static void calculate(float timeA, float timeB, float timeC) {
		int distanceA = (int) (timeA * LIGHTSPEED);
		int distanceB = (int) (timeB * LIGHTSPEED);
		int distanceC = (int) (timeC * LIGHTSPEED);

		double circleA = getCircumference(distanceA);
		double circleB = getCircumference(distanceB);
		double circleC = getCircumference(distanceC);
	}

	private static double getCircumference(int distance) {
		final double circumference;
		circumference = 2 * Math.PI * distance;
		return circumference;
	}

}
