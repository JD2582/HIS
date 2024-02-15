package com.example.his.Controller;

import com.example.his.Dto.AddDataDTO;
import com.example.his.Dto.LoginDTO;
import com.example.his.Dto.UpdateDataDTO;
import com.example.his.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/his")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /*@Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }*/

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO) {
        if (loginService.authenticateUser(loginDTO.getUsername(), loginDTO.getPassword())) {
            return "Login successful!";
        } else {
            return "Login failed!";
        }
    }

    @PostMapping("/addData")
    public String addData(@RequestBody AddDataDTO addDataDTO) {
        loginService.addData(addDataDTO.getUsername(), addDataDTO.getPassword());
        return "Data added successfully!";
    }

    @DeleteMapping("/deleteData/{username}")
    public String deleteData(@PathVariable String username) {
        loginService.deleteData(username);
        return "Data deleted successfully!";
    }

    @PutMapping("/updateData/{username}")
    public String updateData(@PathVariable String username, @RequestBody UpdateDataDTO updateDataDTO) {
        loginService.updateData(username, updateDataDTO.getNewUsername(), updateDataDTO.getNewPassword());
        return "Data updated successfully!";
    }

}
