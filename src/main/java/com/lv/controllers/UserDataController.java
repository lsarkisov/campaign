package com.lv.controllers;

import com.lv.entities.UserData;
import com.lv.services.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.lv.config.Api.API_URL;

@CrossOrigin
@RestController
@RequestMapping(API_URL + "/user")
public class UserDataController {
    @Autowired
    private UserDataService userDataService;

    @GetMapping("/all")
    public List<UserData> getAllUserData() {
        return userDataService.fetchAll();
    }

    @PostMapping("/new")
    public ResponseEntity addUserData(@RequestBody List<UserData> userData) {
        List<UserData> data = userDataService.addUserData(userData);
        if (data != null) {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
