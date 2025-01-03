public class InheritanceExample {
    public static void inheritanceExample() {
        Employee employee = new Employee("Alice", 30, "Engineer");
        employee.displayInfo();
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
