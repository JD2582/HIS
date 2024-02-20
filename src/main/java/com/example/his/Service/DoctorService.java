package com.example.his.Service;

import com.example.his.Dto.DoctorDTO;
import com.example.his.Entity.Doctor;
import com.example.his.Repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor saveDoctorData(Doctor doctor){
        Doctor savedDoctor=doctorRepository.save(doctor);
        return savedDoctor;
    }
//    public void Doctor(DoctorDTO doctorDTO) {
//        Doctor doctor = new Doctor();
//        doctor.setFirstName(doctorDTO.getFirstName());
//        doctor.setLastName(doctorDTO.getLastName());
//        doctor.setGender(doctorDTO.getGender());
//        doctor.setBirthDate(doctorDTO.getBirthDate());
//        doctor.setPhoneNumber(doctorDTO.getPhoneNumber());
//        doctor.setBloodGroup(doctorDTO.getBloodGroup());
//        doctor.setSpecialization(doctorDTO.getSpecialization());
//        doctor.setExperience(doctorDTO.getExperience());
//        doctor.setAddress(doctorDTO.getAddress());
//        doctor.setUpdatedAt(doctorDTO.getUpdatedAt());
//
//
//        doctorRepository.save(doctor);
//    }
}
