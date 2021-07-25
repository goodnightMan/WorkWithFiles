package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;

public class PdfFileTest {
    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/files/noname.pdf";
        String expectedData = "1234567890";
        PDF pdf = new PDF(new File(pdfFilePath));
        assertThat(pdf, containsText(expectedData));

    }
}
