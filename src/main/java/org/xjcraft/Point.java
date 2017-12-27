package org.xjcraft;

import lombok.Data;

/**
 * Created by Ree on 2017/12/27.
 */
@Data
public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceSqar(Point point) {
        return Math.pow(x - point.getX(), 2) + Math.pow(y - point.getY(), 2);
    }

    public double distance(Point point) {
        return Math.sqrt(distanceSqar(point));
    }

    public Point add(Point point) {
        return new Point(point.getX() + x, point.getY() + y);
    }

    public Point minus(Point point) {
        return new Point(x + point.getX(), y + point.getY());
    }

    public double dot(Point point) {
        return x * point.getX() + y * point.getY();
    }

    public Point multi(double i) {
        return new Point(x * i, y * i);
    }


}
