package com.solvd.unity;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.alttester.AltObject;
import com.alttester.position.Vector2;
import com.solvd.unity.objects.Player;
import com.solvd.unity.scenes.SampleScene;

public class SampleSceneTest extends BaseTest {

    @Test
    public void runSampleSceneTest() {
        SampleScene sampleScene = new SampleScene();
        sampleScene.load();
        Assert.assertTrue(sampleScene.isScenePresent(), "Sample scene is not present!");
    }

    @Test
    public void moveRightTest() {
        SampleScene sampleScene = new SampleScene();
        sampleScene.load();
        Player player = new Player();
        Vector2 startPosition = player.getPlayerWorldPosition();
        AltObject rightBtn = sampleScene.getMoveRightButton();
        holdButton(rightBtn, 2);
        Vector2 finishPosition = player.getPlayerWorldPosition();
        Assert.assertTrue(finishPosition.getX() > startPosition.getX(), "Player is not moving!");
    }
}
