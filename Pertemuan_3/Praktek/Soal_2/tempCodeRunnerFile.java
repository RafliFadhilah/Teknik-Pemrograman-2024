import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Produk produk = new Produk();
        Penjualan penjualan = new Penjualan();

        Scanner myObj = new Scanner(System.in);
        String pemesanan;

        produk.tampilMenuMakanan();  // Menampilkan menu sebelum memesan

        do {
            System.out.print("Ketik makanan yang akan dipesan : ");
            pemesanan = myObj.nextLine();

            if (!pemesanan.equalsIgnoreCase("selesai")) {
                // Cek apakah nama makanan ada di menu
                if (produk.isMenuValid(pemesanan)) {
                    int stok = produk.getStokByNama(pemesanan);
                    if (stok > 0) {
                        int jumlah = 0;
                        boolean inputValid = false;

                        // Validasi input jumlah pesanan
                        do {
                            System.out.print("Masukkan jumlah pesanan : ");
                            jumlah = myObj.nextInt();
                            myObj.nextLine(); // Membersihkan buffer setelah nextInt

                            if (jumlah <= stok && jumlah > 0) {
                                inputValid = true;
                            } else {
                                System.out.println("Stok tidak tersedia untuk pesanan tersebut. Silakan masukkan kembali.");
                            }
                        } while (!inputValid);

                        penjualan.tambahProduk(pemesanan, jumlah, produk);

                        System.out.print("Apakah anda akan memesan lagi? (1:Ya, 2:Tidak) ");
                        int jawaban = myObj.nextInt();
                        myObj.nextLine(); // Membersihkan buffer setelah nextInt

                        if (jawaban != 1) {
                            break;
                        }
                    } else {
                        System.out.println("Stok habis untuk " + pemesanan);
                    }
                } else {
                    System.out.println("Produk " + pemesanan + " tidak ada di menu.");
                }
            }
        } while (!pemesanan.equalsIgnoreCase("selesai"));

        myObj.close();

        System.out.println("Terima kasih sudah membeli.");
        penjualan.tampilTotalBayar();
    }
}
