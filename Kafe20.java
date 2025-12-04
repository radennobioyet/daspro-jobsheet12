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