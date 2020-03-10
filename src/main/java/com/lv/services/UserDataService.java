package com.lv.services;

import com.lv.entities.UserData;
import com.lv.repositories.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataService {
  @Autowired private UserDataRepository userDataRepository;

  public List<UserData> fetchAll() {
    return userDataRepository.findAll();
  }

  public List<UserData> addUserData(List<UserData> userData) {
    return userDataRepository.saveAll(userData);
  }
}
