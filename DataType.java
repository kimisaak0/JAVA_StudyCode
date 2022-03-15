/** 주석은 3가지 방법으로 작성할 수 있는데, 
 * 이와 같은 형식은 'javadoc'을 이용하여 메뉴얼을 자동으로 생성되는데 사용된다. 
 * 이 외에 여러줄 주석과 한줄 주석은 C++ 과 같다.
*/
public class DataType {
    //메인 함수를 포함하는 클래스는 코드 파일의 최상단에 있어야 한다.
    public static void main(String args[]) {        // 메인 함수 정의 방법
        System.out.println("Hello, Java");          // 기본 출력 메소드 사용 방법

        //기본 자료형 정수형 4가지
        byte min_byte_int = Byte.MIN_VALUE, max_byte_int = Byte.MAX_VALUE; //1byte (-128 ~ 127)
        short min_short_int = Short.MIN_VALUE, max_short_int = Short.MAX_VALUE; //2byte (-32768 ~ 32767)
        int min_int = Integer.MIN_VALUE, max_int = Integer.MAX_VALUE; //4byte (약 21억)
        long min_long_int = Long.MIN_VALUE, max_long_int = Long.MAX_VALUE; //8byte (약 922경)

        System.out.print("가장 작은 byte형 정수 : " + min_byte_int); System.out.println("  가장 큰 byte형 정수 : " + max_byte_int);
        System.out.print("가장 작은 short형 정수 : " + min_short_int); System.out.println("  가장 큰 short형 정수 : " + max_short_int);
        System.out.print("가장 작은 int형 정수 : " + min_int); System.out.println("  가장 큰 int형 정수 : " + max_int);
        System.out.print("가장 작은 long형 정수 : " + min_long_int); System.out.println("  가장 큰 long형 정수 : " + max_long_int);

        //정수는 0으로 시작하면 8진수, 0x로 시작하면 16진수가 된다.
        System.out.println("10진수 표현 : " + 255 + " 8진수 표현 : " + 0377 + " 16진수 표현 : " + 0xFF);

        // 4byte 실수, float상수는 3.4f 라고 표시한다.
        float min_value_float = Float.MIN_VALUE, min_normal_float = Float.MIN_NORMAL, max_value_float = Float.MAX_VALUE;
        System.out.println("float형 실수 중 가장 작은 비정규화된 양수 : " + min_value_float); 
        System.out.println("float형 실수 중 가장 작은 정규화된 양수 : " + min_normal_float); 
        System.out.println("가장 큰 float형 실수 : " + max_value_float);


        // 4byte 실수, float상수는 3.4f 라고 표시한다.
        double min_value_double = Double.MIN_VALUE, min_normal_double = Double.MIN_NORMAL, max_value_double = Double.MAX_VALUE;
        System.out.println("double형 실수 중 가장 작은 비정규화된 양수 : " + min_value_double); 
        System.out.println("double형 실수 중 가장 작은 정규화된 양수 : " + min_normal_double); 
        System.out.println("가장 큰 double형 실수 : " + max_value_double);

        //자바에는 무한대가 상수로 정의되어 있다.
        //실수의 연산에서는 0으로 나눌시 무한대를 리턴하고 이에대한 오류가 발생하지 않는다.
        double plusInf = Double.POSITIVE_INFINITY, minusInf = Double.NEGATIVE_INFINITY, nan = Double.NaN;
        System.out.println("양의 무한대 : " + plusInf + " n/0  (n은 실수) : " + 1.0/0);
        System.out.println("음의 무한대 (-n/0): " + minusInf + " -n/0 : (n은 실수) : " + -1.0/0);
        System.out.println("NaN : " + nan + " 0.0/0 : " + 0.0/0);

        //C와는 다르게 유니코드로 표현하며 기호없는 정수형과 호환된다.
        char ch0000 = '\u0000', chFFFF = '\uFFFF', chA = 'A';
        System.out.println("JAVA는 문자를 유니코드로 표현한다. " + chA + "는 정수로는 " + (int)chA + "이다.");
        System.out.print("char형은 기호없는 정수형이기도 하다 : " + (int)ch0000); System.out.println(" ~ " + (int)chFFFF); 

        //true, false 값은 소문자로 쓴다.
        //C/C++에서는 정수 0이 거짓이고, 0이 아닌 정수는 참을 의미했지만 JAVA에서는 boolean값만 참, 거짓을 나타낼 수 있다.
        //정수형을 논리형으로, 논리형을 정수형으로 형변환하는 것은 허용되지 않는다.
        boolean T = true, F = false;
        System.out.println("boolean 참 : " + T + ", 거짓 : " + F);
    }
}
