package extern;

//다른 패키지에서 확인하려면 public이어야 한다.
public class extern_class {

    private String in_ = "호출 장소 : 외부 패키지의 extern_class 클래스";

    // public 메소드는 선언된 클래스 내부뿐 아니라 다른 패키지의 클래스에서도 사용가능
    public String ex_public() {
        return "외부 패키지에 있는 클래스의 public 메소드";
    }

    // default 메소드는 선언된 클래스 내부부터 같은 패키지의 다른 클래스까지 사용가능
    String ex_default() {
        return "외부 패키지에 있는 클래스의 메소드";
    }

    // protected 메소드는 클래스 내부와 상속받은 클래스에서 사용가능
    protected String ex_protected() {
        return "외부 패키지에 있는 클래스의 protected 메소드";
    }

    // private 메소드는 선언된 클래스 내부에서만 사용가능
    private String ex_private() {
        return "외부 패키지에 있는 클래스의 private 메소드";
    }

    public void ex_not_main() {
        System.out.println(ex_public() + in_);
        System.out.println(ex_default() + in_);
        System.out.println(ex_protected() + in_);
        System.out.println(ex_private() + in_);
    }

}
