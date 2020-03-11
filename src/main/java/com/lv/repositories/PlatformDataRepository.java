package com.lv.repositories;

import com.lv.entities.PlatformsData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformDataRepository extends JpaRepository<PlatformsData, Long> {
}
