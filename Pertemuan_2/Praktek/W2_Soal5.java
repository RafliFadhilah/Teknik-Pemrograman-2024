import java.util.Scanner;

public class W2_Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua letters (A dan B)
        System.out.println("Masukkan kata pertama:");
        String A = scanner.nextLine();
        System.out.println("Masukkan kata kedua:");
        String B = scanner.nextLine();

        // Menghitung panjang A dan B dan mencetak berapa panjangnya
        int panjangSum = A.length() + B.length();
        System.out.println(panjangSum);

        // Membandingkan A dan B secara leksikografis dan mencetak Yes atau No
        if (A.compareTo(B) > 0) {           // Jika lebih besar, maka akan bernilai positif (>0)
            System.out.println("Yes");    // Jika lebih kecil, maka akan bernilai negatif (<0)
        } else {
            System.out.println("No");
        }

        // Mengambil huruf pertama dari masing-masing kata
        String hurufPertamaA = A.substring(0, 1);
        String hurufPertamaB = B.substring(0, 1);
        
        // Mengkapitalisasi huruf pertama dari masing-masing kata,
        // kemudian disatukan dengan huruf sisa dari kata tersebut
        // Contoh jika kata java, maka j akan dikapitalisasi menjadi J,
        // setelah itu disatukan dengan ava, menjadi Java.
        String kapitalisasiA = hurufPertamaA.toUpperCase() + A.substring(1);
        String kapitalisasiB = hurufPertamaB.toUpperCase() + B.substring(1);
        // Mencetak kata A dan B yang telah dikapitalisasi dalam 1 baris dan dipisahkan oleh spasi
        System.out.println(kapitalisasiA + " " + kapitalisasiB);

        scanner.close();
    }
}
