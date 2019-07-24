package com.example.nganhangmau.Service;

import com.example.nganhangmau.Entities.Nguoihienmau;
import com.example.nganhangmau.Repository.HienmauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HienmauServiceImpl implements HienmauService {

    private HienmauRepository hienmauRepository;
    @Autowired
    public void setHienmauRepository(HienmauRepository hienmauRepository){
        this.hienmauRepository=hienmauRepository;
    }

   /* @Override
    public Iterable<Nguoihienmau> findAll() {
        return hienmauRepository.findAll();
    }*/

    @Override
    public void save(Nguoihienmau nguoihienmau) {
        hienmauRepository.save(nguoihienmau);
    }

    @Override
    public Iterable<Nguoihienmau> search(String hoTen){
        return hienmauRepository.findByHoTen(hoTen);
    }

}
