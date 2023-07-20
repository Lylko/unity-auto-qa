package com.solvd.unity.scenes;

import com.alttester.AltObject;

public class SampleScene extends BaseScene {

    public SampleScene() {
        setSceneName("SampleScene");
    }

    public boolean isScenePresent() {
        return getMoveLeftButton() != null && getMoveRightButton() != null && getJumpButton() != null;
    }

    public AltObject getMoveRightButton() {
        return getObjectByName("RightButton");
    }

    public AltObject getMoveLeftButton() {
        return getObjectByName("LeftButton");
    }

    public AltObject getJumpButton() {
        return getObjectByName("UpButton");
    }

}
