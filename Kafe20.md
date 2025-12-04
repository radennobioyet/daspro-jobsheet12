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