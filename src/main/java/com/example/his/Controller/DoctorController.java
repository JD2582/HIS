package com.example.his.Controller;

import com.example.his.Entity.Doctor;
import com.example.his.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


@RestController
@RequestMapping("/his")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    public static String uploadingDirectory=System.getProperty("user.dir")+ "/src/main/images/";

    @PostMapping("/addDoctor")
    public Doctor saveDoctor(@ModelAttribute Doctor doctor, @RequestParam("image") MultipartFile file) throws IOException {
        String originalFilename= file.getOriginalFilename();
        System.out.println("File-path:"+originalFilename);
        System.out.println("From system property:"+System.getProperty("user.dir")+originalFilename);
        Path fileNameAndPath = Path.of(uploadingDirectory + file.getOriginalFilename());
        Files.write(fileNameAndPath, file.getBytes());
        doctor.setProfileImage(originalFilename);
        Doctor savedDoctorData= doctorService.saveDoctorData(doctor);


        return savedDoctorData;
    }

    @GetMapping("/viewDoctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

}
