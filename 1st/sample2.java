public class sample2 {
    public static void main(String args[]) {
        A a = new B();
        a.func();
        a = new C();
        a.func();

        Computer C;
        C = new PC();
        C.calculate("아싸");
        C = new Workstation();
        C.calculate("아싸");

        PCA D;
        D = new PCA();
        D.calculate("order");
        D.func();

        Employee emp1, emp2;
        emp1 = new Sales();
        emp2 = new Development();
        emp1.doJob();
        emp2.doJob();
    }
}

//다형성
class A {
    public void func() { System.out.println("A");}
}

class B extends A {
    public void func() { System.out.println("B");}
}

class C extends B {
    public void func() { System.out.println("C");}
}

//인터페이스를 이용한 다형성
interface Computer {
    public void calculate(String order);
}

class PC implements Computer {
    public void calculate(String order) {
        System.out.println("PC:" + order);
    }
}

class Workstation implements Computer {
    public void calculate(String order) {
        System.out.println("Workstation:" + order);
    }
}

//extends와 implements 같이 쓰기
class PCA extends A implements Computer {
    public void calculate(String order) {
        System.out.println("A:" + order);
    }
}

// 다형성의 활용
class Employee {
    int nSalary;
    protected String szDept = null;
    public void doJob() { System.out.println("Do Something"); }
}

class Sales extends Employee {
    public Sales() {szDept = "Sales Dept"; }
    public void doJob() { System.out.println("Do Sales"); }
}

class Development extends Employee {
    public Development() {szDept = "Development Dept"; }
    public void doJob() { System.out.println("Do Development"); }
}