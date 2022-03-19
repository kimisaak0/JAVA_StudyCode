package internal;

import extern.*;

//자바에서는 하나의 파일에 하나의 public class가 있어야 한다.
//그리고 파일명과 pubilc클래스의 명칭이 같아야 한다.
//그러므로 자바에서는 "하나의 public class는 하나의 파일이다."라는 명제는 항상 참이다.
//하지만 그 역인 "하나의 파일은 하나의 pulic class이다"라는 명제는 참이 아닐 수도 있다
//이 public클래스는 파일의 최상위에 위치해야한다.

public class BCG extends extension_class {

    // main함수는 프로그램의 시작점이다.
    // main함수의 위치는 실행하려는 파일의 public 클래스 안이어야 한다.
    // main함수는 public 함수이면서 static 함수여야 한다.
    // 또한 반환값은 void, 인자는 String 한개여야 한다고 정해져 있다.
    public static void main(String args[]) {
        // 함수들은 static이 아니므로 static함수인 main함수에서 사용하려면 클래스의 인스턴스를 만들고 그 인스턴스에서 호출해야한다.
        // in_ 멤버변수는 static으로 만들었으므로 바로 static함수인 main함수에서 사용할 수 있다.
        BCG thisBCG = new BCG();
        System.out.println(thisBCG.BCG_public() + in_);
        System.out.println(thisBCG.BCG_protected() + in_);
        System.out.println(thisBCG.BCG_default() + in_);
        System.out.println(thisBCG.BCG_private() + in_);
        System.out.println();

        internal_class icInstance = new internal_class();
        System.out.println(icInstance.ic_public() + in_);
        System.out.println(icInstance.ic_protected() + in_);
        System.out.println(icInstance.ic_default() + in_);
        // private 메소드는 선언된 클래스에서만 사용 가능하다.
        // System.out.println(icInstance.ic_private() + in_);
        System.out.println();

        icInstance.not_main();
        System.out.println();

        extension_class escInstance = new extension_class();
        System.out.println(escInstance.esc_public() + in_);
        // protected 메소드는 상속받은 클래스에서 쓸 수 있지만 부모 클래스의 인스턴스임을 명확하게 해야한다.
        // System.out.println(escInstance.esc_protected() + in_);
        // 즉 자식 클래스에서 부모 클래스의 메소드를 호출해야한다.
        System.out.println(thisBCG.esc_protected() + in_);
        // default 메소드는 같은 패키지의 클래스에서만 사용 가능하다.
        // System.out.println(escInstance.esc_default() + in_);
        // private 메소드는 선언된 클래스에서만 사용 가능하다.
        // System.out.println(icInstance.ic_private() + in_);
        System.out.println();

        escInstance.esc_not_main();
        System.out.println();

        extern_class exInstance = new extern_class();
        System.out.println(exInstance.ex_public() + in_);
        // protected 메소드는 상속받은 클래스에서 쓸 수 있다.
        // System.out.println(exInstance.ex_protected() + in_);
        // extern_class는 상속받지 않았으므로 나오지 않는다.
        // System.out.println(thisBCG.ex_protected() + in_);
        // default 메소드는 같은 패키지의 클래스에서만 사용 가능하다.
        // System.out.println(exInstance.ex_default() + in_);
        // private 메소드는 선언된 클래스에서만 사용 가능하다.
        // System.out.println(exInstance.ex_private() + in_);
        System.out.println();

        exInstance.ex_not_main();
        System.out.println();
    }

    // 같은 클래스의 함수인 main함수에서만 실행할 것이므로 private로 선언함.
    private static String in_ = "호출 장소 : BCG 내부";

    // public 메소드는 선언된 클래스 내부뿐 아니라 다른 패키지의 클래스에서도 사용가능
    public String BCG_public() {
        return "public 클래스의 public 메소드";
    }

    // protected 메소드는 클래스 내부와 같은 패키지의 다른 클래스, 이 클래스를 상속받은 다른 패키지의 클래스에서 사용가능
    protected String BCG_protected() {
        return "public 클래스의 protected 메소드";
    }

    // default 메소드는 선언된 클래스 내부부터 같은 패키지의 다른 클래스까지 사용가능
    String BCG_default() {
        return "public 클래스의 메소드";
    }

    // private 메소드는 선언된 클래스 내부에서만 사용가능
    private String BCG_private() {
        return "public 클래스의 private 메소드";
    }

}
