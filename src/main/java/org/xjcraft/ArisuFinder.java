package org.xjcraft;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ree on 2017/12/27.
 */
public class ArisuFinder {
    public static void main() {
        List<Line> lines = loadLines();
        List<List<Point>> lists = loadPoints();
        for (int i = 0; i < lists.size(); i++) {
            for (Point point : lists.get(i)) {
                for (Line line : lines) {
                    if (line.getPoints().size() >= i && line.right(line, point)) {
                        if (line.getPoints().size() == i) {
                            line.getPoints().add(new ArrayList<Point>() {{
                                add(point);
                            }});
                        } else {
                            line.getPoints().get(i).add(point);
                        }
                    }
                }
            }
        }
        for (Line line : lines) {
            if (line.getPoints().size() == lists.size())
                System.out.println(line.toString());
        }
    }

    private static List<List<Point>> loadPoints() {
        ArrayList<List<Point>> list = new ArrayList<List<Point>>();
        list.add(new ArrayList<Point>() {{
            add(new Point(100, 200));
            add(new Point(1000, 200));
            add(new Point(200, 200));
        }});
        return list;

    }

    private static List<Line> loadLines() {
        ArrayList<Line> lines = new ArrayList<Line>() {{
            add(new Line(new Point(0, 0), new Point(0, 10000)));
            add(new Line(new Point(0, 0), new Point(10000, 0)));
        }};

        return lines;
    }


}
