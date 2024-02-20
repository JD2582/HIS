package com.example.his.Controller;

import com.example.his.Entity.Nurse;
import com.example.his.Entity.Pharma;
import com.example.his.Service.NurseService;
import com.example.his.Service.PharmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
@RestController
@RequestMapping("/his")
public class PharmaController {
    @Autowired
    private PharmaService pharmaService;

    public static String uploadingDirectory=System.getProperty("user.dir")+ "/src/main/images/";

    @PostMapping("/addPharma")
    public Pharma savePharma(@ModelAttribute Pharma pharma, @RequestParam("image") MultipartFile file) throws IOException {
        String originalFilename= file.getOriginalFilename();

        System.out.println("File-path:"+originalFilename);
        System.out.println("From system property:"+System.getProperty("user.dir")+originalFilename);
        Path fileNameAndPath = Path.of(uploadingDirectory + file.getOriginalFilename());
        Files.write(fileNameAndPath, file.getBytes());
        pharma.setProfileImage(originalFilename);
        Pharma savedPharmaData= pharmaService.savePharmaData(pharma);
        return savedPharmaData;
    }
}
