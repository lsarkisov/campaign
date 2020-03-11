package com.lv.services;

import com.lv.entities.PlatformsData;
import com.lv.repositories.PlatformDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformDataService {
  @Autowired private PlatformDataRepository platformDataRepository;

  public List<PlatformsData> fetchAll() {
    return platformDataRepository.findAll();
  }

  public List<PlatformsData> addUserData(List<PlatformsData> userData) {
    return platformDataRepository.saveAll(userData);
  }
}
