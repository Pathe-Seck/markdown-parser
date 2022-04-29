import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.*;


public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test 
    public void file1Checker() throws IOException {
        Path file = Path.of("test_file.md");
        String contents = Files.readString(file);
        String convertLinks = MarkdownParse.getLinks(contents).toString();

    }
}