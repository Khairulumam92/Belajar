#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_RESET    -1
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);

int pupilOffsetX = 0;
int direction = 1;

void setup() {
  display.begin(SSD1306_SWITCHCAPVCC, 0x3C);
  display.clearDisplay();
}

void loop() {
  drawEye(pupilOffsetX);
  delay(100);
  
  // Gerakan pelan kiri-kanan
  pupilOffsetX += direction;
  if (pupilOffsetX > 10 || pupilOffsetX < -10) {
    direction *= -1;
  }

  // Simulasi berkedip setiap beberapa detik
  static unsigned long lastBlink = 0;
  if (millis() - lastBlink > 4000) {
    blinkEye();
    lastBlink = millis();
  }
}

void drawEye(int offsetX) {
  display.clearDisplay();
  
  // Mata kiri (oval vertikal)
  display.fillRoundRect(24, 16, 30, 40, 15, SSD1306_WHITE);
  display.fillCircle(24 + 15 + offsetX, 36, 6, SSD1306_BLACK); // Pupil hitam

  // Mata kanan
  display.fillRoundRect(74, 16, 30, 40, 15, SSD1306_WHITE);
  display.fillCircle(74 + 15 + offsetX, 36, 6, SSD1306_BLACK); // Pupil hitam

  display.display();
}

void blinkEye() {
  display.clearDisplay();

  // Tutup mata (garis horizontal)
  display.fillRect(24, 34, 30, 4, SSD1306_WHITE);
  display.fillRect(74, 34, 30, 4, SSD1306_WHITE);

  display.display();
  delay(150); // Kedipan cepat

  drawEye(pupilOffsetX); // Kembali ke tampilan normal
}
