package com.solvd.unity;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.alttester.AltObject;
import com.solvd.unity.scenes.SampleScene;
import com.solvd.unity.scenes.StartScene;

public class StartSceneTest extends BaseTest {

    @Test
    public void startSceneTest() {
        StartScene startScene = new StartScene();
        startScene.load();
        Assert.assertTrue(startScene.isScenePresent(), "Start scene is not present!");
    }

    @Test
    public void pressStartGameTest() {
        StartScene startScene = new StartScene();
        startScene.load();
        AltObject startBtn = startScene.getStartGameBtn();
        startBtn.click();
        SampleScene sampleScene = new SampleScene();
        Assert.assertTrue(sampleScene.isScenePresent(), "Button is not clicked!");
    }
}
