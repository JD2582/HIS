package com.example.his.Service;

import com.example.his.Entity.Doctor;
import com.example.his.Entity.Nurse;
import com.example.his.Repo.DoctorRepository;
import com.example.his.Repo.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NurseService {
    @Autowired
    private NurseRepository nurseRepository;

    public Nurse saveNurseData(Nurse nurse){
        Nurse savedNurse=nurseRepository.save(nurse);
        return savedNurse;
    }
}
