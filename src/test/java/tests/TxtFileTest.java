package tests;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TxtFileTest {
    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/1.txt";
        String expectedData = "Hi man!";
        String fileContent = FileUtils.readFileToString(new File(txtFilePath), StandardCharsets.UTF_8);
        assertThat(fileContent, containsString(expectedData));
    }

    @Test
    void csvTest() throws IOException {
        String csvFailPath = "./src/test/resources/files/1.csv";
        String expectedData = "Yahoo";
        String fileContent = FileUtils.readFileToString(new File(csvFailPath), StandardCharsets.UTF_8);
        assertThat(fileContent, containsString(expectedData));
    }
}

