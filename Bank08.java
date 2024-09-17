import java.util.Scanner;

public class Bank08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input variabel
        int jumlahtabunganawal;
        int lamamenabung;
        double bunga;
        double prosentasebunga = 0.02;
        double jumlahtabunganakhir;

        System.out.println("jumlahtabungan awal");
        jumlahtabunganawal = scanner.nextInt();

        System.out.println("lamamenabung");
        lamamenabung = scanner.nextInt();

        bunga = jumlahtabunganawal * prosentasebunga * lamamenabung;

        jumlahtabunganakhir = bunga + jumlahtabunganawal;

        System.out.println("jumlah tabungan akhir saya adalah " + jumlahtabunganakhir);
    }
}