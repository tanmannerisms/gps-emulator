package Bodies;

public class Earth extends Body{
    private static Earth earthInstance = null;
    // Equatorial radius of the Earth in meters.
    private static final double radius = 6378.137d;

    private Earth() {
        // Assuming that the earth is the center of the polar coordinate system.
        this.r = 0;
        this.theta = 0;
        this.z = 0;
    }
    public static synchronized Earth getInstance() {
        if (earthInstance == null) {
            earthInstance = new Earth();
        }
        return earthInstance;
    }
    public static double getRadius() {
        return radius;
    }
}
