package com.solvd.unity.objects;

import com.alttester.AltObject;
import com.alttester.position.Vector2;
import com.solvd.unity.utils.AltUtil;

public class Player extends AltUtil {

    public AltObject getPlayer(){
        return getObjectByName("Player");
    }

    public Vector2 getPlayerScreenPosition(){
        return getPlayer().getScreenPosition();
    }

    public Vector2 getPlayerWorldPosition(){
        return getPlayer().getWorldPosition();
    }

}
