package classes;
import classes.Point2d;

// Класс для трёхмерной точки.
public class Point3d extends Point2d{
    // Создание внутренних переменных класса.
    private double zCoord;
    // Конструктор инициализации.
    public Point3d (double x, double y, double z){
        super(x, y);
        this.zCoord = z;
    }
    // Конструктор по умолчанию.
    public Point3d(){
        this(0.0, 0.0, 0.0);
    }
    // Возвращение аргумента z.
    public double getZ(){
        return zCoord;
    }
    // Установка аргумента z.
    public void setZ(double value){
        zCoord = value;
    }
    // Метод сравнения двух точек.
    public boolean compare(Point3d point){
        return(super.compare(point) & zCoord == point.getZ());
    }
    // Метод для расстояния между двумя точками.
    public double distanceTo(Point3d point) {
        // Ввод вспомагательных переменных.
        double dx, dy, dz;
        dx = Math.abs(getX() - point.getX());
        dy = Math.abs(getY() - point.getY());
        dz = Math.abs(getZ() - point.getZ());
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2));
    }
}
