package Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.ios.IOSDriver;
import org.junit.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public IOSDriver driver;

    @BeforeClass
    public void init() throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions()
                // Device name (from simulator)
                .setDeviceName("iPhone 11")
                // iOS version
                .setPlatformVersion("16.4")
                // simulator UDID, use command
                // xcrun simctl list devices | grep "iPhone 11"
                // for finding the UDID
                .setUdid("simulator UDID")
                .setLocale("IL")
                .setApp("path/to/file.app");
        driver = new IOSDriver(
                // The default URL in Appium is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
    }
}
