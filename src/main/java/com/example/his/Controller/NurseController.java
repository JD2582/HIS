package com.example.his.Controller;
import com.example.his.Entity.Nurse;
import com.example.his.Service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
@RestController
@RequestMapping("/his")
public class NurseController {
    @Autowired
    private NurseService nurseService;

    public static String uploadingDirectory=System.getProperty("user.dir")+ "/src/main/images/";

    @PostMapping("/addNurse")
    public Nurse saveNurse(@ModelAttribute Nurse nurse, @RequestParam("image") MultipartFile file) throws IOException {
        String originalFilename= file.getOriginalFilename();
        System.out.println("File-path:"+originalFilename);
        System.out.println("From system property:"+System.getProperty("user.dir")+originalFilename);
        Path fileNameAndPath = Path.of(uploadingDirectory + file.getOriginalFilename());
        Files.write(fileNameAndPath, file.getBytes());
        nurse.setProfileImage(originalFilename);
        Nurse savedNurseData= nurseService.saveNurseData(nurse);
        return savedNurseData;
    }
}
