import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testDivisionInitialization() {
        Division division = new Division(1, "HR");

        assertEquals(1, division.id);
        assertEquals("HR", division.name);
    }

    @Test
    public void testGetInfo() {
        Division division = new Division(2, "Finance");

        String expectedInfo = "Division ID: 2, Name: Finance";
        assertEquals(expectedInfo, division.getInfo());
    }
}
