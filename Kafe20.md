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