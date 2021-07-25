package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipFileTest {
    @Test
    void zipWithPasswordTest() throws ZipException, IOException {
        String zipFilePath = "./src/test/resources/files/5.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String password = "";
        String unzipFilePath = "./src/test/resources/files/unzip/1.txt";
        String expectedData = "Hi man";

        unzip(zipFilePath, unzipFolderPath, password);
        String actualData = readTextFromPath(unzipFilePath);
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void zipTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/files/WorkTest.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/1q.gif";
        String expectedData = "hello qa.guru students!";

        unzip(zipFilePath, unzipFolderPath);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

}
