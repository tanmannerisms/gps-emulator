import Bodies.Earth;
import Bodies.Satellite;
import math.Trilateration;

public class Main {

	public static void main(String[] args) {
		// GPS satellite on opposite side of Prime Meridian and above the equator at the average orbit altitude in km.
		final Satellite GPS1 = new Satellite(20200 + Earth.getRadius(), Math.PI, 0);
	}
}
