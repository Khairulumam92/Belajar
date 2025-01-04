public class Person {
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
