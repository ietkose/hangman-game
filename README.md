# Hangman Game

[![Java](https://img.shields.io/badge/Java-15%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![CLI](https://img.shields.io/badge/CLI-Game-black.svg?style=for-the-badge&logo=gnu-bash&logoColor=white)](https://en.wikipedia.org/wiki/Command-line_interface)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)

🔗 **[Visit Project Repository / Proje Deposu](https://github.com/ietkose/hangman-game)**

꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦︶꒷꒦︶ ๋⭑꒷꒦︶꒷꒦︶ ๋⭑

## 🇬🇧 ENGLISH

A classic command-line **Hangman Game** built with modern Java features. It dynamically loads word lists from external text files and renders detailed ASCII art for game states using Java Text Blocks.

---

### ⛄ Key Features
* **Dynamic Word Loading**: Reads random words from an external `assets/words.txt` file at startup.
* **ASCII Art Visuals**: Renders progressive hangman graphics using Java 15+ multi-line Text Blocks.
* **Input Validation & State Tracking**: Prevents duplicate guesses, validates single-character inputs, and tracks remaining lives.
* **Easily Customizable**: Simple external word list extension without recompiling code.

---

### ⛄ Tech Stack & Concepts
* **Language:** Java 15+
* **Modern Features:** Java Text Blocks (`"""..."""`), Switch Expressions
* **Core APIs:** `java.io`, `java.nio.file`, `java.util.Scanner`, `java.util.List`

---

### ⛄ Installation & Setup

#### Prerequisites
* **Java Development Kit (JDK 15+)** installed and configured.

#### 1. Clone the Repository
```bash
git clone [https://github.com/ietkose/hangman-game.git](https://github.com/ietkose/hangman-game.git)
cd hangman-game
```

#### 2. Verify File Structure
Ensure the assets/ folder is positioned relative to your execution path:

```text
Plaintext
hangman-game/
├── App.java
└── assets/
    └── words.txt
```

#### 3. Compile & Run
```bash
# Compile
javac App.java
```
```bash
# Run
java App
```

#### Customization
You can easily extend the word dictionary:
Open assets/words.txt.
Add custom words (one per line).
Save and restart the game!

### ⛄ License
This project is licensed under the MIT License.

꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦︶꒷꒦︶ ๋⭑꒷꒦︶꒷꒦︶ ๋⭑

## 🇹🇷 TÜRKÇE
Modern Java özellikleri kullanılarak geliştirilmiş klasik bir komut satırı Adam Asmaca Oyunu. Kelimeleri harici bir metin dosyasından dinamik olarak yükler ve Java Text Blocks özelliğini kullanarak oyun durumunu gösteren ASCII grafikler çizer.

### ⛄ Öne Çıkan Özellikler
* **Dinamik Kelime Yükleme:** Başlangıçta assets/words.txt dosyasından rastgele kelimeler okur.
* **ASCII Görsel Çizimi:** Java 15+ çok satırlı metin blokları (Text Blocks) ile adım adım adam asmaca çizimi.
* **Girdi Doğrulama ve Takip:** Tekrar eden tahminleri engeller, geçerli harf girdilerini kontrol eder ve kalan hakları takip eder.
* **Kolay Özelleştirilebilir:** Kodu yeniden derlemeye gerek kalmadan kelime listesi ekleme imkanı.

### ⛄ Kullanılan Teknolojiler ve Kavramlar
* **Dil:** Java 15+
* **Modern Özellikler:** Java Text Blocks, Switch Expressions
* **Çekirdek Paketler:** java.io, java.nio.file, java.util.Scanner

### ⛄ Kurulum ve Çalıştırma
#### Gereksinimler
Sisteminizde JDK 15 veya üzeri sürümün yüklü olması gerekir.

#### 1. Depoyu Klonlayın
```bash
git clone [https://github.com/ietkose/hangman-game.git](https://github.com/ietkose/hangman-game.git)
cd hangman-game
```

#### 2. Dosya Yapısını Doğrulayın
`assets/` klasörünün, uygulama çalıştırma yolunuza göre doğru konumda olduğundan emin olun:
```text
Plaintext
hangman-game/
├── App.java
└── assets/
    └── words.txt
```

#### 3. Kodu Derleyin ve Çalıştırın
```bash
# Derleme
javac App.java
```
```bash
# Çalıştırma
java App
```

#### Özelleştirme
Kelime sayısını arttırabilirsiniz:
assets/words.txt dosyasını açın.
Kendi kelimelerinizi ekleyin (her satıra bir kelime).
Kaydedin ve oyunu tekrar başlatın!

### ⛄ Lisans
Bu proje MIT lisansı altında lisanslanmıştır.

꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦꒷꒦︶꒷꒦︶ ๋⭑꒷꒦︶꒷꒦︶ ๋⭑꒷꒦︶꒷꒦︶ ๋⭑

## Sample Image / Örnek Görsel
<img width="1461" height="658" alt="hangman_game" src="https://github.com/user-attachments/assets/32cfa65e-7665-4ef4-97e9-7888f6202691" />
