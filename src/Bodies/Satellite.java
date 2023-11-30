package Bodies;

public class Satellite extends Body{
    private final IllegalArgumentException badRadius = new IllegalArgumentException(
            "Distance number invalid. Distance must be greater than " + Earth.getRadius());
    public Satellite(double x, double y, double z) throws IllegalArgumentException{
        if (inValidR(x)) {
            throw badRadius;
        } else {
            setX(x);
        }
        setY(y);
        setZ(z);
    }
    public void setCoordinates(double x, double y, double z) throws IllegalArgumentException{
        if (inValidR(x)) {
            throw badRadius;
        } else {
            setX(x);
        }
        setY(y);
        setZ(z);
    }
    private boolean inValidR(double r)  {
        return !(r > Earth.getRadius());
    }
}
