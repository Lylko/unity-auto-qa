package com.solvd.unity.scenes;

import com.alttester.AltObject;

public class StartScene extends BaseScene {

    public StartScene() {
        setSceneName("StartScene");
    }

    public boolean isScenePresent() {
        return getStartGameBtn() != null;
    }

    public AltObject getStartGameBtn() {
        return getObjectByText("Start Game").getParent();
    }

}
