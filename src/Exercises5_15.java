
class Point {
    private int x,y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int a, int b) {
        x = a;
        y = b;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public void moveTo(int a, int b){
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int a) {
        x = a;
    }
    public void setY(int a) {
        y = a;
    }
    public void setOffset(int offX, int offY){
        x+= offX;
        y+= offY;
    }
}
//Create the class Segment which has 2 points (startPoint and endPoint)
//It will have 2 constructors: with no arguments it will create 2 points (0, 0)

class Segment {
    Point startPoint, endPoint;
    public Segment() {
        Point startPoint = new Point();
        Point endPoint = new Point();
    }
    public Segment(Point a, Point b){
        this.startPoint = a;
        this.startPoint = b;
    }
}

public class Exercises5_15 {
    public static void main(String[] argv) {
        Point p = new Point(2, 3);
        System.out.println(p);
        p.moveTo(11, 1);
        System.out.println(p.toString());
    }
}
class Main2{
    public static void main(String[] argv) {
        Point p1 = new Point(4,5);
        Point p2 = new Point(6,8);
        p1.setOffset(4,4);
        p2.setOffset(4,4);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
class Main3{
    public static void main(String[] argv){
        Segment segm = new Segment();
    }
}
