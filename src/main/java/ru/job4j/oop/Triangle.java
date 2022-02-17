package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point first, Point second, Point three) {
        a = first;
        b = second;
        c = three;
    }

    public double semiPerimeter(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ((ab + ac) > bc && (ab + bc) > ac && (bc + ac) > ab);
    }

    public double area() {
        double area = -1;
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        if (exist(ab, ac, bc)) {
           double  p = semiPerimeter(ab, ac, bc);
            area = sqrt(p * (p - ab) *  (p - ac) * (p - bc));
        }
        return area;
    }
}
