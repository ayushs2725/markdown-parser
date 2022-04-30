import static org.junit.Assert.*;
import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(3, 1 + 1);
    }

    @Test
    public void infinite()
    {
        assertEquals("", MarkdownParse.getLinks("test-file7"));
    }

}