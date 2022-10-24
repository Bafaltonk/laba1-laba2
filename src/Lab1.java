import java.util.Scanner;
// Импортируем наш класс Point3d;
import classes.Point3d;

public class Lab1 {
    public static void main(String[] args) {
        // Задача трёх трёхмерных точек.
        Scanner scanner = new Scanner(System.in);
        Point3d point1 = new Point3d(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        Point3d point2 = new Point3d(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        Point3d point3 = new Point3d(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        if (point1.compare(point2) | point1.compare(point3) | point2.compare(point3)) {
            System.out.println("Вы ввели как минимум 2 одинаковые точки, площадь не может быть найдена.");
        }
        else{
            System.out.println(computeArea(point1, point2, point3));
        }
    }
    // Создание метода для нахождения площади треугольника по 3 точкам в пространстве.
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3){
        // Ввод вспомагательных переменных.
        double a, b, c, p, s;
        a = p1.distanceTo(p2);
        b = p1.distanceTo(p3);
        c = p2.distanceTo(p3);
        p = (a+b+c)/2;
        // Нахождение площади треугольника по 3 точкам при помощи формулы Герона.
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        // Возвращение площади.
        return s;
    }
}
