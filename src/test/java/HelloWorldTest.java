import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testMessage() {
        assertEquals("Hello from Maven Jenkins!", HelloWorld.message());
    }
}