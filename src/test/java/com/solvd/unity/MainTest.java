package com.solvd.unity;

import com.alttester.AltDriver;
import com.alttester.AltReversePortForwarding;
import com.alttester.Commands.UnityCommand.AltLoadSceneParams;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class MainTest {

    private static AltDriver altDriver;

    @BeforeTest
    public static void setUp() throws IOException {
        AltReversePortForwarding.reversePortForwardingAndroid();
        altDriver = new AltDriver();
    }

    @AfterTest
    public static void tearDown() throws Exception {
        altDriver.stop();
        AltReversePortForwarding.removeReversePortForwardingAndroid();
    }

    @Test
    public void openClosePanelTest() {
        altDriver.loadScene(new AltLoadSceneParams.Builder("SampleScene").build());

//        AltFindObjectsParams altFindObjectsParametersCamera = new AltFindObjectsParams.Builder(
//                AltDriver.By.PATH, "//Main Camera")
//                .build();
//        AltObject camera = altDriver.findObject(altFindObjectsParametersCamera);
//
//        AltFindObjectsParams closeButtonObjectsParameters = new AltFindObjectsParams.Builder(
//                AltDriver.By.NAME, "Close Button")
//                .withCamera(AltDriver.By.ID, String.valueOf(camera.id))
//                .build();
//        altDriver.findObject(closeButtonObjectsParameters).tap();
//
//        AltFindObjectsParams buttonObjectsParameters = new AltFindObjectsParams.Builder(
//                AltDriver.By.NAME, "Button")
//                .withCamera(AltDriver.By.ID, String.valueOf(camera.id))
//                .build();
//        altDriver.findObject(buttonObjectsParameters).tap();
//
//        AltFindObjectsParams panelObjectsParameters = new AltFindObjectsParams.Builder(
//                AltDriver.By.NAME, "Panel")
//                .withCamera(AltDriver.By.ID, String.valueOf(camera.id))
//                .build();
//        AltWaitForObjectsParams panelWaitForObjectsParameters = new AltWaitForObjectsParams.Builder(
//                panelObjectsParameters).build();
//        AltObject panelElement = altDriver.waitForObject(panelWaitForObjectsParameters);

//        Assert.assertTrue(panelElement.isEnabled());
    }
}
