public class ArrayAndString {
    public static void main(String args[]) {
        //Java의 배열은 참조형으로 C++과는 작동방식이 다르다.
        
        /*배열의 선언 */

        //아래와 같이 두가지 방식으로 1차원 배열을 선언할 수 있다
        int Arr1[]; int[] Arr2;

        //아래의 3가지 방법으로 2차원 이상의 배열을 선언할 수 있다.
        //하지만 마지막 방법은 가시성이 떨어지므로 추천되지 않는다.
        int[][] arrArr1; int arrArr2[][]; int[] arrArr3[];

        /* 배열을 생성할 때 크기를 지정할 수 없음에 주의하자.
        int Arr3[10]; */

        /* 초기화나 생성 전에는 배열을 사용할 수 없음에 주의하자.
        Arr1[0] = 0; */

        /* 배열의 생성 
        배열의 생성이란 배열에 메모리 영역을 할당하는 것을 의미한다.*/

        //선언된 배열에 공간을 할당할 수 있다.
        Arr1 = new int[1];
        arrArr1 = new int[2][3];

        //배열을 선언하며 공간을 할당할 수 있다.
        int Arr3[] = new int[4];
        int arrArr4[][] = new int[5][6];

        /* 배열의 초기화
        배열에 초기값을 지정하는 것을 초기화라고 한다. */

        //선언과 동시에 초기화하면 자동으로 메모리 공간이 잡힌다.
        int Arr4[] = {1,2,3,4};
        int arrArr5[][] = {{1,2},{3,4},{5,6}};

        /*선언과 동시에 초기화 해야한다.
        int Arr5[];
        Arr5 = {1,2,3,4,5}; */

        /* 생성된 공간에 초기값을 넣는 것은 허용되지 않는다.
        Arr1 = {1};
        arrArr1 = {{1,2,3},{4,5,6}}; */

        //'배열 이름.length'메소드를 통해 배열의 크기를 확인할 수 있다.
        //생성만 한 경우 이런 방식으로 초기화를 해야할 것이다.
        for (int i = 0; i < Arr3.length; i++) {
            Arr3[i] = i;
        }

        //2차원 배열은 다음과 같이 초기화 할 수 있다.
        for (int i = 0; i < arrArr4.length; i++) {
            for (int j = 0; j < arrArr4[i].length; j++) {
                arrArr4[i][j] = 2*i + j;
            }
        }

        //1차원 배열을 읽을 때는 for-each문을 사용할 수 있다.
        for (int el : Arr3) {
            System.out.print(el);
            System.out.print(" ");
        }

        System.out.print("\n");


        //2차원 이상의 배열은 for-each문으로 접근할 수 없다.
        //type mismatch: cannot convert from element type int[] to int
        for (int i = 0; i < arrArr4.length; i++) {
            for (int it : arrArr4[i]) {
                System.out.print(it);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        //JAVA의 문자열은 String클래스로 사용할 수 있다.
        String hi = new String("hi");

        //String 클래스는 참조형이지만 기본형처럼 초기화가 가능하다.
        String hello = "hello";

        //선언 후 초기화도 가능하다.
        String bye;
        bye = "bye";

        //대입도 가능하다.
        hi = bye;

        //JAVA는 연산자 오버로딩 기능을 제공하지 않지만 '+' 연산자는 String 클래스에 대해 정의되어 있다.
        hi = hello + "안녕";

        /* String 클래스와 char형 배열은 다르다.
        type mismatch: cannot convert from String to char[]
        char[] strArr = "hi"; */
    }
}
