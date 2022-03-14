public class sample {
    public static void main(String args[]) {

        //인터페이스를 자료형으로 사용하기
        Figure figure1, figure2, figure3;
        figure1 = new Triangle(3.0,4.0);
        figure2 = new Box(3.0,4.0);
        figure3 = new Circle(4.0);

        System.out.println(figure1.getArea());
        System.out.println(figure2.getArea());
        System.out.println(figure3.getArea());

        Triangle T1;
        T1 = new Triangle(2,1);
        // System.out.println(figure1.getHeight()); //컴파일 오류
        System.out.println(T1.getHeight());

        //인터페이스와 클래스의 형변환
        Electronics elec;
        TV tv = new TV();
        elec = tv;
        // elec.getSize(); // 컴파일 오류
        elec.turnOn(10);
        System.out.println(elec.getVoltage());
        tv.turnOn(5);
        System.out.println(tv.getVoltage());
    }
}

//인터페이스를 자료형으로 사용하기

interface Figure {
    static final double PI = 3.141592;
    double getArea();
}

class Triangle implements Figure {
    private double height, width;
    public Triangle(double h, double w) { height = h; width = w;}
    public double getArea() { return height*width*0.5; }
    public double getHeight() { return height; }
    public double getWidth() { return width; }
}

class Box implements Figure {
    private double height, width;
    public Box(double h, double w) { height = h; width = w;}
    public double getArea() { return height*width; }
}

class Circle implements Figure {
    private double radius;
    public Circle(double r) { radius = r;}
    public double getArea() { return radius*radius*PI; }
}

//인터페이스와 클래스의 형변환
class Electronics {
    private int nVoltage = 0;
    public void turnOn(int nInputVoltage) { nVoltage = nInputVoltage; }
    public void turnOff() { nVoltage = 0; }
    public int getVoltage() { return nVoltage; }
}

class TV extends Electronics {
    private int nSize = 0;
    public void setSize(int new_size) { nSize = new_size; }
    public int getSize() { return nSize; }
}


