package extern;

//다른 패키지에서 확인하려면 public이어야 한다.
public class extension_class {
    // 같은 패키지의 다른 클래스에서 실행할 것이므로 default로 선언함
    private String in_ = "호출 장소 : BCG의 부모인 extension_class";

    // public 메소드는 선언된 클래스 내부뿐 아니라 다른 패키지의 클래스에서도 사용가능
    public String esc_public() {
        return "부모 클래스의 public 메소드";
    }

    // default 메소드는 선언된 클래스 내부부터 같은 패키지의 다른 클래스까지 사용가능
    String esc_default() {
        return "부모 클래스의 메소드";
    }

    // protected 메소드는 클래스 내부와 상속받은 클래스에서 사용가능
    protected String esc_protected() {
        return "부모 클래스의 protected 메소드";
    }

    // private 메소드는 선언된 클래스 내부에서만 사용가능
    private String esc_private() {
        return "부모 클래스의 private 메소드";
    }

    public void esc_not_main() {
        System.out.println(esc_public() + in_);
        System.out.println(esc_default() + in_);
        System.out.println(esc_protected() + in_);
        System.out.println(esc_private() + in_);
    }

}
