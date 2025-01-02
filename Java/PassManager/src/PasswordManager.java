import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Scanner;

public class PasswordManager {
    private static final String FILE_NAME = "passwords.txt";
    private static final String MASTER_PASSWORD = "khairul448"; // Set master password
    private static SecretKey secretKey;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        generateSecretKey();

        while (true) {
            System.out.println("=== Password Manager ===");
            System.out.println("1. Simpan Kata Sandi");
            System.out.println("2. Lihat Kata Sandi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (choice) {
                case 1:
                    savePassword(scanner);
                    break;
                case 2:
                    viewPasswords(scanner);
                    break;
                case 3:
                    System.out.println("Keluar dari program...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }

    private static void savePassword(Scanner scanner) throws Exception {
        System.out.print("Masukkan nama akun (contoh: Email, Facebook): ");
        String accountName = scanner.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String password = scanner.nextLine();

        String encryptedPassword = encrypt(password);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(accountName + ":" + encryptedPassword);
            writer.newLine();
            System.out.println("Kata sandi berhasil disimpan dengan enkripsi.");
        } catch (IOException e) {
            System.err.println("Gagal menyimpan kata sandi: " + e.getMessage());
        }
    }

    private static void viewPasswords(Scanner scanner) throws Exception {
        System.out.print("Masukkan kata kunci utama (master password): ");
        String inputPassword = scanner.nextLine();

        if (MASTER_PASSWORD.equals(inputPassword)) {
            System.out.println("Autentikasi berhasil. Menampilkan kata sandi:");
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(":");
                    String accountName = parts[0];
                    String encryptedPassword = parts[1];
                    String decryptedPassword = decrypt(encryptedPassword);
                    System.out.println("Akun: " + accountName + ", Kata Sandi: " + decryptedPassword);
                }
            } catch (IOException e) {
                System.err.println("Gagal membaca kata sandi: " + e.getMessage());
            }
        } else {
            System.out.println("Kata kunci utama salah.");
        }
    }

    private static void generateSecretKey() throws Exception {
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        byte[] key = sha.digest(MASTER_PASSWORD.getBytes("UTF-8"));
        secretKey = new SecretKeySpec(key, "AES");
    }

    private static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes, "UTF-8");
    }
}
