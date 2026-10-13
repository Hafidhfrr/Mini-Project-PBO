public class Mahasiswa {

    // Attribute
    String nama;
    String nim;
    double nilai;

    // menampilkan data mahasiswa
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    // mengecek kelulusan (lulus jika nilai >= 60)
    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
    }
}