import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 3; // minimal 3 object mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[jumlah];

        // Input data tiap mahasiswa (loop)
        for (int i = 0; i < jumlah; i++) {
            System.out.println("=== Input Data Mahasiswa ke-" + (i + 1) + " ===");

            daftar[i] = new Mahasiswa(); // membuat object baru

            System.out.print("Nama  : ");
            daftar[i].nama = input.nextLine();

            System.out.print("NIM   : ");
            daftar[i].nim = input.nextLine();

            System.out.print("Nilai : ");
            String teksNilai = input.nextLine();                 // dibaca sebagai String
            daftar[i].nilai = Double.parseDouble(teksNilai);     // konversi String -> double

            System.out.println();
        }

        // Tampilkan hasil tiap mahasiswa
        System.out.println("========== HASIL DATA MAHASISWA ==========");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("--- Mahasiswa ke-" + (i + 1) + " ---");
            daftar[i].tampilkanData();
            daftar[i].cekKelulusan();
            System.out.println();
        }

        input.close();
    }
}