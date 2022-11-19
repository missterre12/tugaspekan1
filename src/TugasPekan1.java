import java.util.Scanner;

public class TugasPekan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("==================================");
            System.out.println("Daftar Menu");
            System.out.println("==================================");
            System.out.println("1. Identitas ");
            System.out.println("2. Kalkulator");
            System.out.println("3. Perbandingan");
            System.out.println("0. Kembali ke Menu Awal!");
            int pilih = input.nextInt();

            if (pilih == 0) {
                running = false;
            } else if (pilih == 1) {
                lihatIdentitas();
            } else if (pilih == 2) {
                lihatKalkulator();
            } else if (pilih == 3) {
                lihatPerbandingan();
            } else {
                System.out.println("Pilihan Yang Anda Masukkan Salah!");
            }
        }
    }

    private static void lihatIdentitas() {
        boolean running1 = true;
        Scanner input = new Scanner(System.in);
        while (running1){
            System.out.println("==================================");
            System.out.println("Anda Berada di Menu Identitas");
            System.out.println("==================================");
            System.out.println("Tekan 1: Bila ingin melihat data.");
            System.out.println("Tekan 2: Untuk kembali ke menu awal.");
            int pilihan1 = input.nextInt();
            switch (pilihan1){
                case 1:
                    System.out.println("Nama: Terresa Alicia");
                    System.out.println("Alasan mengikuti BE: Menjadi BE Specialist.");
                    System.out.println("Ekspektasi setelah selesai program: Bisa berkarir di BE.");
                    break;
                case 2:
                    running1 = false;
                default:
                    System.out.println("Pilihan Yang Anda Masukkan Salah!");
            }
        }
    }


    private static void lihatKalkulator() {
        boolean running2 = true;
        Scanner input = new Scanner(System.in);
        while (running2){
            System.out.println("==================================");
            System.out.println("Anda Berada di Menu Kalkulator");
            System.out.println("==================================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Sisa Bagi");
            System.out.println("6. Kembali ke Daftar Menu");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan2 = input.nextInt();
            switch (pilihan2){
                case 1:
                    System.out.println("Anda Memilih Operasi Penjumlahan");
                    rumus_penjumlahan();
                    break;
                case 2:
                    System.out.println("Anda Memilih Operasi Pengurangan");
                    rumus_pengurangan();
                    break;
                case 3:
                    System.out.println("Anda Memilih Operasi Perkalian");
                    rumus_perkalian();
                    break;
                case 4:
                    System.out.println("Anda Memilih Operasi Pembagian");
                    rumus_pembagian();
                    break;
                case 5:
                    System.out.println("Anda Memilih Operasi Sisa Bagi");
                    rumus_sisabagi();
                    break;
                case 6:
                    running2 = false;
                default:
                    System.out.println("Pilihan Yang Anda Masukkan Salah!");
            }
        }
    }

    private static void rumus_penjumlahan() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Operasi Penjumlahan");
        System.out.print("Masukkan angka pertama: ");
        int angka1;
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2;
        angka2 = input.nextInt();

        int hasil;
        hasil = angka1 + angka2;

        System.out.println("Hasil Penjumlahan = "+ angka1 +" + "+ angka2 +" = " + hasil);
    }

    private static void rumus_pengurangan() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Operasi Pengurangan");
        System.out.print("Masukkan angka pertama: ");
        int angka1;
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2;
        angka2 = input.nextInt();

        int hasil;
        hasil = angka1 - angka2;

        System.out.println("Hasil Pengurangan = "+ angka1 +" - "+ angka2 +" = " + hasil);
    }

    private static void rumus_perkalian() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Operasi Perkalian");
        System.out.print("Masukkan angka pertama: ");
        int angka1;
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2;
        angka2 = input.nextInt();

        int hasil;
        hasil = angka1 * angka2;

        System.out.println("Hasil Perkalian = "+ angka1 +" * "+ angka2 +" = " + hasil);
    }


    private static void rumus_pembagian() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Operasi Pembagian");
        System.out.print("Masukkan angka pertama: ");
        int angka1;
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2;
        angka2 = input.nextInt();

        int hasil;
        hasil = angka1 / angka2;

        System.out.println("Hasil Pembagian = "+ angka1 +" / "+ angka2 +" = " + hasil);
    }

    private static void rumus_sisabagi() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Operasi Sisa Bagi");
        System.out.print("Masukkan angka pertama: ");
        int angka1;
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2;
        angka2 = input.nextInt();

        int hasil;
        hasil = angka1 % angka2;

        System.out.println("Hasil Sisa Bagi = "+ angka1 +" % "+ angka2 +" = " + hasil);
    }

    private static void lihatPerbandingan() {
        boolean running3 = true;
        Scanner input = new Scanner(System.in);
        while (running3){
            System.out.println("==================================");
            System.out.println("Menu Perbandingan");
            System.out.println("==================================");
            System.out.println("1. Lebih Dari");
            System.out.println("2. Kurang Dari");
            System.out.println("3. Sama Dengan");
            System.out.println("4. Kembali ke Daftar Menu!");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan3 = input.nextInt();
            switch (pilihan3) {
                case 1:
                    System.out.println("Anda Memilih Operasi Lebih Dari");
                    rumus_lebihdari();
                    break;
                case 2:
                    System.out.println("Anda Memilih Operasi Kurang Dari");
                    rumus_kurangdari();
                    break;
                case 3:
                    System.out.println("Anda Memilih Operasi Sama Dengan");
                    rumus_samadengan();
                    break;
                case 4:
                    running3 = false;
                default:
                    System.out.println("Pilihan Yang Anda Masukkan Salah!");
            }
        }


    }

    private static void rumus_samadengan() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Operasi Sama Dengan");
        System.out.println("==================================");
        System.out.print("Masukkan angka pertama: ");
        int angka1;
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2;
        angka2 = input.nextInt();

        System.out.println("Nilai = " + angka1);
        System.out.println("Nilai = " + angka2);
        if (angka1 == angka2) {
            System.out.println("Nilai "+ angka1+" sama dengan nilai "+ angka2);
        } else if (angka1 < angka2) {
            System.out.println("Sistem Tidak Valid!");
        } else if (angka1 > angka2) {
            System.out.println("Sistem Tidak Valid!");
        }
    }


    private static void rumus_kurangdari() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Operasi Kurang Dari");
        System.out.println("==================================");
        System.out.print("Masukkan angka pertama: ");
        int angka1;
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2;
        angka2 = input.nextInt();

        System.out.println("Nilai = " + angka1);
        System.out.println("Nilai = " + angka2);
        if (angka1 < angka2) {
            System.out.println("Nilai "+ angka1+" lebih kecil daripada nilai "+ angka2);
        } else if (angka1 > angka2) {
            System.out.println("Sistem Tidak Valid!");
        } else if (angka1 == angka2) {
            System.out.println("Sistem Tidak Valid!");
        }
    }


    private static void rumus_lebihdari() {
        Scanner input = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Operasi Lebih Dari");
        System.out.println("==================================");
        System.out.print("Masukkan angka pertama: ");
        int angka1;
        angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2;
        angka2 = input.nextInt();

        System.out.println("Nilai = " + angka1);
        System.out.println("Nilai = " + angka2);
        if (angka1 > angka2) {
            System.out.println("Nilai "+ angka1+" lebih besar daripada nilai "+ angka2);
        } else if (angka1 < angka2) {
            System.out.println("Sistem Tidak Valid!");
        } else if (angka1 == angka2) {
            System.out.println("Sistem Tidak Valid!");
        }
    }
}