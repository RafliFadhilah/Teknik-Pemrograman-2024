public class Tugas1 {
    // Deklarasi Variabel Privat
    private Bunga pembelian1;
    private Bunga pembelian2;
    private Bunga pembelian3;

    public Tugas1() {
        // Instantiasi Objek 
        pembelian1 = new Bunga(1, "Bunga Mawar", "Merah", "HVS", 2);
        pembelian2 = new Bunga(2, "Bunga Tulip", "Putih", "Origami", 11);
        pembelian3 = new Bunga(3, "Bunga Matahari", "Kuning", "Tisu", 5);
    }

    // Mengambil Informasi Spesifikasi Bunga Sesuai Pembelian
    public void infoPembelian() {
        pembelian1.getInfo();
        System.out.println();
        pembelian2.getInfo();
        System.out.println();
        pembelian3.getInfo();
    }

    // Program Utama
    public static void main(String[] args) {
        Tugas1 program = new Tugas1();

        // Variabel untuk mengambil nilai jumlahbunga dari objek menggunakan getter getJumlahBunga
        int jumlahBunga1 = program.pembelian1.getJumlahBunga();
        int jumlahBunga2 = program.pembelian2.getJumlahBunga();
        int jumlahBunga3 = program.pembelian3.getJumlahBunga();

        // Pengecekan validitas jumlah bunga
        if (jumlahBunga1 < 1 || jumlahBunga2 < 1 || jumlahBunga3 < 1) { // Jika jumlah bunga dari salah satu pembelian < 1
            System.out.println("Jumlah bunga pada satu atau lebih pembelian tidak valid.");
        } else { // Jika jumlah bunga dari semua pembelian > 1 (valid)
            System.out.println("------Laporan pembelian bunga pada toko Rafli------");
            System.out.println();
            program.infoPembelian();
        }
    }
}

class Bunga {
    private int pembelian;
    private String jenisBunga;
    private String warna;
    private String jenisKertas;
    private int jumlahBunga;

    // Konstruktor bunga yang isinya spesifikasi bunga dari pembelian
    public Bunga(int pembelian, String jenisBunga, String warna, String jenisKertas, int jumlahBunga) {
        this.pembelian = pembelian;
        this.jenisBunga = jenisBunga;
        this.warna = warna;
        this.jenisKertas = jenisKertas;
        this.jumlahBunga = jumlahBunga;
    }

    // GETTER
    public int getPembelian() {
        return pembelian;
    }
    public String getJenisBunga() {
        return jenisBunga;
    }
    public String getWarna() {
        return warna;
    }
    public String getJenisKertas() {
        return jenisKertas;
    }
    public int getJumlahBunga() {
        return jumlahBunga;
    }

    // Metode untuk mendapatkan info spesifikasi bunga yang nanti akan dicetak
    public void getInfo() {
        System.out.println("(Pembelian ke " + getPembelian() + ")");
        System.out.println("jenis bunga: " + getJenisBunga());
        System.out.println("warna bunga: " + getWarna());
        System.out.println("jenis kertas: " + getJenisKertas());
        System.out.println("jumlah bunga: " + getJumlahBunga());
    }
}
