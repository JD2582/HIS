package com.example.his.Controller;

import com.example.his.Dto.AddDataDTO;
import com.example.his.Dto.LoginDTO;
import com.example.his.Dto.UpdateDataDTO;
import com.example.his.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/his")
//public class LoginController {
//
//    @Autowired
//    private LoginService loginService;
//
//    /*@Autowired
//    public LoginController(LoginService loginService) {
//        this.loginService = loginService;
//    }*/
//
//    @PostMapping("/login")
//    public String login(@RequestBody LoginDTO loginDTO) {
//        if (loginService.authenticateUser(loginDTO.getUsername(), loginDTO.getPassword())) {
//            return "Login successful!";
//        } else {
//            return "Login failed!";
//        }
//    }
//
//    @PostMapping("/addData")
//    public String addData(@RequestBody AddDataDTO addDataDTO) {
//        loginService.addData(addDataDTO.getUsername(), addDataDTO.getPassword());
//        return "Data added successfully!";
//    }
//
//    @DeleteMapping("/deleteData/{username}")
//    public String deleteData(@PathVariable String username) {
//        loginService.deleteData(username);
//        return "Data deleted successfully!";
//    }
//
//    @PutMapping("/updateData/{username}")
//    public String updateData(@PathVariable String username, @RequestBody UpdateDataDTO updateDataDTO) {
//        loginService.updateData(username, updateDataDTO.getNewUsername(), updateDataDTO.getNewPassword());
//        return "Data updated successfully!";
//    }
//
//}

@RestController
@RequestMapping("/his")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO) {
        String username = loginDTO.getUsername();
        String password = loginDTO.getPassword();
        String role = loginDTO.getRole(); // Assuming role is provided during login

        if (loginService.authenticateUser(username, password, role)) {
            return "Login successful!";
        } else {
            return "Login failed!";
        }
    }

    @PostMapping("/addData")
    public String addData(@RequestBody AddDataDTO addDataDTO) {
        String username = addDataDTO.getUsername();
        String password = addDataDTO.getPassword();
        String role = addDataDTO.getRole(); // Assuming role is provided during data addition

        loginService.addData(username, password, role);
        return "Data added successfully!";
    }

    @DeleteMapping("/deleteData/{username}")
    public String deleteData(@PathVariable String username) {
        loginService.deleteData(username);
        return "Data deleted successfully!";
    }

    @PutMapping("/updateData/{username}")
    public String updateData(@PathVariable String username, @RequestBody UpdateDataDTO updateDataDTO) {
        String newUsername = updateDataDTO.getNewUsername();
        String newPassword = updateDataDTO.getNewPassword();
        String newRole = updateDataDTO.getNewRole(); // Assuming new role is provided during update

        loginService.updateData(username, newUsername, newPassword, newRole);
        return "Data updated successfully!";
    }
}

