public class Produk {
    private String[] nama_produk;
    private double[] harga_produk;
    private int[] stok;
    private int id;

    public int getId() {
        return id;
    }

    public String[] getNama_produk() {
        return nama_produk;
    }

    public double[] getHarga_produk() {
        return harga_produk;
    }

    public Produk() {
        nama_produk = new String[15];
        harga_produk = new double[15];
        stok = new int[15];
        id = 0;

        // Menambahkan contoh menu makanan
        tambahMenuMakanan("Teh Manis Panas", 5_000, 20);
        tambahMenuMakanan("Teh Manis Dingin", 5_000, 20);
        tambahMenuMakanan("Teh Tawar Panas", 5_000, 20);
        tambahMenuMakanan("Teh Tawar Dingin", 5_000, 20);
        tambahMenuMakanan("Jus Jeruk", 8_000, 20);
        tambahMenuMakanan("Jus Alpukat", 10_000, 20);
        tambahMenuMakanan("Mie Ayam", 12_000, 15);
        tambahMenuMakanan("Mie Goreng", 7_000, 20);
        tambahMenuMakanan("Caviar", 1_000_000, 2);
        tambahMenuMakanan("Nasi Goreng Komplit", 17_000, 10);
        tambahMenuMakanan("Bakso Urat", 10_000, 10);
        tambahMenuMakanan("Baso Tahu", 10_000, 20);
        tambahMenuMakanan("Sate Maranggi (15 tusuk)", 21_000, 15);
        tambahMenuMakanan("Batagor", 10_000, 20);
        tambahMenuMakanan("Spageti Fettucini", 50_000, 5);
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_produk[id] = nama;
        this.harga_produk[id] = harga;
        this.stok[id] = stok;
        id++;
    }

    public void tampilMenuMakanan() {
        int maxLen = 0;

        // Menentukan panjang maksimum nama_produk untuk menyesuaikan spasi
        for (int i = 0; i < id; i++) {
            if (stok[i] > 0 && nama_produk[i].length() > maxLen) {
                maxLen = nama_produk[i].length();
            }
        }
        
        // Menampilkan menu makanan dengan sejajar
        for (int i = 0; i < id; i++) {
            if (stok[i] > 0) {
                // Menambahkan spasi tambahan agar panjangnya sejajar
                int spaceCount = maxLen - nama_produk[i].length() + 1;
                String spaces = new String(new char[spaceCount]).replace('\0', ' ');

                System.out.println(nama_produk[i] + spaces + "[" + stok[i] + "]" + "\tRp. " + harga_produk[i]);
            }
        }
    }

    public void tambahPesanan(String nama, int jumlah) {
        for (int i = 0; i < id; i++) {
            if (nama_produk[i].equalsIgnoreCase(nama)) {
                if (stok[i] >= jumlah && jumlah > 0) {
                    stok[i] -= jumlah;
                    System.out.println("Pesanan berhasil ditambahkan: " + nama + " x" + jumlah);
                    return;
                } else if (stok[i] < jumlah) {
                    System.out.println("Stok " + nama + " tidak mencukupi.");
                    return;
                } else {
                    System.out.println("Jumlah pesanan tidak valid.");
                    return;
                }
            }
        }
        System.out.println("Produk " + nama + " tidak ada di menu.");
    }

    public boolean isMenuValid(String nama) {
        for (int i = 0; i < id; i++) {
            if (nama_produk[i].equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    public int getStokByNama(String nama) {
        for (int i = 0; i < id; i++) {
            if (nama_produk[i].equalsIgnoreCase(nama)) {
                return stok[i];
            }
        }
        return -1; // Return -1 jika nama tidak ditemukan
    }

    public void tampilTotalBayar() {
        // Implementasikan logika perhitungan total bayar di sini
    }
}
