package internal;

class internal_class {
    private String in_ = "호출 장소 : BCG 외부의 같은 패키지의 internal_class 클래스";

    // public 메소드는 선언된 클래스 내부뿐 아니라 다른 패키지의 클래스에서도 사용가능
    public String ic_public() {
        return "같은 패키지의 외부 클래스의 public 메소드";
    }

    // default 메소드는 선언된 클래스 내부부터 같은 패키지의 다른 클래스까지 사용가능
    String ic_default() {
        return "같은 패키지의 외부 클래스의 default 메소드";
    }

    // protected 메소드는 클래스 내부와 상속받은 클래스에서 사용가능
    protected String ic_protected() {
        return "같은 패키지의 외부 클래스의 protected 메소드";
    }

    // private 메소드는 선언된 클래스 내부에서만 사용가능
    private String ic_private() {
        return "같은 패키지의 외부 클래스의 private 메소드";
    }

    public void not_main() {
        System.out.println(ic_public() + in_);
        System.out.println(ic_default() + in_);
        System.out.println(ic_protected() + in_);
        System.out.println(ic_private() + in_);
    }
}
