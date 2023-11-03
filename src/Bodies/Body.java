package Bodies;

public abstract class Body {
    // Polar position coordinates
    protected double r, theta, z;

    public double getR() {
        return r;
    }
    public double getTheta() {
        return theta;
    }
    public double getZ() {
        return z;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void setTheta(double theta) {
        this.theta = theta;
    }
    public void setZ(double z) {
        this.z = z;
    }
}
