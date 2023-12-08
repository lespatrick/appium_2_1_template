package Pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {
    final private FluentWait<IOSDriver> wait;
    protected IOSDriver driver;

    public BasePage(IOSDriver driver) {
        this.driver = driver;
        wait = new FluentWait<IOSDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
    }

    public void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
