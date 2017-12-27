package org.xjcraft;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ree on 2017/12/27.
 */
@Data
public class Line {
    Point start;
    Point end;

    List<List<Point>> points;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        points = new ArrayList<List<Point>>();
    }

    public double distance(Point point) {
        double v = start.distanceSqar(end);
        if (v == 0) return start.distance(point);
        double t = ((point.x - start.x) * (end.x - start.x) + (point.y - start.y) * (end.y - start.y)) / v;
        t = Math.max(0, Math.min(1, t));
        Point point1 = start.add(end.minus(start).multi(t));
        return point.distance(point1);
    }

    public boolean right(Line line, Point point) {
        double distance = line.distance(point);
        if (distance >= 150 && distance <= 300) {
            return true;
        }
        return false;
    }
}
