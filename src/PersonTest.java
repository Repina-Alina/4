import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class PersonTest {
    @Test
    public void testPersonInitialization() {
        Division division = new Division(1, "HR");
        Person person = new Person(1, "John Doe", "Male", LocalDate.of(1990, 1, 1), division, 50000.0);

        assertEquals(1, person.id);
        assertEquals("John Doe", person.name);
        assertEquals("Male", person.gender);
        assertEquals(LocalDate.of(1990, 1, 1), person.birthDate);
        assertEquals(division, person.division);
        assertEquals(50000.0, person.salary);
    }

    @Test
    public void testGetInfo() {
        Division division = new Division(1, "HR");
        Person person = new Person(1, "Jane Doe", "Female", LocalDate.of(1995, 5, 15), division, 60000.0);

        String expectedInfo = "Id:1, Name: Jane Doe, Gender: Female, Birth Date: 1995-05-15, Division ID: 1, Division Name: HR, Salary: 60000.0";
        assertEquals(expectedInfo, person.getInfo());
    }
}
