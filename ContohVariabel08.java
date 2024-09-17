public class ContohVariabel08 {

    public static void main(String[] args) {
        String salahSatuHobbySayaAdalah = "Bermain game";
        boolean Pandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 18;
        double ipk = 3.60, tinggi = 1.77;

        System.out.println("salahSatuHobbySayaAdalah");
        System.out.println("Apakah pandai? " + Pandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
