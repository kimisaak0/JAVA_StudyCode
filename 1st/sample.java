import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            System.out.print(sc.nextInt() + " ");
        }
        
        sc.close();

    }    
}
