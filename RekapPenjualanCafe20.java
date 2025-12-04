public class RekapPenjualanCafe20 {
    static String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
    static int[][] penjualan = {
        { 20, 20, 20, 60, 60, 60, 10 },
        { 30, 9, 10, 19, 15, 20, 25 },
        { 5, 9, 20, 25, 10, 5, 45 },
        { 50, 8, 17, 18, 10, 30, 6 },
        { 15, 10, 16, 15, 10, 10, 55 }
    };

    // Menampilkan data penjualan dalam bentuk tabel
    public static void tampilData() {
        System.out.printf("%-16s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%n",
                "Menu", "Hari1", "Hari2", "Hari3", "Hari4", "Hari5", "Hari6", "Hari7");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-16s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-8d", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    // Menampilkan menu dengan total penjualan tertinggi
    public static void tampilMenuTerlaris() {
        int maxTotal = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("Menu terlaris: " + menuTerlaris + " dengan total penjualan " + maxTotal);
    }

    // Menampilkan rata-rata penjualan tiap menu
    public static void tampilRataRata() {
        System.out.println("Rata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }

            double rata = total / 7.0;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {
        tampilData();
        tampilMenuTerlaris();
        tampilRataRata();
    }
}
