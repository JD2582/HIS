package com.example.his.Service;
import com.example.his.Entity.Pharma;
import com.example.his.Repo.PharmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmaService {
    @Autowired
    private PharmaRepository pharmaRepository;

    public Pharma savePharmaData(Pharma pharma){
        Pharma savedPharma=pharmaRepository.save(pharma);
        return savedPharma;
    }

}
