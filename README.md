# Mini Project: Program Data Mahasiswa

Tugas Mini Project mata kuliah Pemrograman Berorientasi Objek (PBO)

Program Studi S1 Informatika | Fakultas MIPA | Universitas Syiah Kuala  
Dosen: Maulyanda, S.Tr.Kom., M.Kom.

| | |
|---|---|
| Nama | M. Hafidh Farras |
| NIM | 250810701100098 |

---

## Deskripsi

Program Java berbasis konsep OOP untuk mengelola data mahasiswa. Pengguna memasukkan nama, NIM, dan nilai dari 3 mahasiswa. Program kemudian menampilkan data setiap mahasiswa beserta status kelulusannya.

## Fitur

- Input data mahasiswa melalui keyboard (`Scanner`)
- Membuat 3 object mahasiswa yang disimpan dalam array
- Menampilkan data mahasiswa (nama, NIM, nilai)
- Menentukan status kelulusan secara otomatis

## Struktur Project

```
MiniProjectMahasiswa/
├── Mahasiswa.java   # class Mahasiswa
├── Main.java        # program utama
└── README.md
```

## Penjelasan Kode

### `Mahasiswa.java`

| Bagian | Jenis | Keterangan |
|--------|-------|------------|
| `nama` | attribute (`String`) | Nama mahasiswa |
| `nim` | attribute (`String`) | NIM mahasiswa |
| `nilai` | attribute (`double`) | Nilai mahasiswa |
| `tampilkanData()` | method | Mencetak nama, NIM, dan nilai |
| `cekKelulusan()` | method | Mencetak status Lulus / Tidak Lulus |

### `Main.java`

1. Membuat `Scanner` untuk membaca input.
2. Membuat array `Mahasiswa[]` berukuran 3.
3. Loop `for` pertama: membuat object baru dan mengisi `nama`, `nim`, `nilai` dari input.
4. Loop `for` kedua: memanggil `tampilkanData()` dan `cekKelulusan()` untuk setiap object.

## Komponen yang Digunakan

| Komponen | Penerapan dalam program |
|----------|-------------------------|
| variable | `jumlah`, `daftar`, `teksNilai`, `input` |
| data type | `String` (nama, NIM), `double` (nilai), `int` (jumlah, indeks loop) |
| Scanner | `input.nextLine()` untuk membaca nama, NIM, dan nilai |
| conversion | `Double.parseDouble()` mengubah teks nilai menjadi `double` |
| if / else | `cekKelulusan()` memeriksa `nilai >= 60` |
| loop | `for` untuk input data dan `for` untuk menampilkan hasil |
| class | `Mahasiswa` |
| object | `new Mahasiswa()` sebanyak 3 kali |
| method | `tampilkanData()` dan `cekKelulusan()` |

## Aturan Kelulusan

| Nilai | Status |
|-------|--------|
| >= 60 | Lulus |
| < 60 | Tidak Lulus |

## Cara Menjalankan

**Lewat terminal / CMD**

```
javac Mahasiswa.java Main.java
java Main
```

**Lewat IDE (NetBeans, IntelliJ, VS Code, Eclipse)**

1. Masukkan `Mahasiswa.java` dan `Main.java` ke dalam satu project.
2. Buka `Main.java`, lalu klik **Run**.
3. Isi input pada panel Console.

> Membutuhkan JDK 8 atau lebih baru.

## Pengembangan Selanjutnya

- Jumlah mahasiswa dapat ditentukan pengguna
- Menambahkan grade (A, B, C) dengan `else if`
- Validasi input nilai (0–100)
- Menambahkan menu dengan `switch`
