# JOBSHEET 12

# Percobaan 4

Pertanyaan
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung! 
2. Modifikasi method daftarPengunjung menggunakan for-each loop.




Jawaban
1. Penulisan String... digunakan untuk menerima jumlah argumen yang tidak tetap (varargs). Artinya, kita bisa memanggil fungsi dengan satu, dua, atau banyak nama tanpa harus menentukan jumlah parameter secara eksplisit. 
2. 
```
public class PengunjungKafe20 {
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
```