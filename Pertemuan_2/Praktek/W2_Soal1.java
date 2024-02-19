import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W2_Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berapa angka yang ingin anda cek : ");
        int t = scanner.nextInt(); // Jumlah kasus.
        List<BigInteger> arrayAngka = new ArrayList<>(); // List untuk menyimpan angka yang akan dicek.
        
        // Input angka yang akan dicek
        System.out.println("Masukkan angka yang ingin dicek : ");
        for (int i = 1; i <= t; i++) { // Looping angka selama i kurang dari sama dengan t
            System.out.print(">");
            BigInteger n = scanner.nextBigInteger(); // Menginput angka yang akan dicek sebagai BigInteger
            arrayAngka.add(n); // Menginput angka ke dalam list angka
        }
        scanner.close();
        
        System.out.println(); // Memisahkan 1 baris

        // Mencetak tipe data dari tiap angka yang telah diminta
        for (BigInteger angka : arrayAngka) { // Loop akan mengambil angka dari list arrayAngka
            System.out.println (">" + angka + " can be fitted in:");

            if (angka.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && angka.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
                System.out.println("* byte");
            } else if (angka.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && angka.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                System.out.println("* short");
            } else if (angka.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && angka.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                System.out.println("* int");
            } else if (angka.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && angka.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                System.out.println("* long");
            } else {
                System.out.println("can't be fitted anywhere");
            }
            System.out.println(); // Mencetak baris baru setiap loop
        }
    }
}
