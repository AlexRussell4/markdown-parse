import static org.junit.Assert.*; //imports assert

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*; //imports junit

public class MarkdownParseTest { //class declaration
    @Test //identifies a Test for junit
    public void addition() { //this is the method that is run for the test
        assertEquals(2, 1 + 1); //asserting that 2 = 1 + 1
    }

    @Test 
    public void testGetLinks() throws IOException,NoSuchFileException {
        Path fileName = Path.of("test-file.md");
        Path fileName2 = Path.of("new-file2.md");
        Path fileName3 = Path.of("new-file3.md");
        Path fileName4 = Path.of("new-file4.md");


        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(fileName)));
        //assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(fileName2)));
        //assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(fileName3)));
        //assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(fileName4)));
    }
}

