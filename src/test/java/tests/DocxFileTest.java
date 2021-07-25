package tests;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.apache.commons.io.FileUtils.readFileToString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class DocxFileTest {
    @Test
    void docFile() throws IOException {
        String docxFilePath = "./src/test/resources/files/rabbit.docx";
        String expectedData = "We are glad to see you!";
        String fileContent = readFileToString(new File(docxFilePath), StandardCharsets.UTF_8);

        assertThat(fileContent, containsString(expectedData));
    }

}

