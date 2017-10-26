package com.windylee.scene.repository;

import com.windylee.scene.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by windy on 17/4/22.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByUsernameAndPassword(String username, String password);

    List<User> findByPassword(String password);

    User findByUsername(String username);

}
