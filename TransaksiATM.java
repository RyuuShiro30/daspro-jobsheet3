import java.util.Scanner;

public class TransaksiATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldoawal;
        int jumlahpenarikan;
        int saldoakhir;

        System.out.println("saldoawal");
        saldoawal = input.nextInt();

        System.out.println("jumlahpenarikan");
        jumlahpenarikan = input.nextInt();

        saldoakhir = saldoawal - jumlahpenarikan;

        System.out.println("saldo saya sekarang: " + saldoakhir);
    }
}