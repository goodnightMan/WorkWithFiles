package tests;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.apache.commons.io.FileUtils.readFileToString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class DocFileTest {
    @Test
    void docFile() throws IOException {
        String docFilePath = "./src/test/resources/files/fox.doc";
        String expectedData = "Red Fox looks for you!";
        String fileContent = readFileToString(new File(docFilePath), StandardCharsets.UTF_8);

        assertThat(fileContent, containsString(expectedData));
    }
}
