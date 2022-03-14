public class anonymousClass {
    public static void main(String args[]) {
        //익명 클래스
        CSuper sub = new CSuper() {
            public int b = 20;
            public void method1() { System.out.println("sub1"); }
            public void method3() { System.out.println("sub3"); }
        };

        MyInterface subIn = new MyInterface() {
            public void method() {
                System.out.println("subIn");
            }
        };
        subIn.method();

        sub.method1();
        sub.method2();
        System.out.println(sub.a);

        //sub.method3();
        //system.out.println(sub.b);
    }
}

class CSuper {
    public int a = 10;
    public void method1() {
        System.out.println("super1");
    }
    public void method2() {
        System.out.println("super2");
    }
}


// class CSub extends CSuper {
//     public int b = 20;
//     public void method1() {
//         System.out.println("sub1");
//     }
//     public void method3() {
//         System.out.println("sub3");
//     }
// }

interface MyInterface {
    public void method();
}