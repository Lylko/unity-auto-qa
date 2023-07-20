package com.solvd.unity.scenes;

import com.alttester.Commands.UnityCommand.AltLoadSceneParams;
import com.solvd.unity.utils.AltUtil;

public abstract class BaseScene extends AltUtil {

    private String sceneName;
    protected void setSceneName(String name) {
        this.sceneName = name;
    }

    public abstract boolean isScenePresent();

    public void load(){
        driver.loadScene(new AltLoadSceneParams.Builder(sceneName).build());
    }

}
