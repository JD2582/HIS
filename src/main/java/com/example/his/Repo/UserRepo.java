package com.example.his.Repo;


import com.example.his.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Login, String> {
        //Login findByUsername(String username);
}

