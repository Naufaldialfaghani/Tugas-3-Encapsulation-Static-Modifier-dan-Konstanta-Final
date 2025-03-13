# Praktic Geometry Project

## Deskripsi
Proyek ini merupakan implementasi program berbasis Java yang menggunakan konsep **OOP (Object-Oriented Programming)** dalam **perhitungan lingkaran**. Proyek ini memiliki dua package utama:

1. **`praktic.geometry.shapes`** → Berisi kelas `Circle` untuk perhitungan lingkaran.
2. **`praktic.geometry.mains`** → Berisi kelas `Main` sebagai entry point program.

## Struktur Folder
```
praktic/
├── geometry/
│   ├── shapes/
│   │   ├── Circle.java
│   ├── mains/
│   │   ├── Main.java
```

## Fitur
✅ Menggunakan **enkapsulasi** untuk atribut `id` dan `radius`  
✅ Perhitungan **keliling** dan **luas lingkaran**  
✅ Implementasi **konstanta `final`** untuk pembilang dan penyebut dalam perhitungan π (22/7)  
✅ **Input dari pengguna** untuk ID dan radius  
✅ **ANSI Color Code** untuk mempercantik tampilan terminal  
✅ **Pemisahan kode dengan package** untuk modularitas  

## Cara Menjalankan
1. **Compile program**
   ```sh
   javac -d . praktic/geometry/shapes/Circle.java
   javac -d . praktic/geometry/mains/Main.java
   ```

2. **Jalankan program**
   ```sh
   java praktic.geometry.mains.Main
   ```

## Contoh Output
```
===========================================
Nama : (isi nama)
NIM  : (isi NIM)
===========================================
Circle
===========================================
Isikan ID      : 1
Isikan Radius  : 7
===========================================
ID      : 1
Radius  : 7.0
Keliling: 44.0
Luas    : 154.0
===========================================
```

## Lisensi
MIT License © 2025
