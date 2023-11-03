package Bodies;

abstract class Body {
    // Polar position coordinates
    private double r, theta, z;

    protected double getR() {
        return this.r;
    }
    protected double getTheta() {
        return this.theta;
    }
    protected double getZ() {
        return this.z;
    }

    protected void setR(double r) {
        this.r = r;
    }
    protected void setTheta(double theta) {
        this.theta = theta;
    }
    protected void setZ(double z) {
        this.z = z;
    }
}
