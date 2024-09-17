import java.util.Scanner;

public class Segitiga08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // data
        int alas;
        int tinggi;
        float luas;

        System.out.println("alas");
        alas = sc.nextInt();

        System.out.println("tinggi");
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;

        System.out.println("Luas segitiga: " + luas);
    }
}
