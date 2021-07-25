package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readXlsxFromPath;

public class XmlFileTest {
    @Test
    void xlsTest() throws IOException {
        String xmlFilePath = "./src/test/resources/files/db-int.xls";
        String expectedData = "В этом документе собраны все тесты касающиеся целостности данных.";
        XLS xls = new XLS(new File(xmlFilePath));
        String actualData = xls.excel.getSheetAt(0).getRow(2).getCell(0).toString();
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void xlsxTest() {
        String xlsxFilePath = "./src/test/resources/files/circle.xlsx";
        String expectedData = "Тестовые данные";
        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}

/*
@Test
    void xlsTest() throws IOException {
        String xmlFilePath = "./src/test/resources/files/db-int.xls";
        String expectedData = "В этом документе собраны все тесты касающиеся целостности данных.";
        XLS xls = new XLS(new File(xmlFilePath));
        assertThat(xls, XLS.containsText(expectedData));
    }
 */