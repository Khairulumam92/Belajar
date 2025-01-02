import java.lang.reflect.Constructor;

class SampleClass {
    private String message;

    public SampleClass(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }
}

public class ReflectionConstructorExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = SampleClass.class;
            
            Constructor<?> constructor = clazz.getConstructor(String.class);

            Object sampleObject = constructor.newInstance("Hello, Reflection!");

            SampleClass sample = (SampleClass) sampleObject;
            sample.displayMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
