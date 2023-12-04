package math;

import bodies.Satellite;

import java.util.Arrays;

public class Trilateration {
	// Lightspeed constant measured in meters per second.
	private static final int LIGHTSPEED = 299792458;
	public static void calculate(Satellite sat1, Satellite sat2, Satellite sat3, Satellite sat4,
								 float time1, float time2, float time3, float time4)
	{
		double x1, x2, x3, x4, y1, y2, y3, y4, z1, z2, z3, z4;

		x1 = sat1.getX();
		y1 = sat1.getY();
		z1 = sat1.getZ();

		x2 = sat2.getX();
		y2 = sat2.getY();
		z2 = sat2.getZ();

		x3 = sat3.getX();
		y3 = sat3.getY();
		z3 = sat3.getZ();

		x4 = sat4.getX();
		y4 = sat4.getY();
		z4 = sat4.getZ();

		float d1 = (int) (time1 * LIGHTSPEED);
		float d2 = (int) (time2 * LIGHTSPEED);
		float d3 = (int) (time3 * LIGHTSPEED);
		float d4 = (int) (time4 * LIGHTSPEED);

		double A, B, C, D, E, F, G, H, I, J, K, L;

		A = 2 * x2 - 2 * x1;
		B = 2 * y2 - 2 * y1;
		C = 2 * z2 - 2 * z1;
		D = Math.pow(d1, 2) - Math.pow(d2, 2) - Math.pow(x1, 2) + Math.pow(x2, 2) - Math.pow(y1, 2) + Math.pow(y2, 2) - Math.pow(z1, 2) + Math.pow(z2, 2);
		E = 2 * x3 - 2 * x2;
		F = 2 * y3 - 2 * y2;
		G = 2 * z3 - 2 * z2;
		H = Math.pow(d2, 2) - Math.pow(d3, 2) - Math.pow(x2, 2) + Math.pow(x3, 2) - Math.pow(y2, 2) + Math.pow(y3, 2) - Math.pow(z2, 2) + Math.pow(z3, 2);
		I = 2 * x4 - 2 * x3;
		J = 2 * y4 - 2 * y3;
		K = 2 * z4 - 2 * z3;
		L =  Math.pow(d3, 2) - Math.pow(d4, 2) - Math.pow(x3, 2) + Math.pow(x4, 2) - Math.pow(y3, 2) + Math.pow(y4, 2) - Math.pow(z3, 2) + Math.pow(z4, 2);

		double[][] matrix = {{A, B, C, D}, {E, F, G, H}, {I, J, K, L}};
		int maxIndex = 0;

		for (int col = 0; col < matrix[0].length - 1; col++) {
			System.out.println(Arrays.deepToString(matrix));
			for (int row = col + 1; row < matrix.length; row++) {
				if (Math.abs(matrix[row][col]) > Math.abs(matrix[maxIndex][col])) {
					maxIndex = row;
				}
			}

			if (matrix[maxIndex][col] == 0) continue;

			double[] tempRow = matrix[maxIndex];
			matrix[maxIndex] = matrix[col];
			matrix[col] = tempRow;

			for (int row = 0; row < matrix.length; row++) {
				if (row == col || matrix[row][col] == 0) continue;
				double multiplier = matrix[row][col] / matrix[col][col];
				for (int i = col; i < matrix[0].length; i++) {
					matrix[row][i] -= multiplier * matrix[col][i];
				}
			}
		}




//		double circleA = getCircumference(d1);
//		double circleB = getCircumference(d2);
//		double circleC = getCircumference(d3);
//		double circleD = getCircumference(d4);
	}

	private static double getCircumference(int distance) {
		final double circumference;
		circumference = 2 * Math.PI * distance;
		return circumference;
	}

}
