package com.example.his.Service;

import com.example.his.Entity.Pharma;
import com.example.his.Entity.Receptionist;
import com.example.his.Repo.PharmaRepository;
import com.example.his.Repo.ReceptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Receptionservice {
    @Autowired
    private ReceptionRepository receptionRepository;

    public Receptionist saveReceptionistData(Receptionist receptionist){
        Receptionist savedReceptinist=receptionRepository.save(receptionist);
        return savedReceptinist;
    }
}
