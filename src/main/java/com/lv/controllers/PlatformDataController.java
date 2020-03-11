package com.lv.controllers;

import com.lv.entities.PlatformsData;
import com.lv.services.PlatformDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.lv.config.Api.API_URL;

@CrossOrigin
@RestController
@RequestMapping(API_URL + "/platform")
public class PlatformDataController {
    @Autowired
    private PlatformDataService platformDataService;

    @GetMapping("/all")
    public List<PlatformsData> getAllUserData() {
        return platformDataService.fetchAll();
    }

    @PostMapping("/new")
    public ResponseEntity addUserData(@RequestBody List<PlatformsData> platformsData) {
        List<PlatformsData> data = platformDataService.addUserData(platformsData);
        if (data != null) {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
