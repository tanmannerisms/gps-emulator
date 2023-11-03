package Bodies;

public class Satellite extends Body{
    private final IllegalArgumentException badRadius = new IllegalArgumentException(
            "Distance number invalid. Distance must be greater than " + Earth.getRadius());
    public Satellite(double r, double theta, double z) throws IllegalArgumentException{
        if (!validR(r)) {
            throw badRadius;
        } else {
            setR(r);
        }
        setTheta(theta);
        setZ(z);
    }
    public void setCoordinates(double r, double theta, double z) throws IllegalArgumentException{
        if (!validR(r)) {
            throw badRadius;
        } else {
            setR(r);
        }
        setTheta(theta);
        setZ(z);
    }
    private boolean validR(double r)  {
        return r > Earth.getRadius();
    }
}
