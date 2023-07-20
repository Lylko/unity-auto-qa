package com.solvd.unity;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.solvd.unity.scenes.DeathScene;
import com.solvd.unity.scenes.SampleScene;
import com.solvd.unity.scenes.StartScene;

public class DeathSceneTest extends BaseTest {

    @Test
    public void deathSceneTest() {
        DeathScene deathScene = new DeathScene();
        deathScene.load();
        Assert.assertTrue(deathScene.isScenePresent(), "Death scene is not present!");
    }

    @Test
    public void deathSceneButtonsTest() {
        DeathScene deathScene = new DeathScene();
        deathScene.load();
        Assert.assertTrue(deathScene.isScenePresent(), "Death scene is not present!");

        deathScene.getTryAgainBtn().click();
        SampleScene sampleScene = new SampleScene();
        Assert.assertTrue(sampleScene.isScenePresent(), "Sample scene is not present!");

        deathScene.load();
        Assert.assertTrue(deathScene.isScenePresent(), "Death scene is not present!");

        deathScene.getStartSceneBtn().click();
        StartScene startScene = new StartScene();
        Assert.assertTrue(startScene.isScenePresent(), "Start scene is not present!");
    }

    @Test
    public void deathTest() {
        SampleScene sampleScene = new SampleScene();
        sampleScene.load();
        holdButton(sampleScene.getMoveRightButton(), 2);
        sampleScene.getJumpButton().click();
        holdButton(sampleScene.getMoveRightButton(), 4);

        DeathScene deathScene = new DeathScene();
        Assert.assertTrue(deathScene.isScenePresent(), "Death scene is not present!");
    }
}
