#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define SCREEN_WIDTH 128
#define SCREEN_HEIGHT 64
#define OLED_RESET -1
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);

void setup() {
  display.begin(SSD1306_SWITCHCAPVCC, 0x3C);
  display.clearDisplay();
}

void loop() {
  lookCenter();
  delay(500);
  blinkEyes();
  delay(300);
  lookLeft();
  delay(500);
  lookRight();
  delay(500);
}

void drawEye(int x, int y, int pupilX, int pupilY) {
  display.clearDisplay();
  
  // Mata kiri
  display.drawCircle(x, y, 20, SSD1306_WHITE);         // Bola mata
  display.fillCircle(x + pupilX, y + pupilY, 5, SSD1306_WHITE); // Pupil

  // Mata kanan
  display.drawCircle(x + 60, y, 20, SSD1306_WHITE);    // Bola mata
  display.fillCircle(x + 60 + pupilX, y + pupilY, 5, SSD1306_WHITE); // Pupil

  display.display();
}

void blinkEyes() {
  display.clearDisplay();
  // Tutup mata (garis horizontal)
  display.drawLine(24, 32, 44, 32, SSD1306_WHITE);
  display.drawLine(84, 32, 104, 32, SSD1306_WHITE);
  display.display();
  delay(200);

  // Buka mata
  lookCenter();
}

void lookCenter() {
  drawEye(32, 32, 0, 0); // Pupil di tengah
}

void lookLeft() {
  drawEye(32, 32, -5, 0); // Pupil ke kiri
}

void lookRight() {
  drawEye(32, 32, 5, 0); // Pupil ke kanan
}
