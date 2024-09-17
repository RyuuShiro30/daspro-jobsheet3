import java.util.Scanner;

public class DuaBilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 8;
        int b = 9;
        int hasil;

        System.out.println("a");
        a = input.nextInt();

        System.out.println("b");
        b = input.nextInt();

        hasil = a + b;

        System.out.println("hasil: " + hasil);
    }
}
