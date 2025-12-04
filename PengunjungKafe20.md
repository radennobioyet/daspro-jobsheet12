# JOBSHEET 12

# Percobaan 4

Pertanyaan
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... namaPengunjung! 
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?  




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
3. Tidak bisa. Java hanya mengizinkan satu varargs dan harus berada di akhir parameter. 
- Contoh: public static void contoh(String kategori, String... namaPengunjung) { } //benar 
Varargs di java memungkinkan sebuah method menerima banyak input tanpa harus membuat array. Satu method hanya boleh punya satu varargs, dan harus diletakkan terakhir jika ada parameter lain. Kalau ingin menggunakan dua tipe data sekaligus, bisa digabungkan dengan parameter biasa atau array, sehingga tetap fleksibel dan mudah digunakan.
4. Program tetap berjalan karena varargs bisa menerima nol argument. Outputnya akan menampilkan Daftar Nama Pengunjung