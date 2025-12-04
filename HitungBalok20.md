# JOBSHEET 12

# Percobaan 5

Pertanyaan
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok! 
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut! 
```
public class programKu {
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }

    public static int Jumlah(int bil1, int bil2) {
        return (bil1 + bil2);
    }

    public static void TampilJumlah(int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}
```
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan! 




Jawaban
1. Tahapan dan urutan eksekusi program Percobaan 5 
- Program dijalankan → method main() dieksekusi. 
- Scanner aktif → pengguna diminta memasukkan panjang, lebar, dan tinggi. 
- Nilai panjang dan lebar dikirim ke fungsi hitungLuas() → hasil luas dihitung dan ditampilkan.  
- Nilai tinggi, panjang, dan lebar dikirim ke fungsi hitungVolume() → volume dihitung dan ditampilkan.  
2. Output jika panjang = 4, lebar = 3, tinggi = 5 

Alur:  
- hitungLuas(4, 3) → 4 x 3 = 12 
- hitungVolume(5, 4, 3) → 12 x 5 = 60  

3. Alur program 
- Program dijalankan → method main() dieksekusi. Baris int temp = Jumlah(1, 1); memanggil fungsi Jumlah(1, 1) → hasilnya 2, disimpan di temp. 
- Baris TampilJumlah(temp, 5); berarti memanggil TampilJumlah(2, 5). 
- Di dalam TampilJumlah, dipanggil Jumlah(2, 5) → hasilnya 7. 
- Kemudian TampilHinggaKei(7) dipanggil → mencetak angka dari 1 sampai 7: 1234567. 
- Tapi karena Jumlah(1, 1) = 2 dan Jumlah(2, 5) = 7 → total = 9, dan TampilHinggaKei(9) akan mencetak 123456789. 

4. - Pakai parameter jika fungsi butuh input.  
   - Pakai return jika hasilnya dipakai lagi. 