package com.solvd.unity;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.alttester.AltDriver;
import com.alttester.AltReversePortForwarding;
import com.solvd.unity.utils.AltUtil;
import com.zebrunner.carina.utils.R;

public abstract class BaseTest extends AltUtil {

    @BeforeSuite
    public static void downloadApp() throws IOException {
        String platformName = R.CONFIG.get("platform").toLowerCase();
        if ("android".equals(platformName)) {
            new ProcessBuilder("src/main/resources/android-set-up.sh").start();
        } else {
            System.out.printf("Looks like '%s' is not supported for automatic installation. Please make sure the " +
                    "app is already installed and enabled%n", platformName);
        }

    }

    @BeforeMethod
    public static void setUp() {
        AltReversePortForwarding.reversePortForwardingAndroid();
        driver = new AltDriver();
    }

    @AfterMethod
    public static void tearDown() throws Exception {
        driver.stop();
        AltReversePortForwarding.removeReversePortForwardingAndroid();
    }

}
