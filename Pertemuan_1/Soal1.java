public class Soal1 {
    public static void main(String[] args) {
        byte angka1 =125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);
        
        System.out.println("Hasil 1 "+hasil);
    }
}

/*Catatan : Output yang keluar adalah -125, karena tipe data berupa byte. Byte memiliki rentang
            nilai dari -128 hingga 127.*/