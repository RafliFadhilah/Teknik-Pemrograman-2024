public class Penjualan {
    private String[] nama_produk;
    private double[] harga_produk;
    private int id = 0;
    private double harga_total;

    public Penjualan() {
        nama_produk = new String[10];
        harga_produk = new double[10];
        harga_total = 0;
    }

    // Getter untuk nama_produk
    public String[] getNama_produk() {
        return nama_produk;
    }

    // Getter untuk harga_produk
    public double[] getHarga_produk() {
        return harga_produk;
    }

    public void tambahProduk(String nama, int jumlah, Produk produk) {
        for (int i = 0; i < produk.getId(); i++) {
            if (produk.getNama_produk()[i].equalsIgnoreCase(nama)) {
                nama_produk[id] = nama;
                harga_produk[id] = produk.getHarga_produk()[i];
                harga_total += harga_produk[id] * jumlah;
                id++;
                return;
            }
        }
        System.out.println("Produk " + nama + " tidak ada di menu.");
    }

    public void tampilTotalBayar() {
        System.out.println("Total Bayar: Rp. " + harga_total);
    }
}
