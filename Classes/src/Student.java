import java.util.Arrays;
import java.util.Set;

public class Student extends Person {
    float[] grades;
    Student() {
        super("Mr. Student", "C11000000");
        grades = new float[10];
    }
    Student(String name, String ULID) {
        super(name, ULID);
        grades = new float[10];
    }

    public String toString() {
        return super.toString() + Arrays.toString(grades);
    }
}
