package com.solvd.unity.scenes;

import com.alttester.AltObject;

public class DeathScene extends BaseScene {

    public DeathScene() {
        setSceneName("DeathScene");
    }

    public boolean isScenePresent() {
        return getStartSceneBtn() != null && getTryAgainBtn() != null;
    }

    public AltObject getStartSceneBtn() {
        return getObjectByText("START SCENE").getParent();
    }

    public AltObject getTryAgainBtn() {
        return getObjectByText("Try again!").getParent();
    }

}
