#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128  // OLED display width, in pixels
#define SCREEN_HEIGHT 64  // OLED display height, in pixels

// Buat objek display dengan I2C address 0x3C
#define OLED_RESET    -1
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);

void setup() {
  // Inisialisasi Serial
  Serial.begin(115200);

  // Inisialisasi OLED
  if (!display.begin(SSD1306_SWITCHCAPVCC, 0x3C)) { // Alamat I2C OLED biasanya 0x3C
    Serial.println(F("OLED tidak terdeteksi, cek kabel!"));
    while (true); // Berhenti di sini
  }

  // Bersihkan buffer
  display.clearDisplay();

  // Set ukuran teks
  display.setTextSize(1);      // Ukuran font (1 = normal)
  display.setTextColor(SSD1306_WHITE); // Warna teks
  display.setCursor(0, 0);     // Posisi awal teks (x=0, y=0)
  display.println("Hello, World!");
  display.println("ini coba nampilin lagi ya");
  display.println("ESP32 + OLED");

  // Tampilkan teks di layar
  display.display();
}

void loop() {
  // Tidak ada yang dilakukan di loop
}