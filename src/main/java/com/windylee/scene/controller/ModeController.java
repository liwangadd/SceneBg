package com.windylee.scene.controller;

import com.windylee.scene.entity.Scene;
import com.windylee.scene.repository.ModeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by windy on 17/4/22.
 */
@RestController()
@RequestMapping("/mode")
public class ModeController {

    @Autowired
    private ModeRepository modeRepository;

    @RequestMapping("/save")
    public Map<String, Object> saveModes(@RequestBody Scene scene) {
        System.out.println("save mode");
        modeRepository.save(scene);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", true);
        return result;
    }

    @RequestMapping("getModes")
    public List<Scene> findModesByUser(@RequestParam("user_id") int userId) {
        List<Scene> scenes = modeRepository.findAll();
        return scenes;
    }

    @RequestMapping("/get")
    public Scene getScenes() {
        Scene mScene = new Scene();
        mScene.setSceneName("name");
        mScene.setSceneDesc("desc");
        mScene.setAlarmVolume(10);
        mScene.setMediaVolume(10);
        mScene.setRingmode(10);
        mScene.setAutoRotate(1);
        mScene.setGprs(1);
        mScene.setId(1);
        mScene.setWifiname("wifiname");
        mScene.setType(1);
        mScene.setRingmode(1);
        mScene.setHour(10);
        mScene.setMinute(10);
        mScene.setLatitude(20);
        mScene.setLongitude(19);
        mScene.setWifi(1);
        mScene.setBluetooth(1);
        mScene.setRingUri("uri");
        mScene.setLightmode(1);
        mScene.setLightness(288);
        mScene.setUserId(10);

        return mScene;
    }

}
