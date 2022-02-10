import static org.junit.Assert.*; //imports assert

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*; //imports junit

public class MarkdownParseTest { // class declaration
    Path fileName, fileName2, fileName3, fileName4, fileName5, fileName6, fileName7, fileName8;

    @Before
    public void setUp() {
        fileName = Path.of("test-file.md");
        /*
         * Path fileName2 = Path.of("new-file2.md");
         * Path fileName3 = Path.of("new-file3.md");
         * Path fileName4 = Path.of("new-file4.md");
         */
        fileName2 = Path.of("test-file2.md");
        fileName3 = Path.of("test-file3.md");
        fileName4 = Path.of("test-file4.md");
        fileName5 = Path.of("test-file5.md");
        fileName6 = Path.of("test-file6.md");
        fileName7 = Path.of("test-file7.md");
        fileName8 = Path.of("test-file8.md");

    }

    @Test // identifies a Test for junit
    public void addition() { // this is the method that is run for the test
        assertEquals(2, 1 + 1); // asserting that 2 = 1 + 1
    }

    @Test 
    public void doomedToFail() {
        assertEquals(2,1);
    }

    @Test
    public void testGetLinks() throws IOException, NoSuchFileException {
        assertEquals(List.of("https://something.com", "some-page.html"),
                MarkdownParse.getLinks(Files.readString(fileName)));
        // assertEquals(List.of("https://something.com", "some-page.html"),
        // MarkdownParse.getLinks(Files.readString(fileName2)));
        // assertEquals(List.of("https://something.com", "some-page.html"),
        // MarkdownParse.getLinks(Files.readString(fileName3)));
        // assertEquals(List.of("https://something.com", "some-page.html"),
        // MarkdownParse.getLinks(Files.readString(fileName4)));
    }

    @Test
    public void test2() throws IOException, NoSuchFileException {
        assertEquals(List.of("https://something.com", "some-page.html"),
                MarkdownParse.getLinks(Files.readString(fileName2)));

    }

    @Test
    public void test3() throws IOException, NoSuchFileException {
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(fileName3)));

    }

    @Test
    public void test4() throws IOException, NoSuchFileException {
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(fileName4)));

    }

    @Test
    public void test5() throws IOException, NoSuchFileException {

        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(fileName5)));

    }

    @Test
    public void test6() throws IOException, NoSuchFileException {
        assertEquals(List.of("page.com"), MarkdownParse.getLinks(Files.readString(fileName6)));

    }

    @Test
    public void test7() throws IOException, NoSuchFileException {
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(fileName7)));

    }

    @Test
    public void test8() throws IOException, NoSuchFileException {
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(Files.readString(fileName8)));

    }
}
