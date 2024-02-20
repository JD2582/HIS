package com.example.his.Service;

import com.example.his.Entity.Nurse;
import com.example.his.Entity.Patient;
import com.example.his.Repo.NurseRepository;
import com.example.his.Repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatientData(Patient patient){
        Patient savedPatient=patientRepository.save(patient);
        return savedPatient;
    }
}
