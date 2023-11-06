package bodies;

abstract class Body {
    // Polar position coordinates
    private double x, y, z;

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getZ() {
        return this.z;
    }

    protected void setX(double x) {
        this.x = x;
    }
    protected void setY(double y) {
        this.y = y;
    }
    protected void setZ(double z) {
        this.z = z;
    }
}
