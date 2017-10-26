package com.windylee.scene.repository;

import com.windylee.scene.entity.Scene;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by windy on 17/4/22.
 */
@Repository
public interface ModeRepository extends JpaRepository<Scene, Integer>{

}
