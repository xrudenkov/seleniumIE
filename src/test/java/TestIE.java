import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

import static org.openqa.selenium.ie.InternetExplorerDriver.*;

public class TestIE {

    @Test
    public static void test() throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.setCapability("ie.fileUploadDialogTimeout", "10000");
        options.setCapability(IGNORE_ZOOM_SETTING, true);
        options.setCapability(INITIAL_BROWSER_URL, "https://dropmefiles.com/");
        options.setCapability(IE_ENSURE_CLEAN_SESSION, true);
        WebDriver driver = new InternetExplorerDriver(options);
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        String filePath = System.getProperty("user.dir") + "\\web.xml";
        element.sendKeys(filePath);
        Thread.sleep(1010100);
    }
}
