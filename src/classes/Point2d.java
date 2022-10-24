package classes;

public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d (double x, double y){
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point2d(){
        this(0, 0);
    }

    public double getX(){
        return xCoord;
    }

    public double getY(){
        return yCoord;
    }

    public void setX(double val){
        this.xCoord = val;
    }

    public void setY(double val){
        this.yCoord = val;
    }

    public boolean compare(Point2d point){
        return (xCoord == point.getX() & yCoord == point.getY());
    }
}
