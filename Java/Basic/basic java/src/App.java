public class App {
    public static void main(String[] args) throws Exception {
        // Contoh program pemula
        BasicExamples.basicExamples();

        // Contoh inheritance
        InheritanceExample.inheritanceExample();

        // Contoh interface
        InterfaceExample.interfaceExample();

        // Contoh exception handling
        ExceptionHandlingExample.exceptionHandlingExample();
    }
}

// Contoh class untuk contoh program pemula
class BasicExamples {
    public static void basicExamples() {
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

// Contoh class untuk inheritance
class InheritanceExample {
    public static void inheritanceExample() {
        Employee employee = new Employee("Alice", 30, "Engineer");
        employee.displayInfo();
    }
}

// Contoh class untuk interface
class InterfaceExample {
    public static void interfaceExample() {
        Car car = new Car();
        car.start();
        car.stop();
    }
}

// Contoh class untuk exception handling
class ExceptionHandlingExample {
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

// Contoh class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method untuk menampilkan informasi
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Contoh inheritance
class Employee extends Person {
    String jobTitle;

    Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle);
    }
}

// Contoh interface
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
}
