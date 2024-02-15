package com.example.his.Service;

import com.example.his.Entity.Login;
import com.example.his.Repo.UserRepo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

import java.util.Optional;

@Service
public class LoginService {


    @Autowired
    private UserRepo userRepo;

    public boolean authenticateUser(String username, String password) {
        Optional<Login> user = null;
        //userRepo.findByUsername(username);
        user = userRepo.findById(username);
        return user.isPresent() && user.get().getPassword().equals(password);
    }

    public void addData(String username, String password) {
        Login login = new Login();
        login.setUsername(username);
        login.setPassword(password);
        userRepo.save(login);
    }

    public void deleteData(String username) {
        userRepo.deleteById(username);
    }
    private static final Logger log = LoggerFactory.getLogger(LoginService.class);

    public void updateData(String username, String newUsername, String newPassword) {

        System.out.println("Updating data for username: " + username);
        System.out.println("New username: " + newUsername + ", New password: " + newPassword);

        Login login = userRepo.findById(username).orElse(null);
        if (login != null) {
            if (newUsername != null) {
                login.setUsername(newUsername);
            }
            if (newPassword != null) {
                login.setPassword(newPassword);
            }
            userRepo.save(login);
        }
    }
}
