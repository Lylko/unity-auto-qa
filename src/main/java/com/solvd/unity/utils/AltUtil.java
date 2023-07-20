package com.solvd.unity.utils;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.InputActions.AltHoldParams;

public class AltUtil {

    protected static AltDriver driver;

    public AltObject getObjectByName(String name) {
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, name).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(2).build();
        return driver.waitForObject(params);
    }

    public AltObject getObjectByText(String text) {
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.TEXT, text).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(2).build();
        return driver.waitForObject(params);
    }

    public void holdButton(AltObject button, int duration) {
        driver.holdButton(new AltHoldParams.Builder(button.getScreenPosition()).withDuration(duration).build());
    }

}
