//Scanner 클래스는 util 패키지에 포함되어 있다.
import java.util.Scanner;

public class BasicIOStream {
    public static void main(String args[]) {
        //JAVA에서 터미널에 출력하는 방법
        System.out.println("문장을 입력하세요.");
        //JAVA에서 터미널로 입력을 받는 방법
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        String ott = "true";
        while (sc.hasNextLine()){
            ott = sc.nextLine();
            System.out.println(ott); // nextLine() 메소드는 입력받은 한 줄을 리턴한다.
            if (ott.equals("out")) {
                break;
            }
        }  //hasNextLine() 메소드는 입력된 내용이 있으면 true를 리턴한다.
        //Ctrl+z나 Ctrl+c를 입력하면 false를 입력하므로 빠져나갈 수 있다.

        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println( i + "won");
            if (i == 0) {
                break;
            }
        }

        sc.close();
    }
}