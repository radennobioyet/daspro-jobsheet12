# JOBSHEET 12

# Percobaan 1

Pertanyaan
1. Apakah fungsi tanpa parameter selalu harus bertipe void? 
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi! 
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main. 
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar). 



Jawaban
1. Fungsi tanpa parameter tidak harus bertipe void. Jika fungsi tidak menggunakan void, maka fungsi wajib mengembalikan nilai dengan return.
2. Daftar menu bisa di tampilkan tanpa fungsi Menu() dengan menuliskan seluruh perintah output langsung di dalam main. 
3. Menggunakan fungsi menu() membuat program lebih rapi, mudah dibaca, mudah digunakan ulang, dan lebih mudah dirawat dibanding menulis semuanya di dalam main()
4. Program di jalankan memulai dari main() selanjutnya baris menu(); di dalam main() di panggil selanjutnya program masuk ke fungsi Menu() selanjutnya semua perintah println() dalam Menu() di eksekusi setelah selesai program kembali ke main(). 




# Percobaan 2

Pertanyaan
1. Apakah kegunaan parameter di dalam fungsi?  
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
3. Apakah parameter sama dengan variabel? Jelaskan. 
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false? 
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember? 
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid. 
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.





Jawaban
1. Parameter berguna untuk mengirimkan data dari luar fungsi, sehingga fungsi dapat dipakai ulang dan menghasilkan output yang berbeda sesuai inputnya.
2. Fungsi Menu() menggunakan parameter tersebut agar dapat menampilkan nama pelanggan dan mengecek status member, sehingga isi menu yang tampil bisa menyesuaikan kondisi setiap pelanggan.
3. Parameter adalah variabel khusus dalam fungsi yang menerima nilai dari luar fungsi. Jadi parameter termasuk variabel, tetapi tidak semua variabel adalah parameter.
4. Jika isMember true tampilan akan menampilkan pesan dan diskon ,Jika isMember false tampilan akan menampilkan bukan member 
5. Program eror atau tidak dapat dijalankan karena jumlah dan tipe parameter tidak sesuai.
6. 
```
public class Kafe20 {
    public static void main(String[] args) {

        Menu("Andi", true, "DISKON50");
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang di Resto Cafe, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: diskon 50% diberikan");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: diskon 30% diberikan");
        } else {
            System.out.println("Kode promo tidak valid");
        }

        System.out.println("==== MENU RESTO CAFE ====:");
        System.out.println("1. Kopi hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang diinginkan:");
    }
}
```
7. Menu("Budi", true, "DISKON30"); 
8. Penggunaan parameter menjadikan fungsi Menu() lebih bersih, fleksibel, dan mudah dikembangkan dibanding menulis nilai tetap langsung di dalam fungsi.


# Percobaan 3

Pertanyaan
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus. 
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe. 
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)? 




Jawaban
1. Kapan fungsi butuh nilai kembalian dan kapan tidak: 
- Butuh nilai kembalian: Jika fungsi menghasilkan data yang akan digunakan kembali. Contoh: hitungTotalHarga01() mengembalikan total harga (int).  
- Tidak butuh nilai kembalian: Jika fungsi hanya melakukan aksi seperti mencetak ke layar. Contoh: Menu() hanya menampilkan teks, tidak mengembalikan nilai. 
2. Tipe kembalian: int. 
- Parameter pilihanMenu = nomor menu yang dipilih. 
- Parameter banyakItem = jumlah pesanan untuk menu tersebut. 
3. ```

import java.util.Scanner;

public class Kafe20 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("======= MENU RESTO KAFE =======");
        System.out.println("1. Kopi Hitam   - Rp 15.000");
        System.out.println("2. Cappuccino   - Rp 20.000");
        System.out.println("3. Latte        - Rp 22.000");
        System.out.println("4. Teh Tarik    - Rp 18.000");
        System.out.println("5. Roti Bakar   - Rp 12.000");
        System.out.println("6. Mie Goreng   - Rp 18.000");
        System.out.println("===============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 10000 };
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
            System.out.println("Kode promo berlaku: DISKON50, diskon 50% = Rp " +
                    diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
            System.out.println("Kode promo berlaku: DISKON30, diskon 30% = Rp " +
                    diskon);
        } else {
            System.out.println("Kode promo tidak valid, tidak ada diskon.");
        }

        return hargaTotal - diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);

        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        sc.nextLine();
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int totalBayar = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp " + totalBayar);
    }
}
```
4. ```

import java.util.Scanner;

public class Kafe20 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("======= MENU RESTO KAFE =======");
        System.out.println("1. Kopi Hitam   - Rp 15.000");
        System.out.println("2. Cappuccino   - Rp 20.000");
        System.out.println("3. Latte        - Rp 22.000");
        System.out.println("4. Teh Tarik    - Rp 18.000");
        System.out.println("5. Roti Bakar   - Rp 12.000");
        System.out.println("6. Mie Goreng   - Rp 18.000");
        System.out.println("===============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan. Masukkan 0 untuk selesai.");
    }

    public static int hitungTotalHargaNoAbsen(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 18000, 12000, 18000 };
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
            System.out.println("Kode promo berlaku: DISKON50, diskon 50% = Rp " +
                    diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
            System.out.println("Kode promo berlaku: DISKON30, diskon 30% = Rp " +
                    diskon);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid, tidak ada diskon.");
        }

        return hargaTotal - diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);

        int totalKeseluruhan = 0;
        String kodePromo;

        while (true) {
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Masukkan kode promo untuk menu ini (kosong jika tidak ada): ");
            kodePromo = sc.nextLine();

            int totalMenu = hitungTotalHargaNoAbsen(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Total harga untuk menu ini: Rp " + totalMenu + "\n");

            totalKeseluruhan += totalMenu;
        }

        System.out.println("==================================");
        System.out.println("Total keseluruhan pesanan: Rp " + totalKeseluruhan);
    }
}
```