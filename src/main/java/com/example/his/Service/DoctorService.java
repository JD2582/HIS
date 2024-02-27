package com.example.his.Service;

import com.example.his.Dto.DoctorDTO;
import com.example.his.Entity.Doctor;
import com.example.his.Entity.Login;
import com.example.his.Repo.DoctorRepository;
import com.example.his.Repo.UserRepo;
import com.example.his.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private UserRepo userRepo;

    public Doctor saveDoctorData(Doctor doctor){
        doctor.setId(Utility.getUniqueUUID());
        Doctor savedDoctor=doctorRepository.save(doctor);

        String username= savedDoctor.getEmail();
        String password = "his@1234";

        String role="Doctor";
        Login login=new Login();
        login.setUsername(username);
        login.setPassword(password);
        login.setRole(role);
        login.setActive(true);
        login.setUserId(savedDoctor.getId());

        userRepo.save(login);


        return savedDoctor;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

}
