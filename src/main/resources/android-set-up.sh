adb uninstall com.lylko.solvd

#Install build from folder
adb install src/main/resources/build/test.apk

#Start application
adb shell am start -n com.lylko.solvd/com.unity3d.player.UnityPlayerActivity
