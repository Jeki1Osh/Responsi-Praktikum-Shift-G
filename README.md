# Responsi-Praktikum-Shift-G
Project PBO untuk responsi Praktikum PBO

# 🚗 Simulasi Kendaraan Menggunakan Object-Oriented Programming (OOP)

## 📌 Deskripsi Proyek

Proyek ini merupakan implementasi konsep **Object-Oriented Programming (OOP)** menggunakan bahasa pemrograman Java. Program ini mensimulasikan dua jenis kendaraan, yaitu mobil sedan dan mobil sport, dengan karakteristik serta perilaku yang berbeda.

Melalui proyek ini, diterapkan beberapa konsep dasar OOP, seperti **Inheritance, Encapsulation, Abstraction, dan Polymorphism**.

Program dapat menampilkan informasi merek kendaraan, status mesin, serta mengatur mode berkendara khusus pada mobil sport, yaitu Sport Mode dan Eco Mode.

## 🎯 Tujuan Proyek

- Memahami penerapan konsep Object-Oriented Programming menggunakan Java.
- Mengimplementasikan inheritance melalui hubungan antara superclass dan subclass.
- Memahami penggunaan abstract class dan abstract method.
- Menerapkan encapsulation untuk mengelola atribut dan perilaku objek.
- Memahami polymorphism melalui method overriding.

## 🛠️ Teknologi yang Digunakan

- **Bahasa Pemrograman:** Java
- **Konsep:** Object-Oriented Programming (OOP)
- **Tools:** IntelliJ IDEA

## 📂 Struktur File

```text
OOP-Project/
│
├── Kendaraan.java
├── mobilSedan.java
├── mobilSport.java
└── Main.java
```

Penjelasan setiap file:

| File | Deskripsi |
|---|---|
| `Kendaraan.java` | Superclass yang menjadi dasar dari seluruh jenis kendaraan. |
| `mobilSedan.java` | Subclass yang merepresentasikan kendaraan jenis sedan. |
| `mobilSport.java` | Subclass yang merepresentasikan kendaraan jenis sport. |
| `Main.java` | Main class yang digunakan untuk menjalankan dan menguji program. |

## 🧩 Implementasi Konsep OOP

### 1. Abstraction

Konsep abstraction diterapkan melalui abstract class `Kendaraan`.

Class ini memiliki abstract method `statusMobil()` yang wajib diimplementasikan oleh setiap subclass.

```java
public abstract class Kendaraan {
    public abstract void statusMobil();
}
```

### 2. Inheritance

Konsep inheritance diterapkan dengan menggunakan keyword `extends`.

Class `mobilSedan` dan `mobilSport` mewarisi atribut serta method dari class `Kendaraan`.

```java
public class mobilSedan extends Kendaraan
```

```java
public class mobilSport extends Kendaraan
```

Dengan inheritance, kedua subclass dapat menggunakan atribut dan method yang telah didefinisikan pada superclass.

### 3. Encapsulation

Konsep encapsulation diterapkan dengan menggunakan access modifier seperti `private` dan `protected`.

Contohnya, atribut `sportMode` pada class `mobilSport` memiliki access modifier `private`, sehingga pengelolaannya dilakukan melalui method getter dan setter.

```java
public boolean isSportMode() {
    return sportMode;
}

public void setSportMode(boolean mode) {
    this.sportMode = mode;
}
```

### 4. Polymorphism

Konsep polymorphism diterapkan melalui method overriding pada method `statusMobil()`.

Class `mobilSedan` dan `mobilSport` memiliki implementasi `statusMobil()` masing-masing, sehingga perilaku method tersebut berbeda berdasarkan jenis objek yang menggunakannya.

## ⚙️ Fitur Program

1. **Informasi Merek Kendaraan**
   - Menampilkan merek kendaraan menggunakan method `namaMerek()`.

2. **Status Mesin**
   - Menampilkan kondisi mesin kendaraan.
   - Mengubah kondisi mesin menggunakan method `setMesin()`.

3. **Simulasi Mobil Sedan**
   - Merepresentasikan mobil sedan dengan empat pintu.

4. **Simulasi Mobil Sport**
   - Merepresentasikan mobil sport dengan dua pintu.
   - Mengaktifkan Sport Mode menggunakan `nyalakanSportMode()`.
   - Menonaktifkan Sport Mode dan mengubahnya ke Eco Mode menggunakan `matikanSportMode()`.

## ▶️ Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstal pada komputer.

1. Download atau clone repository ini.
2. Buka terminal pada direktori proyek.
3. Compile seluruh file Java menggunakan perintah:

```bash
javac *.java
```

4. Jalankan program menggunakan perintah:

```bash
java Main
```

## 📋 Contoh Alur Program

Program akan membuat dua objek kendaraan:

- Mobil sedan dengan merek Avanza.
- Mobil sport dengan merek McLaren.

Selanjutnya, program akan melakukan beberapa pengujian:

1. Menampilkan merek kendaraan.
2. Menampilkan status mesin ketika kendaraan dalam keadaan mati.
3. Mengaktifkan mesin kendaraan.
4. Menampilkan status mesin setelah dinyalakan.
5. Mengaktifkan Sport Mode pada mobil sport.
6. Menonaktifkan Sport Mode untuk mengubahnya menjadi Eco Mode.

## 👨‍💻 Penutup

Proyek ini dibuat sebagai sarana pembelajaran dan penerapan konsep dasar Object-Oriented Programming menggunakan bahasa Java.

Dengan mengembangkan simulasi kendaraan sederhana ini, diharapkan pemahaman mengenai hubungan antarclass, pewarisan atribut dan method, serta penerapan konsep-konsep OOP dapat semakin meningkat.
