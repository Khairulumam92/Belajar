public class ExceptionHandlingExample {
    public static void exceptionHandlingExample() {
        try {
            int divisionResult = divideNumbers(10, 0);
            System.out.println("Division result: " + divisionResult);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method untuk membagi dua angka
    public static int divideNumbers(int a, int b) {
        return a / b;
    }
}
