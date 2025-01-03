public class BasicExamples {
    public static void basicExamples() {
        // Contoh program pemula
        System.out.println("Hello, World!");

        // Contoh variabel dan tipe data
        int number = 10;
        double decimal = 5.5;
        boolean isJavaFun = true;
        String greeting = "Hello, Java!";
        System.out.println(greeting + " Number: " + number + ", Decimal: " + decimal + ", Is Java Fun: " + isJavaFun);

        // Contoh kontrol alur: if-else
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }

        // Contoh kontrol alur: for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // Contoh array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Array element: " + num);
        }

        // Contoh method
        int result = addNumbers(5, 10);
        System.out.println("Result of addition: " + result);

        // Contoh class dan objek
        Person person = new Person("John", 25);
        person.displayInfo();
    }

    // Method untuk menambahkan dua angka
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
