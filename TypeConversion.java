public class TypeConversion {
    public static void main(String args[]) {
        /* 묵시적 형변환
        같은 유형의 자료형끼리 대입할 경우 작은 것은 큰 것에 넣을 수 있지만,
        큰 것은 작은 것에 넣을 수 없다. */

        //자바의 정수형 4가지는 byte가 제일 작고, long이 제일 크다.
        byte b = 0; short s = 0; int i = 0; long l = 0;
        
        l = i; l = s; l = b; i = s; i = b; s = b; //가능
        /* Type mismatch: cannot convert from short to byte
        b = s; b = i; b = l; s = i; s = l; i = l; */

        float f = 0.0f; double d = 0.0;

        d = f; //가능
        /* Type mismatch: cannot convert from double to float
        f = d; */

        //실수형에 정수형을 대입시 자동으로 형변환이 일어난다.
        d = l; f = l; 
        /* 하지만 그 반대는 일어나지 않는다.
        l = d; */
        
        char c = 'a';

        //문자형은 unsigned int 취급을 받으므로 크기적으로 int 형과 같다.
        d = c; f = c; l = c; i = c; 
        
        /* 그러므로 byte나 short으로는 변환되지 않는다.
        s = c; b = c; */
        
        /* 정수나 실수를 char형으로도 변환되지 않는다.
        c = b; c = s; ... c = d; */

        /* 그렇다면 명시적 형변환은 어떨까? 
        자료의 손실을 감안해야하지만 대부분 가능하다.*/
        b = (byte)l; 

        /* 심지어 double을 byte에 대입하거나 char를 byte에 대입할 수도 있다. */
        b = (byte)d; b = (byte)c; 
        
        boolean bool = true;
        /* boolean type은 다른 type과 호환되지 않는다. 
        bool = b; b = bool; */

        /* boolean type은 명시적으로 형변환을 해도 다른 type과 호환되지 않는다. 
        b = (byte)bool; bool = (boolean)b; bool = (boolean)i; */
    }
}
