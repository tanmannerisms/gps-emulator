package bodies;

public class Earth extends Body{
    private static Earth earthInstance = null;
    // Equatorial radius of the Earth in kilometers.
    private static final float radius = 6378.137f;

    private Earth() {
        // Assuming that the earth is the center of the polar coordinate system.
        setX(0);
        setY(0);
        setZ(0);
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
