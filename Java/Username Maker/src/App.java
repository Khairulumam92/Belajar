import java.util.Random;

public class RandomUsernameGenerator {
    public static void main(String[] args) throws Exception {
        System.out.println("Random Username: " + generateRandomUsername());
    }

    public static String generateRandomUsername() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String allChars = alphabet + digits;
        Random random = new Random();
        StringBuilder username = new StringBuilder();

        // Ensure the username starts with a letter
        username.append(alphabet.charAt(random.nextInt(alphabet.length())));

        // Generate the rest of the username
        for (int i = 1; i < 8; i++) {
            username.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return username.toString();
    }
}
