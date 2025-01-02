import java.lang.reflect.Constructor;

class Car {
    String model;

    // Constructor
    public Car(String model) {
        this.model = model;
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Mendapatkan Class object untuk Car
            Class<Car> carClass = Car.class;

            // Mendapatkan Constructor dengan parameter String
            Constructor<Car> constructor = carClass.getConstructor(String.class);

            // Membuat instance baru dari Car menggunakan Reflection
            Car myCar = constructor.newInstance("Honda");

            System.out.println("Model Mobil: " + myCar.model); // Output: Model Mobil: Honda
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
