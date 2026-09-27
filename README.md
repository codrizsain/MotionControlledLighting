# 🖐️ Motion Controlled Lighting

Repositori ini berisi *source code* untuk aplikasi web interaktif yang memungkinkan pengguna mengontrol saklar lampu secara virtual dan mengubah suasana ruangan hanya dengan menggunakan deteksi pose tangan (*hand gesture*) melalui kamera.

**Untuk mencoba langsung aplikasi ini, klik tombol di bawah ini:**

[![Try it on Hugging Face](https://img.shields.io/badge/%F0%9F%A4%97%20Try%20Live%20Demo%20on%20Hugging%20Face-FFD21E?style=for-the-badge&logo=huggingface&logoColor=000)](https://huggingface.co/spaces/codrizsain/MotionControlledLighting)

## 🛠️ Bahasa Pemrograman & Tools

![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![Hugging Face](https://img.shields.io/badge/Hugging%20Face-FFD21E?style=for-the-badge&logo=huggingface&logoColor=000)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

* **Bahasa Markup & Desain:** HTML, CSS (untuk efek *glassmorphism* dan pendaran lampu neon).
* **Bahasa Pemrograman Logika:** Java dan Python untuk mengelola interaksi, logika deteksi, serta pemrosesan data.
* **Platform & Deployment:** Hugging Face Spaces sebagai lingkungan *hosting* dan integrasi model pendeteksi pose.
* **Containerization:** Docker digunakan untuk membungkus aplikasi agar dapat berjalan dengan konsisten di berbagai lingkungan pengembangan secara lokal.

## 📸 Pratinjau Antarmuka
Berikut adalah tampilan aplikasi Via HugginFace
### 1. Halaman Utama (Landing Page)
Tampilan awal yang bersih dengan nuansa dark mode. Kamu dapat memulai interaksi dengan menekan tombol "AKTIFKAN SMART LAMP" yang memiliki efek pendaran blue neon.
<img width="1024" height="515" alt="image" src="https://github.com/user-attachments/assets/36d42ae6-7cc3-47d0-b265-02126f2cff5f" />

### 2. Mematikan Lampu (Gesture: Peace / V)
Saat kamera mendeteksi gestur tangan "Peace" (✌️), sistem akan mengenali perintah tersebut untuk mematikan lampu.
* **Status:** Lampu Mati (OFF)
* **Visual:** Ruangan menjadi gelap dan bingkai deteksi kamera berubah menjadi warna Pink Neon.
<img width="600" height="360" alt="foto hugg" src="https://github.com/user-attachments/assets/974b67e4-97d5-4db5-bd88-5ea5489fa214" />

### 3. Menghidupkan Lampu (Gesture: Open Palm / Lima Jari Terbuka)
Saat kamera mendeteksi gestur tangan terbuka (✋), sistem akan memicu lampu untuk menyala.
* **Status:** Lampu Menyala (ON)
* **Visual:** Latar belakang ruangan berubah menjadi terang, grafis lampu menyala, dan bingkai deteksi kamera berubah menjadi warna Kuning Neon.
<img width="600" height="406" alt="foto  face hugg" src="https://github.com/user-attachments/assets/f378e596-76c5-4609-ac24-284d3c340cf1" />


## 🚀 Cara Menjalankan Aplikasi

Aplikasi ini didesain dan dikonfigurasi secara khusus agar berjalan optimal di *environment* Hugging Face. Repositori GitHub ini difungsikan murni sebagai etalase portofolio *source code*.

### Pilihan 1: Melalui Hugging Face (Rekomendasi Utama)
Kamu tidak perlu mengunduh atau menginstal perangkat lunak apa pun.
1. Kunjungi tautan peluncuran ini: [Motion Controlled Lighting di Hugging Face](https://huggingface.co/spaces/codrizsain/MotionControlledLighting)
2. Berikan izin akses *webcam* (kamera) pada *browser* yang muncul di layar.
3. Klik tombol **"AKTIFKAN SMART LAMP"** dan mulailah menggunakan gestur tangan.

### Pilihan 2: Menjalankan Secara Lokal (Untuk Developer)
Jika kamu ingin menguji *source code* ini secara lokal di komputermu:
1. Lakukan *clone* repositori ini:
   ```bash
   git clone [https://github.com/username-github-kamu/MotionControlledLighting.git](https://github.com/username-github-kamu/MotionControlledLighting.git)


## ✨ Fitur Utama
* **Real-time Hand Tracking:** Mendeteksi titik-titik kerangka tangan (*landmarks*) secara akurat dan langsung.
* **Dynamic Environment:** Perubahan gambar latar belakang ruangan secara dinamis (terang/gelap) yang merespons aksi pengguna.
* **Neon UI Indicators:** Umpan balik visual interaktif berupa perubahan warna bingkai di sekitar *webcam* (Pink/Kuning) untuk menandakan status mode.
* **Optimasi Performa:** Antarmuka menggunakan teks statis agar kinerja memori dapat difokuskan sepenuhnya pada pemrosesan deteksi kamera tanpa *lag*.

## 📜 Kebijakan Penggunaan Data Pengguna
Aplikasi ini memproses data kamera sepenuhnya secara lokal (*client-side*) di perangkat pengguna. Tidak ada data rekaman video, gambar, atau titik koordinat pose tangan yang disimpan ke *database* atau dikirimkan ke server eksternal, sehingga privasi pengguna terjamin aman 100%.

## 🤝 Kerja Sama
Tertarik untuk berkolaborasi atau berdiskusi lebih lanjut mengenai project ini? Mari terhubung melalui Instagram:

[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?style=for-the-badge&logo=Instagram&logoColor=white)](https://instagram.com/codrizsain)

Kunjungi profil Instagram saya di **[@codrizsain](https://instagram.com/codrizsain)**.
