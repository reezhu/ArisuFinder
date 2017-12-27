import org.xjcraft.ArisuFinder;
import org.xjcraft.Line;
import org.xjcraft.Point;

/**
 * Created by Ree on 2017/12/27.
 */
public class Test {
    @org.junit.Test
    public void main(){
        Line line = new Line(new Point(0, 0), new Point(0, 1));
//        Point point = new Point(1, 2);
        long a = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            double distance = line.distance(new Point(Math.random()*1000, Math.random()*1000));
        }
        long b = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            new Point(Math.random()*1000, Math.random()*1000);
        }
        long c = System.currentTimeMillis();
        System.out.println("time:"+((b-a)-(c-b)));

    }

    @org.junit.Test
    public void test(){
        long a = System.currentTimeMillis();
        ArisuFinder.main();
        long b = System.currentTimeMillis();
        System.out.println("time:"+(b-a)+" millis");
    }
}
