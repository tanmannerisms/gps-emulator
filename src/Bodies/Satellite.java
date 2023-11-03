package Bodies;

public class Satellite extends Body{
    private final IllegalArgumentException badRadius = new IllegalArgumentException(
            "Distance number invalid. Distance must be greater than " + Earth.getRadius());
    public Satellite(double r, double theta, double z) {
        if (r < Earth.getRadius()) {
            throw badRadius;
        } else {
            this.r = r;
        }
        this.theta = theta;
        this.z = z;
    }
}
