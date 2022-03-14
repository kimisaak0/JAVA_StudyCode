public class sample {
    public static void main(String args[]) {
        Triangle T1 = new Triangle(2,3);
        Box B1 = new Box(3,4);
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);

        p1.add(p2);
        
        p1.printPoint();
        p2.printPoint();

        Point p = Point.add(p1, p2);

        p.printPoint();

        System.out.println(T1.getArea());
        System.out.println(B1.getArea());

        Circle c = new Circle(2);
        c.getClassName();

        T1.getClassName();
    }
}



interface Movable {
    void add(double dx, double dy);
    void sub(double dx, double dy);
}

interface Scalable {
    void mul(double s);
    void div(double s);
}

class Point implements Movable, Scalable {
    public double x, y;

    public Point() { //기본 생성자
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) { //초기화 생성자
        this.x = x;
        this.y = y;
    }

    public void add(double dx, double dy) { //점을 일정거리 만큼 이동
        x += dx; y += dy;
    }

    public void add(Point p1) {             //점에 다른 점을 더함
        this.x += p1.x; this.y += p1.y;
    }

    //점끼리 더하는 static 연산
    static public Point add(Point p1, Point p2) {
        Point rp = new Point();
        rp.x = p1.x + p2.x;
        rp.y = p1.y + p2.y;
        return rp;
    }

    public void sub(double dx, double dy) {
        x -= dx; y -= dy;
    }
    public void mul(double s) {
        x *= s; y *= s;
    }
    public void div(double s) {
        x /= s; y /= s;
    }

    public void printPoint() {
        System.out.println("x : " + this.x + " y : " + this.y);
    }

    //점을 프린트하는 static 연산
    static public void printPoint(Point p) {
        System.out.println("x : " + p.x + " y : " + p.y);
    }
}

interface Figure {
    double getArea();
    default void getClassName() {
        System.out.println(this.getClass().getSimpleName());
    }
}


abstract class Shape implements Figure {
    public double height, width;

    public Shape(double h, double w) {
        height = h;
        width = w;
    }

    public void setHeight(double h) { height = h; }
    public void setWidth(double w) { width = w;}
    public double getHeight() { return height; }
    public double getWidth() { return width; }

    public abstract double getArea();
}

class Triangle extends Shape {
    public Triangle(double h, double w) {
        super(h,w);
    }
    public double getArea() {
        return height * width * 0.5;
    }
}

class Box extends Shape {
    public Box (double h, double w) { super(h,w); }
    public double getArea() { return height * width; }
}

class Circle implements Figure {
    private double radius;
    public Circle(double r) {
        radius = r;
    }
    public double getArea() {
        return radius * radius * 3.141592;
    }
}